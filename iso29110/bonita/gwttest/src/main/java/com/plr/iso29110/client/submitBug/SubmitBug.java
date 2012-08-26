package com.plr.iso29110.client.submitBug;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.plr.iso29110.client.ApplicationConst;
import com.plr.iso29110.client.BugReportServiceAsync;
import com.plr.iso29110.shared.Bug;

public class SubmitBug extends Composite implements ApplicationConst {

	private static WelcomeUiBinder uiBinder = GWT.create(WelcomeUiBinder.class);

	interface WelcomeUiBinder extends UiBinder<Widget, SubmitBug> {
	}

	@UiField
	Button submit;
	
	
	@UiField
	TextBox project;
	
	@UiField
	TextBox version;
	
	@UiField
	TextBox summary;
	
	public SubmitBug() {
		initWidget(uiBinder.createAndBindUi(this));

		
	  
		
		
		
	}

	@UiHandler("submit")
	void onSubmit(ClickEvent event) {
Bug  bug = new Bug();
		
		bug.setProject(project.getText());
		bug.setSummary(summary.getText());
		bug.setVersion(version.getText());
		
		
		BugReportServiceAsync.Util.getInstance().submitBug(bug, new AsyncCallback<java.lang.Boolean>() {

			@Override
			public void onFailure(Throwable caught) {
					Window.alert(caught.getMessage());			
			}

			@Override
			public void onSuccess(Boolean result) {				
				History.newItem("");
			}
			
		});
	}

	
	
	
}
