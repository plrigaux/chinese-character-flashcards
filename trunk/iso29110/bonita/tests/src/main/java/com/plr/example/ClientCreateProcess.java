package com.plr.example;

import javax.security.auth.login.LoginContext;

import org.ow2.bonita.facade.ManagementAPI;
import org.ow2.bonita.facade.QueryDefinitionAPI;
import org.ow2.bonita.facade.QueryRuntimeAPI;
import org.ow2.bonita.facade.RuntimeAPI;
import org.ow2.bonita.facade.def.majorElement.ProcessDefinition;
import org.ow2.bonita.facade.uuid.ProcessDefinitionUUID;
import org.ow2.bonita.util.AccessorUtil;
import org.ow2.bonita.util.BonitaConstants;
import org.ow2.bonita.util.BusinessArchiveFactory;
import org.ow2.bonita.util.ProcessBuilder;
import org.ow2.bonita.util.SimpleCallbackHandler;

/**
 * @author Elias Ricken de Medeiros
 * 
 */
public class ClientCreateProcess {

	private static final String PROCESS_VERSION = "1.0";
	private static final String PROCESS_NAME = "ProcessTest";
	private static final String LOGIN = "john";
	private static final String PSSWD = "bpm";
	private static final String jaasFile = "src/main/resources/jaas-standard.cfg";

	public static void main(String[] args) throws Exception {

		// set system properties
		System.setProperty(BonitaConstants.API_TYPE_PROPERTY, "REST");
		System.setProperty(BonitaConstants.REST_SERVER_ADDRESS_PROPERTY, "http://localhost:8080/bonita-server-rest/");
		System.setProperty(BonitaConstants.JAAS_PROPERTY, jaasFile);

		// login
		// verify the user exists
		LoginContext loginContext = new LoginContext("BonitaAuth", new SimpleCallbackHandler(LOGIN, PSSWD));
		loginContext.login();
		loginContext.logout();

		// propagate the user credentials
		loginContext = new LoginContext("BonitaStore", new SimpleCallbackHandler(LOGIN, PSSWD));
		loginContext.login();

		// get he APIs
		final ManagementAPI managementAPI = AccessorUtil.getManagementAPI();
		final RuntimeAPI runtimeAPI = AccessorUtil.getRuntimeAPI();
		final QueryRuntimeAPI queryRuntimeAPI = AccessorUtil.getQueryRuntimeAPI();
		final QueryDefinitionAPI queryDefinitionAPI = AccessorUtil.getQueryDefinitionAPI();

		try {

			// create a simple process with process builder:
			// - one step with LOGIN as actor
			// - a Global data of String Type

			for (ProcessDefinition pd : queryDefinitionAPI.getProcesses()) {
				System.out.println(pd);
			}

			ProcessDefinition process = queryDefinitionAPI.getProcess(new ProcessDefinitionUUID(PROCESS_NAME + "--" + PROCESS_VERSION));

			if (process != null) {
				managementAPI.deleteProcess(process.getUUID());
			}

			ProcessBuilder pb = ProcessBuilder.createProcess(PROCESS_NAME, PROCESS_VERSION);

			pb.addStringData("globalVar", "defaultValue");
			pb.addBooleanData("boolVar", false);

			pb.addHuman(LOGIN);
			pb.addHumanTask("step1", LOGIN);
			
			pb.addHumanTask("step2", LOGIN);
			pb.addHumanTask("step3", LOGIN);

			process = pb.done();

			// deploy process
			process = managementAPI.deploy(BusinessArchiveFactory.getBusinessArchive(process));

		} finally {
			// delete all deployed processes
			// managementAPI.deleteAllProcesses();
			loginContext.logout();
		}

	}

}