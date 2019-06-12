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

public class PairResource {

	private Pair instance;
	private String id;
	private ResourceSaver resourceSaver;

	public PairResource(Pair instance, String id, ResourceSaver r) {
		this.instance = instance;
		this.id = id;
		resourceSaver = r;
	}

	@PermitAll
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public Pair getPair() {
		return instance;
	}

	@PermitAll
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void updatePair(PairImpl pair) {
		resourceSaver.put(EcoreUtil.getIdentification(instance), pair);
	}

	@PermitAll
	@DELETE
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void deletePair() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

	@Path("var1")
	public ElmDeclarationResource getResourceVar1() {
		return new ElmDeclarationResource(instance.getVar1(), id, resourceSaver);
	}

	@Path("var2")
	public ElmDeclarationResource getResourceVar2() {
		return new ElmDeclarationResource(instance.getVar2(), id, resourceSaver);
	}

}
