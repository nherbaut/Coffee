package com.coffee.web.endpoints;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.eclipse.xtext.util.XtextAdapterFactory;
import org.emfjson.jackson.resource.JsonResourceFactory;

import com.coffee.HlvlStandaloneSetup;
import com.coffee.hlvl.Model;
import com.coffee.web.entity.Configuration;
import com.coffee.web.service.CoffeeService;
import com.coffee.web.service.CoffeeServiceImpl;
import com.coffee.web.service.ConfigurationRepository;
import com.coffee.web.service.ConfigurationRepositoryImpl;
import com.coffee.web.utils.Utils;
import com.google.common.io.ByteStreams;
import com.google.common.io.Files;
import com.google.inject.Guice;
import com.google.inject.Injector;

@Path("models")
public class HLVLResource {

	// @Inject
	private ConfigurationRepository repo = new ConfigurationRepositoryImpl();
	// @Inject
	private CoffeeService service = new CoffeeServiceImpl(repo);

	private final static Random rand = new Random();

	@Path("dummy")
	@GET
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Response getJSON() throws IOException {
		String jsonStr = EMF2JSON(dummyModel);
		return Response.accepted(jsonStr).build();
	}

	@Path("dummy")
	@POST
	@Produces(value = { MediaType.TEXT_PLAIN })
	public Response useMinizinc(@QueryParam("solver_id") String solverId) throws IOException {
		return Response.ok(service.dummy(solverId)).build();
	}

	@Path("dummy")
	@GET
	@Produces(value = { MediaType.APPLICATION_XML })
	public Response getXMI() throws IOException {
		String xmlStr = EMF2XMI(dummyModel);
		return Response.accepted(xmlStr).build();
	}

	@POST
	@Consumes(value = { MediaType.APPLICATION_JSON })
	public Response acceptJson(String json, @QueryParam("solver_id") String solverId,
			@QueryParam("operation") String operation) throws IOException {

		Model e = JSON2EMF(json);

		if (operation.equals("configuration")) {
			Integer id = service.computeAllConfigurations(e, operation);
			return Response.created(java.net.URI.create("models/" + id)).build();
		}

		return Response.status(400, "unsupported operation" + operation).build();

	}

	@POST
	@Consumes(value = { MediaType.APPLICATION_XML })
	public Response acceptXML(String xml, @QueryParam("solver_id") String solverId,
			@QueryParam("operation") String operation) throws IOException {

		Model e = XMI2EMF(xml);
		Integer id = service.computeAllConfigurations(e, operation);

		return Response.created(java.net.URI.create("models/" + id)).build();
	}

	@GET
	@Path("{modelId}")

	public Response getConfiguration(@PathParam("modelId") Integer modelId) throws IOException {
		Set<Configuration> confs = this.repo.get(modelId);

		return Response.ok(confs.toString()).build();

	}

	private Model XMI2EMF(String xmi) throws IOException {

		File tempFile = File.createTempFile("data", "xmi");
		Files.asCharSink(tempFile, Charset.defaultCharset()).write(xmi);

		XMIResource resource = new XMIResourceImpl(URI.createFileURI(tempFile.getPath()));
		resource.load(null);
		Model m = (Model) resource.getContents().get(0);
		return m;
	}

	private String EMF2XMI(EObject e) {

		try {
			Injector injector = new HlvlStandaloneSetup().createInjectorAndDoEMFRegistration();
			ResourceSet rs = injector.getInstance(ResourceSet.class);
			File tempHlvl = File.createTempFile("data", "hlvl");
			Resource r = rs.createResource(URI.createURI(tempHlvl.getPath()));
			r.getContents().add(e);
			r.save(null);

			String jsonStr = Files.asCharSource(tempHlvl, Charset.defaultCharset()).readLines().stream().reduce("",
					(String s1, String s2) -> s1 + "\n" + s2);
			return jsonStr;

		} catch (IOException exp) {
			exp.printStackTrace();
		}
		return "ERROR";

	}

	private String EMF2DSL(EObject e) {
		try {

			String a = "";
			Object o = NodeModelUtils.findActualNodeFor(e);
			Object o2 = NodeModelUtils.findActualNodeFor(e);

			return NodeModelUtils.getNode(e).getText();
		} catch (Exception ee) {
			ee.printStackTrace();
			return "";
		}

	}

	private String EMF2JSON(Model mod) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());
		org.eclipse.emf.common.util.URI uri = URI.createFileURI(File.createTempFile("data", ".json").getPath());
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(mod);
		resource.save(null);

		java.nio.file.Path data = Paths.get(uri.toFileString());
		String jsonStr = Files.asCharSource(data.toFile(), Charset.defaultCharset()).readLines().stream().reduce("",
				(String s1, String s2) -> s1 + s2);
		return jsonStr;
	}

	private Model JSON2EMF(String json) {
		try {
			File tempFile = File.createTempFile("data", ".json");
			Files.asCharSink(tempFile, Charset.defaultCharset()).write(json);
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());
			Resource resource = resourceSet.createResource(URI.createFileURI(tempFile.getPath()));

			resource.load(null);

			Model m = (Model) resource.getContents().get(0);
			return m;
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-2);
			return null;
		}
	}

	private static final String dSLExample = "model EShop_Paper\n" + "elements:\n" + "	boolean connection\n"
			+ "	boolean secureConnection\n" + "	boolean insecureConnection\n"
			+ "	symbolic customerType variants: ['sporadic' , 'regular'] \n"
			+ "						 comment: {\"What is the customer type?\"}\n" + "	boolean customerProfile\n"
			+ "	boolean payment\n" + "	boolean payPal\n" + "	boolean SMS\n" + "	boolean card\n"
			+ "	boolean creditCard\n" + "	boolean giftCard\n" + "	boolean debitCard\n"
			+ "	instantiable [1,5] boolean  appServer\n" + "	instantiable [2,10] boolean serverMachines  \n"
			+ "	att integer confidentiality variants: 1..5\n" + "	att integer confidentialityBounded is 2\n"
			+ "	att integer certificateType variants: 1..5\n" + "	boolean productType\n" + "relations:\n"
			+ "	com1: common(customerType, payment)\n" + "	//mutex\n"
			+ "	m1: mutex(creditCard, insecureConnection) \n"
			+ "	m2: mutex(customerType='sporadic',[giftCard,creditCard])\n" + "	//implications \n"
			+ "	imp1:implies(payPal, secureConnection)\n"
			+ "	imp2: implies(customerType='regular', [secure,customerProfile])\n"
			+ "	imp3: [2, 4] appServer implies [1, 5] serverMachines\n" + "	//decompositions\n"
			+ "	dc1: decomposition(card, [giftCard, debitCard])<0>\n" + "	dc2: decomposition(card, [creditCard])<1>\n"
			+ "	att1:decomposition(payPal,[confidentiality,certificateType])<1>\n"
			+ "	att3:decomposition(card,[confidentiality,certificateType])<1>\n"
			+ "	g1: group(payment, [payPal, card])[1,*]\n"
			+ "	g2: group(connection, [secureConnection, insecureConnection])[1,1]\n" + "	//visibility\n"
			+ "	v1: visibility(productType = 'services', [VR1, VR2])\n" + "	// expression\n"
			+ "	exp1: expression(3 <= card.confidentiality AND \n"
			+ "                             card.confidentiality <= 5)";
	private static Model dummyModel;
	{
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new HlvlStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.hlvl"));

		InputStream in = new ByteArrayInputStream(dSLExample.getBytes());
		try {
			resource.load(in, resourceSet.getLoadOptions());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-2);
		}
		dummyModel = (Model) resource.getContents().get(0);

		System.out.println(EMF2DSL(dummyModel));
	}

}
