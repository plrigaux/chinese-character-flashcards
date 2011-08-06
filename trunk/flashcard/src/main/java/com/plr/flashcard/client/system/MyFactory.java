package com.plr.flashcard.client.system;

import com.google.web.bindery.autobean.shared.AutoBean;
import com.google.web.bindery.autobean.shared.AutoBeanFactory;

public interface MyFactory extends AutoBeanFactory {

		  AutoBean<LeitnerSaver> person();
}
