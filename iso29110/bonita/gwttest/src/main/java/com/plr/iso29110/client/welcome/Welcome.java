package com.plr.iso29110.client.welcome;

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
import com.plr.iso29110.client.ApplicationConst;

public class Welcome extends Composite implements ApplicationConst {

	private static WelcomeUiBinder uiBinder = GWT.create(WelcomeUiBinder.class);

	interface WelcomeUiBinder extends UiBinder<Widget, Welcome> {
	}

	@UiField
	CustomButton about;
	
	@UiField
	CustomButton submitBug;
	@UiField
	CustomButton bugsToReview;
	
	@UiField
	CustomButton processInstances;

	public Welcome() {
		initWidget(uiBinder.createAndBindUi(this));

		// browser.setText(HanziConstants.INSTANCE.charBrowser());
	}

	@UiHandler("about")
	void onAboutClick(ClickEvent event) {
		alertWidget("About", "Developed by Pier Rigaux plrigaux@gmail.com based on the CEDICT").center();
	}

	@UiHandler("bugsToReview")
	void onFlashcardsClick(ClickEvent event) {
		History.newItem(BUGS_TO_REVIEW);
	}

	@UiHandler("submitBug")
	void onBrowserClick(ClickEvent event) {
		History.newItem(SUBMIT_BUG);
	}
	
	@UiHandler("processInstances")
	void onProcessInstancesClick(ClickEvent event) {
		History.newItem(PROCESS_INSTANCES);
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
