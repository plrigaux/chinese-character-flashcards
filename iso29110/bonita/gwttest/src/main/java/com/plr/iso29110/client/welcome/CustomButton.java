package com.plr.iso29110.client.welcome;

import com.google.gwt.user.client.ui.Button;
import com.plr.iso29110.client.widget.AppResources;

public class CustomButton extends Button {
	

	public CustomButton() {
		addStyleName(AppResources.INSTANCE.style().customButton());
	}

}
