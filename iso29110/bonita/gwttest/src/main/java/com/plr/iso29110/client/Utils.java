package com.plr.iso29110.client;

import org.bonitasoft.console.client.exceptions.ConsoleSecurityException;
import org.bonitasoft.console.client.exceptions.SessionTimeOutException;

import com.plr.iso29110.client.login.LoginWidget;
import com.plr.iso29110.client.widget.AlertWidget;

public class Utils {

	static public void errorManagement(Throwable caught) {

		if (caught instanceof SessionTimeOutException) {
			LoginWidget.getLogin(caught.getMessage()).center();
		} else if (caught instanceof ConsoleSecurityException) {
			new AlertWidget("Error", caught.getMessage()).center();

		} else {
			new AlertWidget("Error", caught.getMessage()).center();
		}
	}

	static public String appenParam(String main, String key, Object value) {

		if (main == null) {
			main = "";
		}

		if (main.isEmpty()) {

		} else {
			char last = main.charAt(main.length() - 1);

			switch (last) {
			case '&':
			case '/':

				break;

			default:
				main = main + '&';
				break;
			}
		}

		main = main + key + "=" + value;

		return main;
	}

}
