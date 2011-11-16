package com.plr.flashcard.client.view.welcome;

import com.google.gwt.user.client.ui.Button;
import com.plr.flashcard.client.AppResources;

public class CustomButton extends Button {
	

	public CustomButton() {
		addStyleName(AppResources.INSTANCE.style().customButton());
	}

}
