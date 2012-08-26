package com.plr.iso29110.server.bonita;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.List;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

import org.ow2.bonita.facade.exception.ActivityNotFoundException;
import org.ow2.bonita.facade.exception.IllegalTaskStateException;
import org.ow2.bonita.facade.exception.InstanceNotFoundException;
import org.ow2.bonita.facade.exception.ProcessNotFoundException;
import org.ow2.bonita.facade.exception.TaskNotFoundException;
import org.ow2.bonita.facade.exception.VariableNotFoundException;
import org.ow2.bonita.util.BonitaConstants;
import org.ow2.bonita.util.SimpleCallbackHandler;

import com.plr.iso29110.server.bonita.executor.BugRetriever;
import com.plr.iso29110.server.bonita.executor.BugValidator;
import com.plr.iso29110.server.bonita.executor.BugsToReview;
import com.plr.iso29110.server.bonita.executor.ProcessStarter;
import com.plr.iso29110.shared.Bug;

public class BonitaProcessManagement {
	public static final String BONITA_STORE = "BonitaStore";
	public static final String BONITA_STORE_USERNAME = "admin";
	public static final String BONITA_STORE_PASSWORD = "bpm";

//	private static final String jaasFile = "jaas-standard.cfg";
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
		// SecurityManager sm = System.getSecurityManager();
		//
		// System.setSecurityManager(null);
		// sm = System.getSecurityManager();

		// Configuration config = Configuration.getConfiguration();

		String config_class = AccessController.doPrivileged(new PrivilegedAction<String>() {
			@Override
			public String run() {
				return java.security.Security.getProperty("login.configuration.provider");
			}
		});

		final ClassLoader contextClassLoader = AccessController.doPrivileged(new PrivilegedAction<ClassLoader>() {
			@Override
			public ClassLoader run() {
				return Thread.currentThread().getContextClassLoader();
			}
		});

		final String finalClass = config_class;
		String extra_config = System.getProperty("java.security.auth.login.config");
		System.out.println("extra_config " + extra_config);
		
//		File dsaf = new File("");
		
//		try {
//			System.out.println(dsaf.getCanonicalPath());
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
//		Configuration configuration = null;
//		try {
//			configuration = AccessController.doPrivileged(new PrivilegedExceptionAction<Configuration>() {
//				@Override
//				public Configuration run() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//					return (Configuration) Class.forName(finalClass, true, contextClassLoader).newInstance();
//				}
//			});
//		} catch (PrivilegedActionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
		
//		loginContext = new LoginContext(BONITA_STORE, null, callbackHandler, configuration);
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

	public static void main(String[] args) throws Exception {
		BonitaProcessManagement bpm = new BonitaProcessManagement();
		bpm.getConnectTest();
	}
}
