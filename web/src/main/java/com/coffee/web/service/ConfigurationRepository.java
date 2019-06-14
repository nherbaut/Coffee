package com.coffee.web.service;

import java.util.Set;

import com.coffee.web.entity.Configuration;

public interface ConfigurationRepository {

	void put(Integer id, Configuration c);

	void putAll(Integer id, Configuration... cs);

	Set<Configuration> get(Integer id);

}