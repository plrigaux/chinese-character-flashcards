package com.plr.iso29110.client.processInstances;

import java.util.ArrayList;
import java.util.Collection;

import org.bonitasoft.console.client.cases.CaseFilter;
import org.bonitasoft.console.client.cases.CaseItem;
import org.bonitasoft.console.client.cases.CaseUpdates;
import org.bonitasoft.console.client.common.RpcConsoleServices;
import org.bonitasoft.console.client.labels.LabelModel;
import org.bonitasoft.console.client.labels.LabelUUID;
import org.bonitasoft.console.client.steps.StepItem;
import org.bonitasoft.console.client.users.UserUUID;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Widget;
import com.plr.iso29110.client.ApplicationConst;
import com.plr.iso29110.client.BugReportServiceAsync.Util;
import com.plr.iso29110.client.Utils;
import com.plr.iso29110.client.login.LoginWidget;

public class ProcessInstances extends Composite implements ApplicationConst {

	private static WelcomeUiBinder uiBinder = GWT.create(WelcomeUiBinder.class);

	interface WelcomeUiBinder extends UiBinder<Widget, ProcessInstances> {
	}

	@UiField(provided = true)
	FlexTable table;

	public ProcessInstances() {
		table = new FlexTable();
		initWidget(uiBinder.createAndBindUi(this));

		int j = 0;
		table.setText(0, j++, "");
		table.setText(0, j++, "Process Name");
		table.setText(0, j++, "Process Label");
		table.setText(0, j++, "Version");
		table.setText(0, j++, "Nb");
		table.setText(0, j++, "Last Update Date");
		table.setText(0, j++, "Activity Name");
		table.setText(0, j++, "Activity Label");
		table.setText(0, j++, "Activity desc");

		String userName = LoginWidget.getUsername();

		if (userName == null) {
			return;
		}

		LabelModel aLabelUUIDCollection = new LabelModel(LabelModel.INBOX_LABEL, new UserUUID(userName));
		Collection<LabelUUID> theLabels = new ArrayList<LabelUUID>();
		theLabels.add(aLabelUUIDCollection.getUUID());

		CaseFilter aCaseFilter = new CaseFilter(theLabels, 0, 100);

		RpcConsoleServices.getCaseService().getAllCases(aCaseFilter, new AsyncCallback<CaseUpdates>() {

			@Override
			public void onSuccess(CaseUpdates result) {
				int i = 1;
				for (CaseItem caseItem : result.getCases()) {

					for (StepItem stepItem : caseItem.getSteps()) {
						int j = 0;

						String linkParam = ApplicationConst.BONITA_FORM + "/" ;

						linkParam = Utils.appenParam(linkParam, CASEID, caseItem.getUUID());
						linkParam = Utils.appenParam(linkParam, "form", stepItem.getName() + "$entry");
						linkParam = Utils.appenParam(linkParam, "task", stepItem.getUUID());
						linkParam = Utils.appenParam(linkParam, "autoInstantiate", Boolean.FALSE);
						linkParam = Utils.appenParam(linkParam, "mode", "form");
						

						Hyperlink link = new Hyperlink("go to", linkParam);
						table.setWidget(i, j++, link);

						table.setText(i, j++, stepItem.getName());
						table.setText(i, j++, stepItem.getLabel());
						table.setText(i, j++, "" + stepItem.getProcessUUID());
						table.setText(i, j++, "" + stepItem.getPriority());
						table.setText(i, j++, "" + caseItem.getLastUpdateDate());
						table.setText(i, j++, "" + stepItem.getApplicationURL());
						table.setText(i, j++, "" + stepItem.getDesc());
						table.setText(i, j++, "" + stepItem.getState());

						i++;
					}

				}

			}

			@Override
			public void onFailure(Throwable caught) {
				Utils.errorManagement(caught);

			}
		});

	}

}
