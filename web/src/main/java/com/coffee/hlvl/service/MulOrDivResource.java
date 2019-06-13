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

public class MulOrDivResource {

	private MulOrDiv instance;
	private String id;
	private ResourceSaver resourceSaver;

	public MulOrDivResource(MulOrDiv instance, String id, ResourceSaver r) {
		this.instance = instance;
		this.id = id;
		resourceSaver = r;
	}

	@PermitAll
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public MulOrDiv getMulOrDiv() {
		return instance;
	}

	@PermitAll
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void updateMulOrDiv(MulOrDivImpl mulOrDiv) {
		resourceSaver.put(EcoreUtil.getIdentification(instance), mulOrDiv);
	}

	@PermitAll
	@DELETE
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void deleteMulOrDiv() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

	@Path("left")
	public RelationalResource getResourceLeft() {
		return new RelationalResource(instance.getLeft(), id, resourceSaver);
	}

	@Path("right")
	public RelationalResource getResourceRight() {
		return new RelationalResource(instance.getRight(), id, resourceSaver);
	}

}
