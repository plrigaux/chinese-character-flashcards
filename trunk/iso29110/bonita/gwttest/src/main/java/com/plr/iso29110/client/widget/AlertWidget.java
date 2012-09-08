package com.plr.iso29110.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

public class AlertWidget extends DialogBox {

	@UiField
	HTML contentLabel;

	@UiField
	Button close;

	private static final Binder uiBinder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, AlertWidget> {
	}

	public AlertWidget(final String header, final String content) {
		setWidget(uiBinder.createAndBindUi(this));

		setText(header);

		contentLabel.setHTML(content);

		setGlassEnabled(true);
	}

	@UiHandler("close")
	void onCloseClick(ClickEvent event) {
		this.hide();
	}
}