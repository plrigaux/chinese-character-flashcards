package com.plr.iso29110.server;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.security.auth.login.LoginContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.bonitasoft.console.security.client.users.User;
import org.bonitasoft.console.security.server.LoginServlet;
import org.bonitasoft.forms.client.model.FormFieldValue;
import org.bonitasoft.forms.client.model.FormPage;
import org.bonitasoft.forms.client.model.TransientData;
import org.bonitasoft.forms.client.model.exception.CanceledFormException;
import org.bonitasoft.forms.client.model.exception.ForbiddenFormAccessException;
import org.bonitasoft.forms.client.model.exception.FormAlreadySubmittedException;
import org.bonitasoft.forms.client.model.exception.FormInErrorException;
import org.bonitasoft.forms.client.model.exception.MigrationProductVersionNotIdenticalException;
import org.bonitasoft.forms.client.model.exception.RPCException;
import org.bonitasoft.forms.client.model.exception.SessionTimeOutException;
import org.bonitasoft.forms.client.model.exception.SkippedFormException;
import org.bonitasoft.forms.client.model.exception.SuspendedFormException;
import org.bonitasoft.forms.server.FormsServlet;
import org.bonitasoft.forms.server.accessor.impl.util.FormDocument;
import org.bonitasoft.forms.server.api.FormAPIFactory;
import org.bonitasoft.forms.server.api.IFormDefinitionAPI;
import org.bonitasoft.forms.server.api.impl.util.FormFieldValuesUtil;
import org.bonitasoft.forms.server.provider.FormServiceProvider;
import org.bonitasoft.forms.server.provider.impl.util.FormServiceProviderFactory;
import org.bonitasoft.forms.server.provider.impl.util.FormServiceProviderUtil;

import com.plr.iso29110.client.BugReportService;
import com.plr.iso29110.server.bonita.BonitaProcessManagement;
import com.plr.iso29110.shared.BonitaProcessInstance;
import com.plr.iso29110.shared.BonitaTask;
import com.plr.iso29110.shared.Bug;
import com.plr.iso29110.shared.LightProcessDef;
import com.plr.iso29110.shared.ProcessDef;
import com.plr.iso29110.shared.Task;

public class BugReportServiceImp extends FormsServlet implements BugReportService {

    /**
     * Logger
     */
    private static Logger LOGGER = Logger.getLogger(BugReportServiceImp.class.getName());
    
    public static final String FORM_LOCALE_COOKIE_NAME = "Form_Locale";
	protected static SimpleDateFormat DATE_FORMAT;

    static {
        if (LOGGER.isLoggable(Level.FINER)) {
            DATE_FORMAT = new SimpleDateFormat("HH:mm:ss:SSS");
        }
    }
    
    /**
     * FormFieldValuesUtil
     */
    private FormFieldValuesUtil formFieldValuesUtil = new FormFieldValuesUtil();
    
	@Override
	public Boolean submitBug(Bug bug) {

		try {
			new BonitaProcessManagement().createBug(bug.getProject(), bug.getVersion(), bug.getSummary());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	



	@Override
	public List<Bug> listBugsToReview() {

		List<Bug> list = new ArrayList<Bug>();

		try {
			list = new BonitaProcessManagement().listBugsToReview();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public Boolean acceptBug(String taskId, String priority) {
		try {
			new BonitaProcessManagement().acceptBug(taskId, priority);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Boolean rejectBug(String taskId) {
		try {
			new BonitaProcessManagement().rejectBug(taskId);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Bug retieveBug(String taskId) {
		Bug bug = null;
		try {
			bug = new BonitaProcessManagement().getBug(taskId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bug;
	}

	@Override
	public Collection<BonitaProcessInstance> getProcessInstances() throws Exception {
		Collection<BonitaProcessInstance> bonitaProcessInstances = new BonitaProcessManagement().getProcessInstances();
		return bonitaProcessInstances;
	}

	@Override
	public List<BonitaTask> getReadyTasks() throws Exception {
		List<BonitaTask> bonitaTask = new BonitaProcessManagement().getReadyTasks();
		return bonitaTask;
	}

	@Override
	public Task getTask(String taskId) {
		Task task = null;
		try {
			
			task = new BonitaProcessManagement().getTask(taskId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return task;
	}

	@Override
	public List<BonitaTask> getReadyTasks(String processInstanceId) {
		List<BonitaTask> bonitaTask;
		try {
			bonitaTask = new BonitaProcessManagement().getReadyTasks(processInstanceId);
			return bonitaTask;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<BonitaTask>();
	}

	@Override
	public Boolean execute(Task task) {
		try {
			Boolean res = new BonitaProcessManagement().execute(task);
			return res;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<LightProcessDef> getLightProcesses() {
		List<LightProcessDef> processes;
		try {
			processes = new BonitaProcessManagement().getLightProcesses();
			return processes;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<LightProcessDef>();
	}

	@Override
	public ProcessDef getProcessDef(String processDefId, String version) {
		ProcessDef task = null;
		try {
			task = new BonitaProcessManagement().getProcessDef(processDefId, version);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return task;
	}
	
	
	 /**
     * {@inheritDoc}
     * 
     * @throws SkippedFormException
     */
	@Override
    public FormPage getFormFirstPage(final String formID, final Map<String, Object> urlContext) throws SessionTimeOutException, RPCException,
            SuspendedFormException, CanceledFormException, FormAlreadySubmittedException, ForbiddenFormAccessException, FormInErrorException,
            MigrationProductVersionNotIdenticalException, SkippedFormException {

       return null;
    }
    
   
}
