package com.coffee.hlvl.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "operations", namespace = "http://emf-rest.com/proxy")
@XmlAccessorType(XmlAccessType.FIELD)
public class OperationsProxy {

	String uri;
}
