package com.plr.iso29110.server.bonita;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ow2.bonita.facade.exception.ActivityDefNotFoundException;
import org.ow2.bonita.facade.exception.ActivityNotFoundException;
import org.ow2.bonita.facade.exception.DocumentationCreationException;
import org.ow2.bonita.facade.exception.IllegalTaskStateException;
import org.ow2.bonita.facade.exception.InstanceNotFoundException;
import org.ow2.bonita.facade.exception.ProcessNotFoundException;
import org.ow2.bonita.facade.exception.TaskNotFoundException;
import org.ow2.bonita.facade.exception.VariableNotFoundException;
import org.ow2.bonita.facade.runtime.Document;
import org.ow2.bonita.facade.uuid.DocumentUUID;
import org.ow2.bonita.util.AccessorUtil;
import org.ow2.bonita.util.BonitaConstants;
import org.ow2.bonita.util.SimpleCallbackHandler;

import com.plr.iso29110.server.bonita.executor.BugRetriever;
import com.plr.iso29110.server.bonita.executor.BugValidator;
import com.plr.iso29110.server.bonita.executor.BugsToReview;
import com.plr.iso29110.server.bonita.executor.DocumentGetter;
import com.plr.iso29110.server.bonita.executor.ProcessManager;
import com.plr.iso29110.server.bonita.executor.ProcessStarter;
import com.plr.iso29110.server.bonita.executor.TaskMangement;
import com.plr.iso29110.shared.BonitaProcessInstance;
import com.plr.iso29110.shared.BonitaTask;
import com.plr.iso29110.shared.Bug;
import com.plr.iso29110.shared.LightProcessDef;
import com.plr.iso29110.shared.ProcessDef;
import com.plr.iso29110.shared.Task;

public class BonitaProcessManagement {
	public static final String BONITA_STORE = "BonitaStore";
	public static final String BONITA_STORE_USERNAME = "admin";
	public static final String BONITA_STORE_PASSWORD = "bpm";

	// private static final String jaasFile = "jaas-standard.cfg";
	private static final String jaasFile = "src/main/resources/jaas-standard.cfg";

	static {
		System.setProperty(BonitaConstants.API_TYPE_PROPERTY, "REST");
		System.setProperty(BonitaConstants.REST_SERVER_ADDRESS_PROPERTY, "http://localhost:8080/bonita-server-rest/");
		System.setProperty(BonitaConstants.JAAS_PROPERTY, jaasFile);
	}

	private LoginContext loginContext;

	public void createBug(String project, String version, String summary) throws LoginException, ProcessNotFoundException,
			VariableNotFoundException {
		passUserToBosEngine();
		new ProcessStarter(project, version, summary).start();
		releaseBosEngine();
	}

	public List<Bug> listBugsToReview() throws LoginException {
		passUserToBosEngine();

		BugsToReview btr = new BugsToReview();

		List<Bug> bugs = btr.retrieve();
		releaseBosEngine();
		return bugs;
	}

	public void acceptBug(String taskId, String priority) throws LoginException, TaskNotFoundException,
			IllegalTaskStateException, InstanceNotFoundException, VariableNotFoundException {
		passUserToBosEngine();
		new BugValidator(taskId).accept(priority);
		releaseBosEngine();
	}

	public void rejectBug(String taskId) throws LoginException, TaskNotFoundException, IllegalTaskStateException,
			InstanceNotFoundException, VariableNotFoundException {
		passUserToBosEngine();
		new BugValidator(taskId).reject();
		releaseBosEngine();
	}

	public Bug getBug(String taskId) throws LoginException, ActivityNotFoundException, InstanceNotFoundException {
		passUserToBosEngine();
		Bug bug = new BugRetriever(taskId).retrieve();
		releaseBosEngine();

		return bug;
	}

	private void passUserToBosEngine() throws LoginException {
		SimpleCallbackHandler callbackHandler = new SimpleCallbackHandler(BONITA_STORE_USERNAME, BONITA_STORE_PASSWORD);

		loginContext = new LoginContext(BONITA_STORE, callbackHandler);
		loginContext.login();
	}

	private void releaseBosEngine() throws LoginException {
		loginContext.logout();
	}

	public void getConnectTest() throws LoginException {
		passUserToBosEngine();
		System.out.println("test");

		releaseBosEngine();

	}

	public void getDocument(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		passUserToBosEngine();

		new DocumentGetter().getDocument(req, resp);

		releaseBosEngine();
	}

	public static void main(String[] args) throws Exception {
		BonitaProcessManagement bpm = new BonitaProcessManagement();

		// String taskId =
		// "Bug_report--1.0--3--Review_bug--it1--mainActivityInstance--noLoop";
		//
		// Bug bug = bpm.getBug(taskId);

		// System.out.println(bug);

		String UUID = "7f5c81c0c0a800c61b33b7c4919975a5";

		Collection<BonitaProcessInstance> pi = bpm.getProcessInstances();

		bpm.passUserToBosEngine();

		Document d = AccessorUtil.getQueryRuntimeAPI().getDocument(new DocumentUUID(UUID));

		byte[] b = AccessorUtil.getQueryRuntimeAPI().getDocumentContent(new DocumentUUID(UUID));

		System.out.println(b);

		bpm.releaseBosEngine();

	}

	public Collection<BonitaProcessInstance> getProcessInstances() throws LoginException {
		passUserToBosEngine();
		Collection<BonitaProcessInstance> bonitaProcessInstances = new ProcessManager().getProcessInstances();
		releaseBosEngine();

		return bonitaProcessInstances;
	}

	public List<BonitaTask> getReadyTasks() throws LoginException {
		try {
			return getReadyTasks(null);
		} catch (InstanceNotFoundException e) {
			// not throwed
		}
		
		return new ArrayList<BonitaTask>();
	}

	public Task getTask(String taskId) throws LoginException, ActivityNotFoundException, InstanceNotFoundException,
			TaskNotFoundException, ActivityDefNotFoundException, ProcessNotFoundException {
		passUserToBosEngine();
		Task task = new TaskMangement(taskId).getTask();
		releaseBosEngine();

		return task;
	}

	public void creatateDocument(String name, String processInstanceUUID, String fileName, String mimeType, byte[] content) throws LoginException, DocumentationCreationException, InstanceNotFoundException {
		passUserToBosEngine();

		new DocumentGetter().createDocument(name, processInstanceUUID, fileName, mimeType, content);

		releaseBosEngine();

	}
	
	public void addDocumentVersion(String documentUUID, boolean isMajorVersion, String fileName, String mimeType, byte[] content) throws LoginException, DocumentationCreationException {
		passUserToBosEngine();

		new DocumentGetter().addDocumentVersion(documentUUID, isMajorVersion, fileName, mimeType, content);

		releaseBosEngine();

	}

	public Boolean execute(Task task) throws LoginException, TaskNotFoundException, IllegalTaskStateException, InstanceNotFoundException, VariableNotFoundException, ActivityNotFoundException {
		passUserToBosEngine();
		boolean val = new TaskMangement(task.getUUID()).executeTask(task);
		releaseBosEngine();
		
		return val;

	}

	public List<BonitaTask> getReadyTasks(String processInstanceId) throws LoginException, InstanceNotFoundException {
		passUserToBosEngine();
		List<BonitaTask> bonitaProcessInstances = new ProcessManager().getReadyTasks(processInstanceId);
		releaseBosEngine();

		return bonitaProcessInstances;
	}

	public List<LightProcessDef> getLightProcesses() throws LoginException {
		passUserToBosEngine();
		List<LightProcessDef> list = new ProcessManager().getDeployedProcess();
		releaseBosEngine();

		return list;
	}

	public ProcessDef getProcessDef(String processName, String processVersion) throws ProcessNotFoundException, LoginException {
		passUserToBosEngine();
		ProcessDef task = new ProcessManager().getProcess(processName, processVersion);
		releaseBosEngine();

		return task;
	}
}
