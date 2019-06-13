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

public class ListOfListValuesResource {

	private ListOfListValues instance;
	private String id;
	private ResourceSaver resourceSaver;

	public ListOfListValuesResource(ListOfListValues instance, String id, ResourceSaver r) {
		this.instance = instance;
		this.id = id;
		resourceSaver = r;
	}

	@PermitAll
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public ListOfListValues getListOfListValues() {
		return instance;
	}

	@PermitAll
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void updateListOfListValues(ListOfListValuesImpl listOfListValues) {
		resourceSaver.put(EcoreUtil.getIdentification(instance), listOfListValues);
	}

	@PermitAll
	@DELETE
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void deleteListOfListValues() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

	@Path("list/{id}")
	public ListOfValuesResource getResourceList(@PathParam("id") String id) {
		return new ListOfValuesResource(webmapi.service.IdentificationResolver.findListOfValuesById(instance.getList(), id), id, resourceSaver);
	}

	// REF list

	@GET
	@Path("list")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getList(@QueryParam("index") @DefaultValue("-1") int index) {
		if (index == -1) {
			Wrapper<ListOfValues> entity = new Wrapper<ListOfValues>(instance.getList());
			return Response.ok(entity).build();
		} else
			return Response.ok(instance.getList().get(index)).build();
	}

	@POST
	@Path("list")
	public void addList(ListOfValuesImpl list, @DefaultValue("0") @QueryParam("index") int index) {
		instance.getList().add(list);
		resourceSaver.save();
	}

}
