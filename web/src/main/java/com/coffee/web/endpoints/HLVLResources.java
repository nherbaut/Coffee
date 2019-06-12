package com.coffee.web.endpoints;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe.internal.core.ast.util.Injector;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.coffee.HlvlStandaloneSetup;

import hlvl.Model;
import hlvl.impl.HlvlFactoryImpl;
import hlvl.impl.HlvlPackageImpl;
import hlvl.impl.ModelImpl;
import hlvl.proxy.ModelAdapter;
import hlvl.util.HlvlAdapterFactory;

@Path("hlvl")
public class HLVLResources {

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Model getHlvl() {

		Model m = HlvlFactoryImpl.init().createModel();
		m.setName("momo");
		return m;

	}

	@Path("dummy")
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Model getDummyHlvl() throws IOException {

		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		com.google.inject.Injector injector = new HlvlStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.hlvl"));
		InputStream in = new ByteArrayInputStream(example.getBytes());
		resource.load(in, resourceSet.getLoadOptions());
		Model model = (Model) resource.getContents().get(0);
		return model;

	}

	private static String example = "model EShop_Paper\n" + "elements:\n" + "	boolean connection\n"
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
			+ "                             card.confidentiality <= 5)\n" + "	\n" + "	\n" + "	";

}
