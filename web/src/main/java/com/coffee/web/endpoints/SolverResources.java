package com.coffee.web.endpoints;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.coffee.compiler.Solver;
import com.coffee.compiler.SolverType;

@Path("solvers")
public class SolverResources {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getOneSolver() {
		Solver solver = new Solver("cplex", "", SolverType.CSPSolver);

		return Response.ok(solver.toString()).build();

	}

}
