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

public class MultInstantiationResource {

	private MultInstantiation instance;
	private String id;
	private ResourceSaver resourceSaver;

	public MultInstantiationResource(MultInstantiation instance, String id, ResourceSaver r) {
		this.instance = instance;
		this.id = id;
		resourceSaver = r;
	}

	@PermitAll
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public MultInstantiation getMultInstantiation() {
		return instance;
	}

	@PermitAll
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void updateMultInstantiation(MultInstantiationImpl multInstantiation) {
		resourceSaver.put(EcoreUtil.getIdentification(instance), multInstantiation);
	}

	@PermitAll
	@DELETE
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void deleteMultInstantiation() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

	@Path("name")
	public ElmDeclarationResource getResourceName() {
		return new ElmDeclarationResource(instance.getName(), id, resourceSaver);
	}

	@Path("min")
	public NumberResource getResourceMin() {
		return new NumberResource(instance.getMin(), id, resourceSaver);
	}

	@Path("max")
	public NumberResource getResourceMax() {
		return new NumberResource(instance.getMax(), id, resourceSaver);
	}

}
