package com.coffee.web.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.ws.rs.ext.Provider;

import com.coffee.hlvl.Model;
import com.coffee.web.entity.Configuration;
import com.google.common.collect.Lists;

import at.siemens.ct.jmz.ModelBuilder;
import at.siemens.ct.jmz.elements.BasicTypeInst;
import at.siemens.ct.jmz.elements.Variable;
import at.siemens.ct.jmz.elements.constraints.Constraint;
import at.siemens.ct.jmz.elements.solving.SolvingStrategy;
import at.siemens.ct.jmz.executor.Executor;
import at.siemens.ct.jmz.executor.MiniZincExecutor;
import at.siemens.ct.jmz.executor.MiniZincSolver;
import at.siemens.ct.jmz.expressions.Constant;
import at.siemens.ct.jmz.expressions.Expression;
import at.siemens.ct.jmz.expressions.array.IntegerArray;
import at.siemens.ct.jmz.expressions.bool.Forall;
import at.siemens.ct.jmz.expressions.bool.RelationalOperation;
import at.siemens.ct.jmz.expressions.bool.RelationalOperator;
import at.siemens.ct.jmz.expressions.comprehension.Generator;
import at.siemens.ct.jmz.expressions.comprehension.IteratorExpression;
import at.siemens.ct.jmz.expressions.integer.ArithmeticOperation;
import at.siemens.ct.jmz.expressions.integer.IntegerConstant;
import at.siemens.ct.jmz.expressions.integer.IntegerVariable;
import at.siemens.ct.jmz.expressions.set.RangeExpression;
import at.siemens.ct.jmz.expressions.set.SetExpression;
import at.siemens.ct.jmz.writer.ModelWriter;

//TODO
@Provider
public class CoffeeServiceImpl implements CoffeeService {

	static int counter = 0;

	public CoffeeServiceImpl(ConfigurationRepository repo) {
		this.repo = repo;
	}

	ConfigurationRepository repo;

	@Override
	public boolean isModelSatisfiable(Model m, String solverId) {

		return true;
	}

	@Override
	public Integer computeAllConfigurations(Model m, String solverId) {
		repo.putAll(counter++, new Configuration(), new Configuration());

		return counter;
	}

	@Override
	public String dummy(String solverName) {

		Optional<MiniZincExecutor> tentativeExecutor = Arrays.stream(MiniZincSolver.values())
				.filter((MiniZincSolver s) -> s.name().equals(solverName))
				.map((MiniZincSolver s) -> new MiniZincExecutor(s.name(), s)).findFirst();

		if (!tentativeExecutor.isPresent()) {
			return "no such executor";
		}
		Executor executor = tentativeExecutor.get();

		RangeExpression range = new RangeExpression(1, 10);

		IntegerVariable x = new IntegerVariable("x");
		IntegerVariable y = new IntegerVariable("y");
		Constant three = new IntegerConstant(3);
		Constant zero = new IntegerConstant(0);

		Constraint c1 = new Constraint(
				new RelationalOperation(ArithmeticOperation.plus(x, y), RelationalOperator.LT, three));
		Constraint c2 = new Constraint(new RelationalOperation(x, RelationalOperator.GT, zero));
		Constraint c3 = new Constraint(new RelationalOperation(y, RelationalOperator.GT, zero));

		ModelBuilder model = new ModelBuilder();
		model.add(x, y, c1, c2, c3);

		ModelWriter writer = new ModelWriter(model);
		writer.setSolvingStrategy(SolvingStrategy.SOLVE_SATISFY);

		try {
			executor.startProcess(writer);
			executor.waitForSolution();

		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.err.println(executor.getLastSolverErrors());

		Integer result1 = (Integer) x.parseResults(executor.getLastSolverOutput());
		Integer result2 = (Integer) y.parseResults(executor.getLastSolverOutput());

		return "solution of x+y<3: x=" + result1 + " y=" + result2;
	}

}
