package com.coffee.hlvl.service;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.eclipse.emf.ecore.util.EcoreUtil;
import javax.ws.rs.core.Response;
import webmapi.service.configuration.Wrapper;
import webmapi.util.ResourceSaver;
import org.jboss.resteasy.annotations.providers.jaxb.json.Mapped;
import org.jboss.resteasy.annotations.providers.jaxb.json.XmlNsMap;

import com.coffee.hlvl.*;
import com.coffee.hlvl.impl.*;

import javax.annotation.security.RolesAllowed;
import javax.annotation.security.PermitAll;

public class OrderResource {

	private Order instance;
	private String id;
	private ResourceSaver resourceSaver;

	public OrderResource(Order instance, String id, ResourceSaver r) {
		this.instance = instance;
		this.id = id;
		resourceSaver = r;
	}

	@PermitAll
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public Order getOrder() {
		return instance;
	}

	@PermitAll
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void updateOrder(OrderImpl order) {
		resourceSaver.put(EcoreUtil.getIdentification(instance), order);
	}

	@PermitAll
	@DELETE
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void deleteOrder() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

	@Path("left")
	public ElmDeclarationResource getResourceLeft() {
		return new ElmDeclarationResource(instance.getLeft(), id, resourceSaver);
	}

	@Path("right/{id}")
	public ListOfIDsResource getResourceRight(@PathParam("id") String id) {
		return new ListOfIDsResource(webmapi.service.IdentificationResolver.findListOfIDsById(instance.getRight(), id), id, resourceSaver);
	}

	// REF right

	@GET
	@Path("right")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getRight(@QueryParam("index") @DefaultValue("-1") int index) {
		if (index == -1) {
			Wrapper<ListOfIDs> entity = new Wrapper<ListOfIDs>(instance.getRight());
			return Response.ok(entity).build();
		} else
			return Response.ok(instance.getRight().get(index)).build();
	}

	@POST
	@Path("right")
	public void addRight(ListOfIDsImpl right, @DefaultValue("0") @QueryParam("index") int index) {
		instance.getRight().add(right);
		resourceSaver.save();
	}

}
