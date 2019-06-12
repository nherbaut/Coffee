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

public class VarListResource {

	private VarList instance;
	private String id;
	private ResourceSaver resourceSaver;

	public VarListResource(VarList instance, String id, ResourceSaver r) {
		this.instance = instance;
		this.id = id;
		resourceSaver = r;
	}

	@PermitAll
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public VarList getVarList() {
		return instance;
	}

	@PermitAll
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void updateVarList(VarListImpl varList) {
		resourceSaver.put(EcoreUtil.getIdentification(instance), varList);
	}

	@PermitAll
	@DELETE
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void deleteVarList() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

	@Path("var1")
	public ElmDeclarationResource getResourceVar1() {
		return new ElmDeclarationResource(instance.getVar1(), id, resourceSaver);
	}

	@Path("list")
	public ListOfIDsResource getResourceList() {
		return new ListOfIDsResource(instance.getList(), id, resourceSaver);
	}

}
