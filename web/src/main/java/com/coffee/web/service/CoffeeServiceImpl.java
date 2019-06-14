package com.coffee.web.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.ext.Provider;

import com.coffee.hlvl.Model;
import com.coffee.web.entity.Configuration;
import com.google.common.collect.Lists;

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

}
