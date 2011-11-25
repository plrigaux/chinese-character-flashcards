package com.plr.toastmasters.client.timer;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.plr.toastmasters.client.ApplicationConst;

public class Welcome extends Composite implements ApplicationConst {

	private static WelcomeUiBinder uiBinder = GWT.create(WelcomeUiBinder.class);

	interface WelcomeUiBinder extends UiBinder<Widget, Welcome> {
	}

	

	public Welcome() {
		initWidget(uiBinder.createAndBindUi(this));

		// browser.setText(HanziConstants.INSTANCE.charBrowser());
	}

	@UiHandler("tableTopics")
	void onTableTopicsClick(ClickEvent event) {
		History.newItem(TIMER + "/1:00_1:30_2:00");
	}

	@UiHandler("preparedSpeach")
	void onPreparedSpeachClick(ClickEvent event) {
		History.newItem(TIMER + "/5:00_6:00_7:00");
	}
	
	public static DialogBox alertWidget(final String header, final String content) {
		final DialogBox box = new DialogBox();
		final VerticalPanel panel = new VerticalPanel();
		box.setText(header);
		panel.add(new Label(content));
		final Button buttonClose = new Button("Close", new ClickHandler() {
			@Override
			public void onClick(final ClickEvent event) {
				box.hide();
			}
		});
		// few empty labels to make widget larger
		final Label emptyLabel = new Label("");
		emptyLabel.setSize("auto", "25px");
		panel.add(emptyLabel);
		panel.add(emptyLabel);
		buttonClose.setWidth("90px");
		panel.add(buttonClose);
		panel.setCellHorizontalAlignment(buttonClose, HasAlignment.ALIGN_RIGHT);
		box.add(panel);
		box.setGlassEnabled(true);
		return box;
	}
}
