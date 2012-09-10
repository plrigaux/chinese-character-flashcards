package com.plr.iso29110.client.main;

import org.bonitasoft.console.client.common.RpcConsoleServices;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.plr.iso29110.client.ApplicationConst;
import com.plr.iso29110.client.login.LoginWidget;
import com.plr.iso29110.client.widget.AlertWidget;

public class MainPanel extends Composite implements ApplicationConst {

	private static WelcomeUiBinder uiBinder = GWT.create(WelcomeUiBinder.class);

	interface WelcomeUiBinder extends UiBinder<Widget, MainPanel> {
	}

	@UiField
	HTMLPanel centerPanel;

	@UiField
	Button about;

	@UiField
	Button login;

	@UiField
	Button processInstances;

	@UiField
	Button processDefinitions;

	boolean loginTrigger = true;

	public MainPanel() {
		initWidget(uiBinder.createAndBindUi(this));

		LoginWidget.getLogin().setMainPanel(this);
		// browser.setText(HanziConstants.INSTANCE.charBrowser());
	}

	@UiHandler("login")
	void onLoginClick(ClickEvent event) {
		if (loginTrigger) {
			LoginWidget.getLogin().center();
		} else {
			RpcConsoleServices.getLoginService().logout(new AsyncCallback<Void>() {

				@Override
				public void onSuccess(Void result) {
					setLogin();
				}

				@Override
				public void onFailure(Throwable caught) {

					setLogin();
				}

			});
		}
	}

	@UiHandler("about")
	void onAboutClick(ClickEvent event) {
		alertWidget("About", "Developed by Pier Rigaux plrigaux@gmail.com based on the CEDICT").center();
	}

	@UiHandler("processDefinitions")
	void onProcessDefinitionsClick(ClickEvent event) {
		History.newItem(PROCESS_DEFINITIONS);
	}

	@UiHandler("processInstances")
	void onProcessInstancesClick(ClickEvent event) {
		History.newItem(PROCESS_INSTANCES);
	}

	public static DialogBox alertWidget(final String header, final String content) {
		final DialogBox box = new AlertWidget(header, content);

		return box;
	}

	public HTMLPanel getCenterPanel() {
		return centerPanel;
	}

	public void setLogout() {
		login.setText("Logout");
		loginTrigger = false;
	}

	private void setLogin() {
		login.setText("Login");
		loginTrigger = true;
	}
}
