package com.coffee.web.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ext.Provider;

import com.coffee.web.entity.Configuration;
import com.google.common.collect.Sets;

@Provider
public class ConfigurationRepositoryImpl implements ConfigurationRepository {

	Map<Integer, Set<Configuration>> configurationMap = new HashMap<>();

	@Override
	public void put(Integer id, Configuration c) {
		configurationMap.put(id, Sets.newHashSet(c));
	}

	@Override
	public void putAll(Integer id, Configuration... cs) {
		configurationMap.put(id, Sets.newHashSet(cs));
	}

	@Override
	public Set<Configuration> get(Integer id) {
		return Sets.newHashSet(new Configuration(),new Configuration());
	}

}
