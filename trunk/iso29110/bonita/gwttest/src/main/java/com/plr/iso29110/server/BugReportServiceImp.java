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

import org.bonitasoft.console.common.exception.NoCredentialsInSessionException;
import org.bonitasoft.console.security.client.users.User;
import org.bonitasoft.console.security.server.LoginServlet;
import org.bonitasoft.console.servlet.ServletLoginUtils;
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

        if (LOGGER.isLoggable(Level.FINER)) {
            String time = DATE_FORMAT.format(new Date());
            LOGGER.log(Level.FINER, "### " + time + " - getFormFirstPage - start");
        }
        LoginContext loginContext = null;
        String localeStr = getLocale();
        Locale userLocale = resolveLocale(localeStr);
        Map<String, Object> context = initContext(urlContext, userLocale);
        final ClassLoader originalClassLoader = Thread.currentThread().getContextClassLoader();
        try {
            final HttpServletRequest request = this.getThreadLocalRequest();
            loginContext = ServletLoginUtils.engineLogin(request);
            final FormServiceProvider formServiceProvider = FormServiceProviderFactory.getFormServiceProvider();
            final FormDocument document = formServiceProvider.getFormDefinitionDocument(context);
            final Date deployementDate = formServiceProvider.getDeployementDate(context);
            final boolean isEditMode = formServiceProvider.isEditMode(formID, context);
            final boolean isCurrentValue = formServiceProvider.isCurrentValue(context);
            final IFormDefinitionAPI definitionAPI = FormAPIFactory.getFormDefinitionAPI(document, deployementDate, localeStr);
            final String permissions = definitionAPI.getFormPermissions(formID, context);
            final String productVersion = definitionAPI.getProductVersion();
            final String migrationProductVersion = definitionAPI.getMigrationProductVersion(formID, context);
            final HttpSession session = request.getSession();
            final User user = (User) session.getAttribute(LoginServlet.USER_SESSION_PARAM_KEY);
            context.put(FormServiceProviderUtil.USER, user);
            formServiceProvider.isAllowed(formID, permissions, productVersion, migrationProductVersion, context, true);
            final String pageIdExpression = definitionAPI.getFormFirstPage(formID, context);
            FormPage formPage = null;
            if (pageIdExpression != null) {
                setClassloader(formServiceProvider, context);
                final List<TransientData> transientData = definitionAPI.getFormTransientData(formID, context);
                final Map<String, Object> transientDataContext = definitionAPI.getTransientDataContext(transientData, userLocale, context);
                setFormTransientDataContext(formID, transientDataContext);
                context.put(FormServiceProviderUtil.TRANSIENT_DATA_CONTEXT, transientDataContext);
                context.put(FormServiceProviderUtil.IS_EDIT_MODE, isEditMode);
                context.put(FormServiceProviderUtil.IS_CURRENT_VALUE, isCurrentValue);
                context.put(FormServiceProviderUtil.FIELD_VALUES, new HashMap<String, FormFieldValue>());
                final String pageId = (String) formServiceProvider.resolveExpression(pageIdExpression, context);
                formPage = definitionAPI.getFormPage(formID, pageId, context);
                if (formPage != null) {
                    formPage.setPageLabel((String) formServiceProvider.resolveExpression(formPage.getPageLabel(), context));
                    formFieldValuesUtil.setFormWidgetsValues(formPage.getFormWidgets(), context);
                    formFieldValuesUtil.clearExpressionsOrConnectors(formID, pageId, localeStr, deployementDate, formPage.getFormWidgets());
                }
                return formPage;
            }
            return formPage;
        } catch (final ForbiddenFormAccessException e) {
            throw new ForbiddenFormAccessException(e);
        } catch (final MigrationProductVersionNotIdenticalException e) {
            throw new MigrationProductVersionNotIdenticalException(e);
        } catch (final CanceledFormException e) {
            throw new CanceledFormException(e);
        } catch (final SuspendedFormException e) {
            throw new SuspendedFormException(e);
        } catch (final FormInErrorException e) {
            throw new FormInErrorException(e);
        } catch (final SkippedFormException e) {
            throw new SkippedFormException(e);
        } catch (final FormAlreadySubmittedException e) {
            throw new FormAlreadySubmittedException(e);
        } catch (final NoCredentialsInSessionException e) {
            if (LOGGER.isLoggable(Level.INFO)) {
                LOGGER.log(Level.INFO, "Session timeout");
            }
            throw new SessionTimeOutException(e.getMessage(), e);
        } catch (final Throwable e) {
            if (LOGGER.isLoggable(Level.SEVERE)) {
                LOGGER.log(Level.SEVERE, "Error while getting the first page for application " + formID, e);
            }
            throw new RPCException(e.getMessage(), e);
        } finally {
            Thread.currentThread().setContextClassLoader(originalClassLoader);
            ServletLoginUtils.engineLogout(loginContext);
            if (LOGGER.isLoggable(Level.FINER)) {
                String time = DATE_FORMAT.format(new Date());
                LOGGER.log(Level.FINER, "### " + time + " - getFormFirstPage - end");
            }
        }
    }
    
   
}
