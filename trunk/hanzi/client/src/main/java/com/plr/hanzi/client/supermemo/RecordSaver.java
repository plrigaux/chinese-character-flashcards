package com.plr.hanzi.client.supermemo;

import com.google.gwt.core.client.GWT;
import com.google.web.bindery.autobean.shared.AutoBean;
import com.google.web.bindery.autobean.shared.AutoBeanCodex;
import com.google.web.bindery.autobean.shared.AutoBeanUtils;

public class RecordSaver {
	// Instantiate the factory
	RecordFactory factory = GWT.create(RecordFactory.class);

	String serializeToJson(Records recordMap) {
		// Retrieve the AutoBean controller
		AutoBean<Records> bean = AutoBeanUtils.getAutoBean(recordMap);
		
		String json = AutoBeanCodex.encode(bean).getPayload();
		
		return json;
	}

	Records deserializeFromJson(String json) {
		AutoBean<Records> bean = AutoBeanCodex.decode(factory, Records.class, json);
		return bean.as();
	}

}
