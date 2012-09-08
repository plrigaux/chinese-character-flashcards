package com.plr.iso29110.server.login;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.bonitasoft.console.client.labels.LabelModel;
import org.bonitasoft.console.client.users.UserProfile;
import org.bonitasoft.console.security.client.users.User;
import org.bonitasoft.console.security.client.users.UserRights;
import org.bonitasoft.console.security.server.LoginServlet;

public class LoginHackServlet extends LoginServlet {

	@Override
	public User login(String username, String password, String appLocale) {

		User user = super.login(username, password, appLocale);

		if (user != null) {
			final HttpServletRequest request = this.getThreadLocalRequest();
			final HttpSession session = request.getSession();

			String aUsername = user.getUsername();
			boolean aIsAdmin = user.isAdmin();

			String aLocale = user.getLocale();

			UserRights aUserRights = user.getUserRights();

			boolean useCredentialTransmission = useCredentialsTransmission;

			List<LabelModel> aLabelList = new ArrayList<LabelModel>();

			UserProfile up = new UserProfile(aUsername, null, aIsAdmin, aLocale, aUserRights, useCredentialTransmission,
					aLabelList);

			session.setAttribute(LoginServlet.USER_PROFILE_SESSION_PARAM_KEY, up);
		}

		return user;
	}

}
