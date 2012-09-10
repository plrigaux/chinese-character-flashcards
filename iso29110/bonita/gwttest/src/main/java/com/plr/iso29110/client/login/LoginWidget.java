package com.plr.iso29110.client.login;

import org.bonitasoft.console.client.common.RpcConsoleServices;
import org.bonitasoft.console.client.identity.User;
import org.bonitasoft.console.client.login.ConsoleLoginServiceAsync;
import org.bonitasoft.console.client.users.UserProfile;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.plr.iso29110.client.widget.AlertWidget;

public class LoginWidget extends DialogBox {

	@UiField
	TextBox password;

	@UiField
	TextBox userName;

	@UiField
	Button login;

	@UiField
	Button close;

	@UiField
	Label errorMsg;

	private org.bonitasoft.console.security.client.users.User user = null;

	/**
	 * login service
	 */
	private final ConsoleLoginServiceAsync loginServiceAsync;

	private static final Binder uiBinder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, LoginWidget> {
	}

	private LoginWidget(String errorMessage) {
		if (errorMessage != null) {
			errorMsg.setText(errorMessage);
		}
		loginServiceAsync = RpcConsoleServices.getLoginService();
		setWidget(uiBinder.createAndBindUi(this));

		setText("Login");

		setGlassEnabled(true);
	}

	@UiHandler("close")
	void onCloseClick(ClickEvent event) {
		this.hide();
	}

	@UiHandler("login")
	void onLoginClick(ClickEvent event) {

		String us = userName.getText().trim();
		String ps = password.getText().trim();
		String appLocale = "en";
		loginServiceAsync.consoleLogin(us, ps, appLocale, new AsyncCallback<UserProfile>() {

			@Override
			public void onSuccess(UserProfile result) {
				System.out.println(result.getUsername());

				User u = result.getUser();

				user = new org.bonitasoft.console.security.client.users.User(u.getUsername(), result.isAdmin(), result
						.getLocale(), result.getUserRights(), false);

				LoginWidget.this.hide();

			}

			@Override
			public void onFailure(Throwable caught) {
				new AlertWidget("Error", caught.getMessage()).center();

			}
		});
	}

	public org.bonitasoft.console.security.client.users.User getUser() {
		return user;
	}

	private static LoginWidget lw = null;

	public static LoginWidget getLogin() {
		return getLogin(null);
	}

	public static LoginWidget getLogin(String loginMsg) {

		if (lw == null) {
			lw = new LoginWidget(loginMsg);
		}
		return lw;
	}
}