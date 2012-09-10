package com.plr.iso29110.client.bonitaform;

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

public class BonitaFormAdapter extends Composite implements ApplicationConst {

	private static WelcomeUiBinder uiBinder = GWT.create(WelcomeUiBinder.class);

	interface WelcomeUiBinder extends UiBinder<Widget, BonitaFormAdapter> {
	}

	private BonitaProcess processDef;
	BonitaProcessUUID anProcessUUID;

	
	@UiField
	HTMLPanel applicationHTMLPanel;
	
	@UiField
	HTMLPanel static_application;
	
	final String applicationHTMLPanelId;
	
	final String static_applicationId;

	public BonitaFormAdapter(Map<String, Object> urlContext) {
		initWidget(uiBinder.createAndBindUi(this));

		applicationHTMLPanel.getElement().setId(DOM.createUniqueId());
		applicationHTMLPanelId = applicationHTMLPanel.getElement().getId();
		static_application.getElement().setId(DOM.createUniqueId());
		static_applicationId = static_application.getElement().getId();
		
		//hack
		DOMUtils.getInstance().		
		setApplicationHTMLPanel(static_application);
		

		


		User aUser = LoginWidget.getLogin().getUser();
		
		String formID = "" + urlContext.get("form");
		FormViewControllerFactory.getFormApplicationViewController(formID, urlContext, aUser).createFormInitialView(applicationHTMLPanelId);

	}

}
