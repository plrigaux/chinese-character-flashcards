package com.plr.example;

import java.util.Collection;

import javax.security.auth.login.LoginContext;

import org.ow2.bonita.facade.ManagementAPI;
import org.ow2.bonita.facade.QueryDefinitionAPI;
import org.ow2.bonita.facade.QueryRuntimeAPI;
import org.ow2.bonita.facade.RuntimeAPI;
import org.ow2.bonita.facade.def.majorElement.ProcessDefinition;
import org.ow2.bonita.facade.runtime.ActivityInstance;
import org.ow2.bonita.facade.runtime.ActivityState;
import org.ow2.bonita.facade.runtime.InstanceState;
import org.ow2.bonita.facade.runtime.ProcessInstance;
import org.ow2.bonita.facade.uuid.ProcessDefinitionUUID;
import org.ow2.bonita.facade.uuid.ProcessInstanceUUID;
import org.ow2.bonita.light.LightTaskInstance;
import org.ow2.bonita.util.AccessorUtil;
import org.ow2.bonita.util.BonitaConstants;
import org.ow2.bonita.util.BusinessArchiveFactory;
import org.ow2.bonita.util.ProcessBuilder;
import org.ow2.bonita.util.SimpleCallbackHandler;

/**
 * @author Elias Ricken de Medeiros
 * 
 */
public class Client {

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

			for (ProcessInstance pi : queryRuntimeAPI.getProcessInstances()) {
				System.out.println(pi);
			}

			for (ProcessDefinition pd : queryDefinitionAPI.getProcesses()) {
				System.out.println(pd);
			}

			ProcessDefinition process = queryDefinitionAPI.getProcess(new ProcessDefinitionUUID("myProcess--1.0"));

			if (process == null) {
				process = ProcessBuilder.createProcess("myProcess", "1.0").addStringData("globalVar", "defaultValue").addHuman(LOGIN)
						.addHumanTask("step1", LOGIN).done();

				// deploy process
				process = managementAPI.deploy(BusinessArchiveFactory.getBusinessArchive(process));
			}

			System.out.println("----------------\nProcess deployed\n----------------");

			final ProcessDefinitionUUID processUUID = process.getUUID();
			// instantiate process
			ProcessInstanceUUID instanceUUID = runtimeAPI.instantiateProcess(processUUID);
			System.out.println("----------------\nNew process instance Created\n----------------");

			
			
			
			final Collection<LightTaskInstance> taskList = queryRuntimeAPI.getLightTaskList(instanceUUID, ActivityState.READY);
			if (taskList.size() != 1) {
				throw new Exception("Incorrect list size. Actual size: " + taskList.size());
			}

			// execute task
			final LightTaskInstance taskInstance = taskList.iterator().next();
			runtimeAPI.executeTask(taskInstance.getUUID(), true);
			System.out.println("----------------\nTask executed\n----------------");

			final InstanceState state = queryRuntimeAPI.getProcessInstance(instanceUUID).getInstanceState();
			if (!state.equals(InstanceState.FINISHED)) {
				throw new Exception("Incorrect state. Actual state: " + state);
			}

			System.out.println("----------------\nApplication executed sucessfully\n----------------");

			
			for(ActivityInstance ai : queryRuntimeAPI.getActivityInstances(instanceUUID)) {
				System.out.println(ai);
				
				System.out.println(ai.getVariablesBeforeStarted());
				
				System.out.println(queryRuntimeAPI.getVariables(ai.getUUID()));
			}
			
		} finally {
			// delete all deployed processes
			// managementAPI.deleteAllProcesses();
			loginContext.logout();
		}

	}

}