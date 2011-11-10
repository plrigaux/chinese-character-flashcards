package com.plr.flashcard.client.view.welcome;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class SVGButton extends Composite {
	private static SVGButtonUiBinder uiBinder = GWT
			.create(SVGButtonUiBinder.class);

	interface SVGButtonUiBinder extends UiBinder<Widget, SVGButton> {
	}

	@UiField
	Button clickMeButton;

	public SVGButton() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setText(String value) {
		clickMeButton.setText(value);
	}

	public HandlerRegistration addClickHandler(ClickHandler clickHandler) {
		return clickMeButton.addClickHandler(clickHandler);
	}
	
	public void addStyleNames(String style) {
		clickMeButton.addStyleName(style);
	}
	
	public void setWidth(String width) {
		clickMeButton.setWidth(width);
	}
}
