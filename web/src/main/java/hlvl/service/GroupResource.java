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

public class GroupResource {

	private Group instance;
	private String id;
	private ResourceSaver resourceSaver;

	public GroupResource(Group instance, String id, ResourceSaver r) {
		this.instance = instance;
		this.id = id;
		resourceSaver = r;
	}

	@PermitAll
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public Group getGroup() {
		return instance;
	}

	@PermitAll
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void updateGroup(GroupImpl group) {
		resourceSaver.put(EcoreUtil.getIdentification(instance), group);
	}

	@PermitAll
	@DELETE
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void deleteGroup() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

	@Path("parent")
	public ElmDeclarationResource getResourceParent() {
		return new ElmDeclarationResource(instance.getParent(), id, resourceSaver);
	}

	@Path("children")
	public ListOfIDsResource getResourceChildren() {
		return new ListOfIDsResource(instance.getChildren(), id, resourceSaver);
	}

	@Path("max")
	public RangeResource getResourceMax() {
		return new RangeResource(instance.getMax(), id, resourceSaver);
	}

}
