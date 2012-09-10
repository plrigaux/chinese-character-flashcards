package com.plr.iso29110.client;

import com.plr.iso29110.client.login.LoginWidget;
import com.plr.iso29110.client.widget.AlertWidget;

public class Utils {

	static public void errorManagement(Throwable caught) {
		if ("org.bonitasoft.console.client.exceptions.SessionTimeOutException".equals(caught.getClass().getName())) {
			LoginWidget.getLogin(caught.getMessage()).center();
		} else {
			new AlertWidget("Error", caught.getMessage()).center();
		}
	}
}
