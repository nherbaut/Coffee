package com.coffee.web.app;

import javax.inject.Singleton;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

import com.coffee.web.service.CoffeeService;
import com.coffee.web.service.CoffeeServiceImpl;
import com.coffee.web.service.ConfigurationRepository;
import com.coffee.web.service.ConfigurationRepositoryImpl;

public class MyApplicationBinder extends AbstractBinder {
	@Override
	protected void configure() {
		bind(CoffeeService.class).to(CoffeeServiceImpl.class).in(Singleton.class);
		bind(ConfigurationRepository.class).to(ConfigurationRepositoryImpl.class).in(Singleton.class);
	}
}