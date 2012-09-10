package com.plr.iso29110.client.processDefinition;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.bonitasoft.console.client.processes.BonitaProcess;
import org.bonitasoft.console.client.processes.ProcessServiceAsync;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Widget;
import com.plr.iso29110.client.Application;
import com.plr.iso29110.client.ApplicationConst;
import com.plr.iso29110.client.Utils;
import com.plr.iso29110.client.widget.AlertWidget;

public class ProcessDefinitions extends Composite implements ApplicationConst {

	private static WelcomeUiBinder uiBinder = GWT.create(WelcomeUiBinder.class);

	interface WelcomeUiBinder extends UiBinder<Widget, ProcessDefinitions> {
	}

	@UiField(provided = true)
	FlexTable table;

	public ProcessDefinitions() {
		table = new FlexTable();
		initWidget(uiBinder.createAndBindUi(this));

		int j = 0;
		table.setText(0, j++, "");
		table.setText(0, j++, "Name");
		table.setText(0, j++, "Label");
		table.setText(0, j++, "Version");
		table.setText(0, j++, "State");
		table.setText(0, j++, "Deployment date");

		ProcessServiceAsync instance = Application.getInstance();

		instance.getAllProcesses(new AsyncCallback<Set<BonitaProcess>>() {

			@Override
			public void onSuccess(Set<BonitaProcess> result) {
				int i = 1;
				for (BonitaProcess lprocess : result) {

					int j = 0;

					// Hyperlink hl = new Hyperlink("start", PROCESS_START + "/"
					// + lprocess.getName() + "/" + lprocess.getVersion());

					String processUUID = lprocess.getName() + "--" + lprocess.getVersion();

					String formID = processUUID + "$entry";

					Hyperlink hl = new Hyperlink("start", BONITA_FORM + "/"

					+ "process" + "=" + processUUID + "&" + "autoInstantiate" + "=" + Boolean.FALSE + "&" + "form" + "=" + formID
							+ "&" + "mode" + "=" + "form");

					table.setWidget(i, j++, hl);
					table.setText(i, j++, lprocess.getName());
					table.setText(i, j++, lprocess.getDisplayName());
					table.setText(i, j++, lprocess.getVersion());
					table.setText(i, j++, "" + lprocess.getState());
					table.setText(i, j++, "" + lprocess.getDeployedDate());

					i++;
				}

			}

			@Override
			public void onFailure(Throwable caught) {
				Utils.errorManagement(caught);

			}
		});
	}

}
