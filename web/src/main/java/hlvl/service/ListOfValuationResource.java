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

public class ListOfValuationResource {

	private ListOfValuation instance;
	private String id;
	private ResourceSaver resourceSaver;

	public ListOfValuationResource(ListOfValuation instance, String id, ResourceSaver r) {
		this.instance = instance;
		this.id = id;
		resourceSaver = r;
	}

	@PermitAll
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public ListOfValuation getListOfValuation() {
		return instance;
	}

	@PermitAll
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void updateListOfValuation(ListOfValuationImpl listOfValuation) {
		resourceSaver.put(EcoreUtil.getIdentification(instance), listOfValuation);
	}

	@PermitAll
	@DELETE
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void deleteListOfValuation() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

	@Path("pairs/{id}")
	public ValuationResource getResourcePairs(@PathParam("id") String id) {
		return new ValuationResource(webmapi.service.IdentificationResolver.findValuationById(instance.getPairs(), id), id, resourceSaver);
	}

	// REF pairs

	@GET
	@Path("pairs")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getPairs(@QueryParam("index") @DefaultValue("-1") int index) {
		if (index == -1) {
			Wrapper<Valuation> entity = new Wrapper<Valuation>(instance.getPairs());
			return Response.ok(entity).build();
		} else
			return Response.ok(instance.getPairs().get(index)).build();
	}

	@POST
	@Path("pairs")
	public void addPairs(ValuationImpl pairs, @DefaultValue("0") @QueryParam("index") int index) {
		instance.getPairs().add(pairs);
		resourceSaver.save();
	}

}
