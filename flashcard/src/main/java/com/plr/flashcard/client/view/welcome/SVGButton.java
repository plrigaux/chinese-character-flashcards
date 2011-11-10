package com.plr.flashcard.client.view.welcome;

import org.vectomatic.dom.svg.OMSVGTextElement;
import org.vectomatic.dom.svg.ui.SVGPushButton;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class SVGButton extends Composite {
	private static SVGButtonUiBinder uiBinder = GWT.create(SVGButtonUiBinder.class);

	interface SVGButtonUiBinder extends UiBinder<Widget, SVGButton> {
	}

	@UiField
	SVGPushButton clickMeButton;

	@UiField
	OMSVGTextElement text;
	
	public SVGButton() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public void setText(String value) {
		this.text.getFirstChild().setNodeValue(value);
	}

	public void addClickHandler(ClickHandler clickHandler) {
		clickMeButton.addClickHandler(clickHandler);
	}
}
