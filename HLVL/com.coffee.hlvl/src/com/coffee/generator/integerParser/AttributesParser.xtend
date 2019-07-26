package com.coffee.generator.integerParser;

import com.coffee.generator.AbstractHLVLParser
import com.coffee.generator.Dialect

class AttributesParser  extends AbstractHLVLParser {
	
		new(String name) {
		super(name, Dialect.BASIC_INT)
		setTransformationRules(new AttributesTranformationRules())
	}
	
}