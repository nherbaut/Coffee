package com.coffee.hlvl.proxy;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import com.coffee.hlvl.Visibility;

import webmapi.service.IdentificationResolver;

public class VisibilityAdapter extends XmlAdapter<VisibilityProxy, Visibility> {
	static Properties config;
	static {
		config = new Properties();
		InputStream inputStream = ProxyFactory.class.getClassLoader().getResourceAsStream("config.properties");
		if (inputStream != null)
			try {
				config.load(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	@Override
	public VisibilityProxy marshal(Visibility arg0) throws Exception {

		VisibilityProxy d = ProxyFactory.createVisibilityProxy(arg0.eClass().getName());

		d.uri = getURL(arg0);
		return d;
	}

	@Override
	public Visibility unmarshal(VisibilityProxy arg0) throws Exception {
		return ProxyFactory.createVisibility(arg0);
	}

	public String getURL(Visibility obj) {
		Map<EObject, EReference> map = new HashMap<EObject, EReference>();
		String id = IdentificationResolver.getVisibilityId(obj);
		EObject temp = obj;
		while (temp.eContainer() != null) {
			map.put(temp.eContainer(), temp.eContainmentFeature());
			temp = temp.eContainer();
		}
		Set<Entry<EObject, EReference>> set = map.entrySet();
		List<Entry<EObject, EReference>> list = new ArrayList<Map.Entry<EObject, EReference>>(set);
		Collections.reverse(list);
		StringBuffer sb = new StringBuffer();
		sb.append(config.getProperty("url"));
		sb.append("/rest/");
		sb.append(config.getProperty("model"));
		sb.append("/");
		sb.append(config.getProperty("instance"));
		sb.append("/");
		for (Entry<EObject, EReference> entry : list) {
			sb.append(entry.getValue().getName() + "/");
		}
		if (!list.isEmpty())
			sb.append(id);
		return sb.toString();
	}
}
