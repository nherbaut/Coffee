package com.coffee.web.endpoints;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.coffee.compiler.Solver;
import com.coffee.compiler.SolverType;

import at.siemens.ct.jmz.executor.MiniZincSolver;

@Path("solvers")
public class SolverResources {

	@GET
	
	public Response getOneSolver() {

		java.util.List<Solver> solvers = Arrays.stream(MiniZincSolver.values())
				.map((MiniZincSolver s) -> new Solver(s.name(), "", SolverType.CSPSolver)).collect(Collectors.toList());
		String message=solvers.stream().map((Solver s) -> s.getName()+" ").collect(Collectors.joining(" "));
		return Response.ok(message).build();

	}

}
