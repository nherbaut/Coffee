package hlvl.service;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.eclipse.emf.ecore.util.EcoreUtil;
import javax.ws.rs.core.Response;
import webmapi.service.configuration.Wrapper;
import webmapi.util.ResourceSaver;
import org.jboss.resteasy.annotations.providers.jaxb.json.Mapped;
import org.jboss.resteasy.annotations.providers.jaxb.json.XmlNsMap;
import javax.annotation.security.RolesAllowed;
import javax.annotation.security.PermitAll;

import hlvl.*;
import hlvl.impl.*;

public class ModelResource {

	private Model instance;
	private String id;
	private ResourceSaver resourceSaver;

	public ModelResource(Model instance, String id, ResourceSaver r) {
		this.instance = instance;
		this.id = id;
		resourceSaver = r;
	}

	@PermitAll
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public Model getModel() {
		return instance;
	}

	@PermitAll
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void updateModel(ModelImpl model) {
		resourceSaver.put(EcoreUtil.getIdentification(instance), model);
	}

	@PermitAll
	@DELETE
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void deleteModel() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

	@Path("elements/{id}")
	public ElmDeclarationResource getResourceElements(@PathParam("id") String id) {
		return new ElmDeclarationResource(webmapi.service.IdentificationResolver.findElmDeclarationById(instance.getElements(), id), id, resourceSaver);
	}

	// REF elements

	@GET
	@Path("elements")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getElements(@QueryParam("index") @DefaultValue("-1") int index) {
		if (index == -1) {
			Wrapper<ElmDeclaration> entity = new Wrapper<ElmDeclaration>(instance.getElements());
			return Response.ok(entity).build();
		} else
			return Response.ok(instance.getElements().get(index)).build();
	}

	@POST
	@Path("elements")
	public void addElements(ElmDeclarationImpl elements, @DefaultValue("0") @QueryParam("index") int index) {
		instance.getElements().add(elements);
		resourceSaver.save();
	}

	@Path("relations/{id}")
	public RelDeclarationResource getResourceRelations(@PathParam("id") String id) {
		return new RelDeclarationResource(webmapi.service.IdentificationResolver.findRelDeclarationById(instance.getRelations(), id), id, resourceSaver);
	}

	// REF relations

	@GET
	@Path("relations")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getRelations(@QueryParam("index") @DefaultValue("-1") int index) {
		if (index == -1) {
			Wrapper<RelDeclaration> entity = new Wrapper<RelDeclaration>(instance.getRelations());
			return Response.ok(entity).build();
		} else
			return Response.ok(instance.getRelations().get(index)).build();
	}

	@POST
	@Path("relations")
	public void addRelations(RelDeclarationImpl relations, @DefaultValue("0") @QueryParam("index") int index) {
		instance.getRelations().add(relations);
		resourceSaver.save();
	}

	@Path("operations")
	public OperationsResource getResourceOperations() {
		return new OperationsResource(instance.getOperations(), id, resourceSaver);
	}

}
