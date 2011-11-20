package com.plr.hanzi.client.supermemo;

import com.google.web.bindery.autobean.shared.AutoBean;
import com.google.web.bindery.autobean.shared.AutoBeanFactory;

public interface RecordFactory extends AutoBeanFactory {
	AutoBean<Record> record();

	AutoBean<Record> recordMap();
}
