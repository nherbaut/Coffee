package com.coffee.web.service;

import java.util.List;

import com.coffee.hlvl.Model;
import com.coffee.web.entity.Configuration;

public interface CoffeeService {

	boolean isModelSatisfiable(Model m,String solverId);

	public Integer computeAllConfigurations(Model m,String solverId);
	
	public String dummy(String solverName);

}