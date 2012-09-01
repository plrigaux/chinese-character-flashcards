package com.plr.iso29110.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface AppResources extends ClientBundle {
	public static final AppResources INSTANCE = GWT.create(AppResources.class);

	@Source("./error.css")
	Style style();

	public interface Style extends CssResource {
		String error_text_box();

		String customButton();
	}
}
