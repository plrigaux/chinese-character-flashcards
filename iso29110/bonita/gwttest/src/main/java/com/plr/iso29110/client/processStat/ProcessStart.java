package com.plr.iso29110.client.processStat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bonitasoft.console.client.processes.BonitaProcess;
import org.bonitasoft.console.client.processes.BonitaProcess.BonitaProcessState;
import org.bonitasoft.console.client.processes.BonitaProcessUUID;
import org.bonitasoft.console.client.processes.ProcessServiceAsync;
import org.bonitasoft.console.security.client.users.User;
import org.bonitasoft.forms.client.model.FormPage;
import org.bonitasoft.forms.client.model.FormWidget;
import org.bonitasoft.forms.client.rpc.FormsServiceAsync;
import org.bonitasoft.forms.client.view.common.DOMUtils;
import org.bonitasoft.forms.client.view.common.RpcFormsServices;
import org.bonitasoft.forms.client.view.controller.FormViewControllerFactory;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteHandler;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasAlignment;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Hidden;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.plr.iso29110.client.Application;
import com.plr.iso29110.client.ApplicationConst;
import com.plr.iso29110.client.login.LoginWidget;
import com.plr.iso29110.client.widget.AlertWidget;
import com.plr.iso29110.shared.DataField;
import com.plr.iso29110.shared.SomeConsts;

public class ProcessStart extends Composite implements ApplicationConst {

	private static WelcomeUiBinder uiBinder = GWT.create(WelcomeUiBinder.class);

	interface WelcomeUiBinder extends UiBinder<Widget, ProcessStart> {
	}

	private BonitaProcess processDef;
	BonitaProcessUUID anProcessUUID;

	@UiField
	FlexTable variables;

	@UiField
	Label activityName;

	@UiField
	Label activityLabel;

	@UiField
	Label activityDescription;

	@UiField
	Label state;

	@UiField
	Button start;

	@UiField
	HTMLPanel applicationHTMLPanel;
	
	@UiField
	HTMLPanel static_application;
	
	final String applicationHTMLPanelId;
	
	final String static_applicationId;

	private final Map<String, WidjetGetter> widjet = new HashMap<String, WidjetGetter>();

	public ProcessStart(String processDefId, String version) {
		initWidget(uiBinder.createAndBindUi(this));

		applicationHTMLPanel.getElement().setId(DOM.createUniqueId());
		
		applicationHTMLPanelId = applicationHTMLPanel.getElement().getId();
		
		static_application.getElement().setId(DOM.createUniqueId());
		
		static_applicationId = static_application.getElement().getId();
		
		DOMUtils.getInstance().		
		setApplicationHTMLPanel(static_application);
		
		ProcessServiceAsync instance = Application.getInstance();

		anProcessUUID = new BonitaProcessUUID(processDefId + "--" + version, ":)");
		instance.getProcess(anProcessUUID, new AsyncCallback<BonitaProcess>() {

			@Override
			public void onFailure(Throwable caught) {

				if ("org.bonitasoft.console.client.exceptions.SessionTimeOutException".equals(caught.getClass().getName())) {
					LoginWidget.getLogin(caught.getMessage()).center();
				} else {
					new AlertWidget("Error", caught.getMessage()).center();
				}

			}

			@Override
			public void onSuccess(BonitaProcess result) {
				processDef = result;
				if (processDef == null) {
					return;
				}

				fillTable();

			}
		});

	}

	@UiHandler("start")
	public void onExecuteClick(ClickEvent event) {

		// Task t = new Task();
		//
		// t.setUUID(processDef.getUUID());
		//
		// Map<String, Object> processInstanceVariables = new HashMap<String,
		// Object>();
		//
		// t.setProcessInstanceVariables(processInstanceVariables);
		//
		// fillSendValues(processDef.getDataFields(), processInstanceVariables);
		//
		// BugReportServiceAsync.Util.getInstance().execute(t, new
		// AsyncCallback<Boolean>() {
		//
		// @Override
		// public void onSuccess(Boolean result) {
		// if (result) {
		// findNextTasks();
		// }
		// }
		//
		// @Override
		// public void onFailure(Throwable caught) {
		//
		// }
		// });
	}

	private void fillSendValues(List<DataField> dataFields, Map<String, Object> activityInstanceVariables) {
		for (DataField dataField : dataFields) {

			String name = dataField.getName();

			Object value = null;

			WidjetGetter wg = widjet.get(name);

			if (wg != null) {
				value = wg.getValue();
			}

			if (value != null) {

				activityInstanceVariables.put(name, value);
			}
		}
	}

	private void findNextTasks() {

		// BugReportServiceAsync.Util.getInstance().getReadyTasks(task.getProcessInstanceUUID(),
		// new AsyncCallback<List<BonitaTask>>() {
		//
		// @Override
		// public void onSuccess(List<BonitaTask> result) {
		//
		// if (result.isEmpty()) {
		// History.newItem(ApplicationConst.PROCESS_INSTANCES);
		// } else {
		// BonitaTask t = result.iterator().next();
		// History.newItem(ApplicationConst.TASK + "/" + t.getTaskId());
		// }
		//
		// }
		//
		// @Override
		// public void onFailure(Throwable caught) {
		// // TODO Auto-generated method stub
		//
		// }
		// });
	}

	String formID = null;

	private void fillTable() {
		activityName.setText(processDef.getName());
		activityLabel.setText(processDef.getDisplayName());

		BonitaProcessState activityState = processDef.getState();
		state.setText(activityState == null ? "" : activityState.name());

		// StepServiceAsync ssa = RpcConsoleServices.getStepService();

		ProcessServiceAsync instance = Application.getInstance();

		FormsServiceAsync formsServiceAsync = RpcFormsServices.getFormsService();

		Map<String, Object> urlContext = new HashMap<String, Object>();

		String formID = anProcessUUID.getValue() + "$entry";
		urlContext.put("process", anProcessUUID.getValue());
		urlContext.put("autoInstantiate", Boolean.FALSE.toString());
		urlContext.put("form", formID);
		urlContext.put("mode", "form");
		// {process=Process_Loop--1.0, autoInstantiate=false,
		// form=Process_Loop--1.0$entry, mode=form}

		User aUser = LoginWidget.getLogin().getUser();
//		PageflowViewController pfc = new PageflowViewController(formID, urlContext, LoginWidget.getLogin().getUser(),
//				"fakeElementId", applicationHTMLPanel);
//		pfc.createForm();
		
		
		FormViewControllerFactory.getFormApplicationViewController(formID, urlContext, aUser).createFormInitialView(applicationHTMLPanelId);
		
		// formsServiceAsync.getFormFirstPage(formID, urlContext, new
		// AsyncCallback<FormPage>() {
		//
		// @Override
		// public void onFailure(Throwable caught) {
		// new AlertWidget("Error", caught.getMessage()).center();
		//
		// }
		//
		// @Override
		// public void onSuccess(FormPage result) {
		// fillTable(result);
		// }
		// });

	}

	private interface WidjetGetter {

		Object getValue();
	}

	private void fillTable(FormPage formPage) {
		int row = 0;
		for (FormWidget formWidget : formPage.getFormWidgets()) {
			fillTable(formWidget, row);
			row++;
		}
	}

	private void fillTable(FormWidget formWidget, int row) {
		int j = 0;
		variables.setText(row, j++, formWidget.getLabel());

	}

	public static DialogBox sendForm(final String documentUUID, final boolean isMajorVersion) {
		final DialogBox box = new DialogBox();

		box.setText("Send File");

		final Button buttonClose = new Button("Close", new ClickHandler() {
			@Override
			public void onClick(final ClickEvent event) {
				box.hide();
			}
		});

		// Create a FormPanel and point it at a service.
		final FormPanel form = new FormPanel();
		final VerticalPanel panel = new VerticalPanel();
		form.setWidget(panel);
		form.setAction(GWT.getHostPageBaseURL() + "uploadAttachment");

		// Because we're going to add a FileUpload widget, we'll need to set the
		// form to use the POST method, and multipart MIME encoding.
		form.setEncoding(FormPanel.ENCODING_MULTIPART);
		form.setMethod(FormPanel.METHOD_POST);

		// Create a panel to hold all of the form widgets.

		// Create a TextBox, giving it a name so that it will be submitted.
		// final TextBox tb = new TextBox();
		// tb.setName("textBoxFormElement");
		// panel.add(tb);

		Hidden nameHidden;

		nameHidden = new Hidden(SomeConsts.METHOD, SomeConsts.ADD_DOCUMENT_VERSION);
		panel.add(nameHidden);

		nameHidden = new Hidden(SomeConsts.IS_MAJOR_VERSION, "" + isMajorVersion);
		panel.add(nameHidden);

		nameHidden = new Hidden(SomeConsts.DOCUMENTUUID, documentUUID);
		panel.add(nameHidden);

		final Label msg = new Label();

		// Create a ListBox, giving it a name and some values to be associated
		// with
		// its options.

		// Create a FileUpload widget.
		final FileUpload upload = new FileUpload();
		upload.setName("uploadFormElement");
		panel.add(upload);

		// Add a 'submit' button.
		panel.add(new Button("Submit", new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				String fname = upload.getFilename();

				upload.setName(fname);
				form.submit();

			}
		}));

		form.addSubmitCompleteHandler(new SubmitCompleteHandler() {

			@Override
			public void onSubmitComplete(SubmitCompleteEvent event) {
				// When the form submission is successfully completed, this
				// event is
				// fired. Assuming the service returned a response of type
				// text/html,
				// we can get the result text here (see the FormPanel
				// documentation for
				// further explanation).
				// Window.alert(event.getResults());

				String results = event.getResults();

				if (results.isEmpty()) {
					box.hide();
				}

				msg.setText(event.getResults());
			}
		});

		// form.addSubmitHandler(new SubmitHandler() {
		//
		// @Override
		// public void onSubmit(SubmitEvent event) {
		//
		// }
		// });

		buttonClose.setWidth("90px");
		panel.add(buttonClose);
		panel.setCellHorizontalAlignment(buttonClose, HasHorizontalAlignment.ALIGN_RIGHT);
		box.add(form);

		panel.add(msg);

		box.setGlassEnabled(true);
		return box;
	}
}
