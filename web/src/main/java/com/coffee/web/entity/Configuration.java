package com.coffee.web.entity;

public class Configuration {
	
	private static int staticId=0;
	int id;
	public Configuration() {
		this.id=staticId++;
	}
}
