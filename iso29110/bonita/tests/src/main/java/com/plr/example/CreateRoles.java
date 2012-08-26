package com.plr.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

import org.ow2.bonita.facade.IdentityAPI;
import org.ow2.bonita.facade.ManagementAPI;
import org.ow2.bonita.facade.QueryDefinitionAPI;
import org.ow2.bonita.facade.QueryRuntimeAPI;
import org.ow2.bonita.facade.RuntimeAPI;
import org.ow2.bonita.facade.exception.RoleAlreadyExistsException;
import org.ow2.bonita.facade.exception.RoleNotFoundException;
import org.ow2.bonita.facade.identity.Role;
import org.ow2.bonita.util.AccessorUtil;
import org.ow2.bonita.util.BonitaConstants;
import org.ow2.bonita.util.SimpleCallbackHandler;

public class CreateRoles {
	private static final String jaasFile = "src/main/resources/jaas-standard.cfg";
	private static final String LOGIN = "john";
	private static final String PSSWD = "bpm";

	final ManagementAPI managementAPI;
	final RuntimeAPI runtimeAPI;
	final QueryRuntimeAPI queryRuntimeAPI;
	final QueryDefinitionAPI queryDefinitionAPI;
	final IdentityAPI identityAPI;

	CreateRoles() {
		managementAPI = AccessorUtil.getManagementAPI();
		runtimeAPI = AccessorUtil.getRuntimeAPI();
		queryRuntimeAPI = AccessorUtil.getQueryRuntimeAPI();
		queryDefinitionAPI = AccessorUtil.getQueryDefinitionAPI();
		identityAPI = AccessorUtil.getIdentityAPI();
	}

	public static void main(String[] args) throws Exception {

		// set system properties
		System.setProperty(BonitaConstants.API_TYPE_PROPERTY, "REST");
		System.setProperty(BonitaConstants.REST_SERVER_ADDRESS_PROPERTY, "http://localhost:8080/bonita-server-rest/");
		System.setProperty(BonitaConstants.JAAS_PROPERTY, jaasFile);

		// login
		// verify the user exists
		// LoginContext loginContext = new LoginContext("BonitaAuth", new
		// SimpleCallbackHandler(LOGIN, PSSWD));
		// loginContext.login();
		// loginContext.logout();

		CreateRoles zeObj = new CreateRoles();

		try {
			zeObj.doStuff();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void doStuff() throws LoginException, RoleAlreadyExistsException, RoleNotFoundException {
		// propagate the user credentials
		LoginContext loginContext = new LoginContext("BonitaStore", new SimpleCallbackHandler(LOGIN, PSSWD));
		loginContext.login();

		List<Role> roles = identityAPI.getAllRoles();

		System.out.println(roles.size());

		Map<String, String> map = new HashMap<>();

		for (Role r : roles) {
			map.put(r.getName(), r.getUUID());
		}

		createRole(map, "AN", "Analyst", "Knowledge and experience eliciting, specifying and analyzing the requirements.\n" +
				"\nKnowledge in designing user interfaces and ergonomic criteria." +
				"\nKnowledge of the revision techniques." +
				"\nKnowledge of the editing techniques. " +
				"\nExperience on the software development and maintenance." );
		createRole(map, "CUS", "Customer", "");
		createRole(map, "DES", "Designer", "");
		createRole(map, "PR", "Programmer", "");
		createRole(map, "PM", "Project Manager", "");
		createRole(map, "TL", "Technical Leader", "");
		createRole(map, "WT", "Work Team", "Knowledge and experience according to their roles on the project: TL, AN, DES, and/or PR.<br/>Knowledge on the standards used by the Customer and/or by the VSE.");

		
		loginContext.logout();
	}

	private void createRole(Map<String, String> map, String name, String label, String description) throws RoleNotFoundException,
			RoleAlreadyExistsException {
		
		String roleUUID = map.get(name);

		if (roleUUID == null) {
			identityAPI.addRole(name, label, description);
		} else {
			identityAPI.updateRoleByUUID(roleUUID, name, label, description);
		}

	}
}
