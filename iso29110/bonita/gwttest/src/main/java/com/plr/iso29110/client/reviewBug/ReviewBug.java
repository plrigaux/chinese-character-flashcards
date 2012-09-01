package com.plr.iso29110.client.reviewBug;

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
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.plr.iso29110.client.ApplicationConst;
import com.plr.iso29110.client.BugReportServiceAsync;
import com.plr.iso29110.shared.Bug;

public class ReviewBug extends Composite implements ApplicationConst {

	private static WelcomeUiBinder uiBinder = GWT.create(WelcomeUiBinder.class);

	interface WelcomeUiBinder extends UiBinder<Widget, ReviewBug> {
	}

	@UiField
	Button accept;

	@UiField
	Button reject;
	
	@UiField
	Label project;

	@UiField
	Label version;

	@UiField
	Label summary;
	
	@UiField
	TextBox priority;

	public ReviewBug() {
		initWidget(uiBinder.createAndBindUi(this));
		
		
	
	}
	
	private String taskId = null;
	
	public void setTaskId(String taskId) {
		this.taskId = taskId;
		
		BugReportServiceAsync.Util.getInstance().retieveBug(taskId, new AsyncCallback<Bug> (){

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());
			}

			@Override
			public void onSuccess(Bug result) {
				System.out.println(result);
				if (result == null) {
					return;
				}
								
				project.setText(result.getProject());
				version.setText(result.getVersion());
				summary.setText(result.getSummary());
				priority.setText(result.getPriority());
			}		

		});

		
	}

	@UiHandler("accept")
	void onAccept(ClickEvent event) {
	
		BugReportServiceAsync.Util.getInstance().acceptBug(taskId, priority.getText(),  new AsyncCallback<java.lang.Boolean>() {

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

	@UiHandler("reject")
	void onReject(ClickEvent event) {
		BugReportServiceAsync.Util.getInstance().rejectBug(taskId,   new AsyncCallback<java.lang.Boolean>() {

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
