package com.plr.flashcard.client.system;

import com.google.gwt.core.client.GWT;
import com.google.web.bindery.autobean.shared.AutoBean;
import com.google.web.bindery.autobean.shared.AutoBeanCodex;
import com.google.web.bindery.autobean.shared.AutoBeanUtils;

public class LeitnerSaverFactory {
	// Instantiate the factory
	MyFactory factory = GWT.create(MyFactory.class);

	// In non-GWT code, use AutoBeanFactoryMagic.create(MyFactory.class);

	public LeitnerSaver createSaver() {
		// Construct the AutoBean
		AutoBean<LeitnerSaver> person = factory.person();

		// Return the Person interface shim
		return person.as();
	}

	public String serializeToJson(LeitnerSaver person) {
		// Retrieve the AutoBean controller
		AutoBean<LeitnerSaver> bean = AutoBeanUtils.getAutoBean(person);

		return AutoBeanCodex.encode(bean).getPayload();
	}

	public LeitnerSaver deserializeFromJson(String json) {
		AutoBean<LeitnerSaver> bean = AutoBeanCodex.decode(factory,
				LeitnerSaver.class, json);
		return bean.as();
	}
}
