package com.plr.example;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import javax.security.auth.login.LoginContext;

import org.ow2.bonita.facade.ManagementAPI;
import org.ow2.bonita.facade.QueryDefinitionAPI;
import org.ow2.bonita.facade.QueryRuntimeAPI;
import org.ow2.bonita.facade.RuntimeAPI;
import org.ow2.bonita.facade.def.element.BusinessArchive;
import org.ow2.bonita.facade.def.majorElement.ProcessDefinition;
import org.ow2.bonita.facade.exception.DeploymentException;
import org.ow2.bonita.facade.exception.IllegalTaskStateException;
import org.ow2.bonita.facade.exception.InstanceNotFoundException;
import org.ow2.bonita.facade.exception.ProcessNotFoundException;
import org.ow2.bonita.facade.exception.TaskNotFoundException;
import org.ow2.bonita.facade.exception.UndeletableInstanceException;
import org.ow2.bonita.facade.exception.UndeletableProcessException;
import org.ow2.bonita.facade.exception.VariableNotFoundException;
import org.ow2.bonita.facade.runtime.ActivityState;
import org.ow2.bonita.facade.runtime.InstanceState;
import org.ow2.bonita.facade.runtime.TaskInstance;
import org.ow2.bonita.facade.runtime.VariableUpdate;
import org.ow2.bonita.facade.uuid.ProcessDefinitionUUID;
import org.ow2.bonita.facade.uuid.ProcessInstanceUUID;
import org.ow2.bonita.util.AccessorUtil;
import org.ow2.bonita.util.BonitaConstants;
import org.ow2.bonita.util.BusinessArchiveFactory;
import org.ow2.bonita.util.SimpleCallbackHandler;

/**
 * @author Elias Ricken de Medeiros
 * 
 */
public class ManWalkedIntoaBar {

	private static final String LOGIN = "admin";
	private static final String PSSWD = "bpm";
	private static final String jaasFile = "src/main/resources/jaas-standard.cfg";
	private static final String BAR_FILE_PATH = "C:\\PL_Project\\BAR\\Order_a_beer--1.0.bar";

	final ManagementAPI managementAPI;
	final RuntimeAPI runtimeAPI;
	final QueryRuntimeAPI queryRuntimeAPI;
	final QueryDefinitionAPI queryDefinitionAPI;

	ManWalkedIntoaBar() {
		managementAPI = AccessorUtil.getManagementAPI();
		runtimeAPI = AccessorUtil.getRuntimeAPI();
		queryRuntimeAPI = AccessorUtil.getQueryRuntimeAPI();
		queryDefinitionAPI = AccessorUtil.getQueryDefinitionAPI();
	}

	private void doStuff() throws Exception {

		// login
		// verify the user exists
		LoginContext loginContext = new LoginContext("BonitaAuth", new SimpleCallbackHandler(LOGIN, PSSWD));
		loginContext.login();
		loginContext.logout();
		//
		// // propagate the user credentials
		loginContext = new LoginContext("BonitaStore", new SimpleCallbackHandler(LOGIN, PSSWD));
		loginContext.login();

		// get he APIs

		try {

			ProcessDefinition process = deployProcess(BAR_FILE_PATH);

			System.out.println("----------------\nNew process definition Created\n----------------");
			System.out.println(process.getName());

			final ProcessInstanceUUID instanceUUID = runtimeAPI.instantiateProcess(process.getUUID());
			System.out.println("----------------\nNew process instance Created\n----------------");

			new TaskExecutor(instanceUUID){
				void setVariable() throws InstanceNotFoundException, VariableNotFoundException {
					runtimeAPI.setProcessInstanceVariable(instanceUUID, "brand", "Budweiser");
				}
			}.executeTask();
			
			
			new TaskExecutor(instanceUUID).executeTask();

			// execute task

			// queryRuntimeAPI.getVariables(taskInstance.get)

			final InstanceState state = queryRuntimeAPI.getProcessInstance(instanceUUID).getInstanceState();
			if (!state.equals(InstanceState.FINISHED)) {
				throw new Exception("Incorrect state. Actual state: " + state);
			}

			System.out.println("----------------\nApplication executed sucessfully\n----------------");

		} finally {
			// delete all deployed processes
			// managementAPI.deleteAllProcesses();
			loginContext.logout();
		}
	}

	private class TaskExecutor {

		private final ProcessInstanceUUID instanceUUID;

		TaskExecutor(ProcessInstanceUUID instanceUUID) {
			this.instanceUUID = instanceUUID;
		}

		void executeTask() throws InstanceNotFoundException, TaskNotFoundException, IllegalTaskStateException, VariableNotFoundException {
			displayProcessVariable(instanceUUID);
			
			Collection<TaskInstance> taskList = queryRuntimeAPI.getTaskList(instanceUUID, ActivityState.READY);
			
			for (TaskInstance taskInstance : taskList) {
				System.out.println("task " + taskInstance.getActivityName());

				System.out.println("task vars " + taskInstance.getVariablesBeforeStarted());

				
				for (VariableUpdate variableUpdate : taskInstance.getVariableUpdates()) {
					System.out.println("task vars update " + variableUpdate.getName() + "=" + variableUpdate.getValue());
				}

				
				setVariable();

				runtimeAPI.executeTask(taskInstance.getUUID(), true);
				System.out.println("----------------\nTask executed\n----------------");

			}
			// displayProcessVariable(instanceUUID);
		}

		void setVariable() throws InstanceNotFoundException, VariableNotFoundException {
		}
	}

	private void displayProcessVariable(ProcessInstanceUUID instanceUUID) throws InstanceNotFoundException {
		System.out.println("---------------- Process Instance Variable");

		for (Map.Entry<String, Object> en : queryRuntimeAPI.getProcessInstanceVariables(instanceUUID).entrySet()) {
			System.out.println("" + en);
		}

		System.out.println("----------------");
	}

	public static void main(String[] args) throws Exception {

		// set system properties
		System.setProperty(BonitaConstants.API_TYPE_PROPERTY, "REST");
		System.setProperty(BonitaConstants.REST_SERVER_ADDRESS_PROPERTY, "http://localhost:8080/bonita-server-rest/");
		System.setProperty(BonitaConstants.JAAS_PROPERTY, jaasFile);

		// #@%$@#!
		System.setProperty("BONITA_HOME", "C:\\PL_Project\\BOS-5.6.2-Tomcat-6.0.33\\bonita");

		ManWalkedIntoaBar mwib = new ManWalkedIntoaBar();

		try {
			mwib.doStuff();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private ProcessDefinition deployProcess(String barFileName) throws IOException, ClassNotFoundException, ProcessNotFoundException,
			UndeletableProcessException, UndeletableInstanceException, DeploymentException {
		File barFile = new File(barFileName);
		BusinessArchive businessArchive = BusinessArchiveFactory.getBusinessArchive(barFile);

		ProcessDefinitionUUID processDefinitionUUID = businessArchive.getProcessUUID();

		ProcessDefinition process = null;
		try {
			process = queryDefinitionAPI.getProcess(processDefinitionUUID);
		} catch (ProcessNotFoundException e) {
		}

		if (process != null) {
			managementAPI.deleteProcess(processDefinitionUUID);
		}

		process = managementAPI.deploy(businessArchive);
		return process;
	}

}