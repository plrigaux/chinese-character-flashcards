package com.plr.iso29110.client.processInstances;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Widget;
import com.plr.iso29110.client.ApplicationConst;
import com.plr.iso29110.client.BugReportServiceAsync;
import com.plr.iso29110.shared.BonitaProcessInstance;
import com.plr.iso29110.shared.BonitaTask;
import com.plr.iso29110.shared.Bug;

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
		table.setText(0, j++, "Process Name");
		table.setText(0, j++, "Process Label");
		table.setText(0, j++, "Version");
		table.setText(0, j++, "Nb");
		table.setText(0, j++, "Last Update Date");
		table.setText(0, j++, "Activity Name");
		table.setText(0, j++, "Activity Label");
		table.setText(0, j++, "Activity desc");

		BugReportServiceAsync.Util.getInstance().getReadyTasks(new AsyncCallback<List<BonitaTask>>() {

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());
			}


			@Override
			public void onSuccess(List<BonitaTask> result) {
				int i = 1;
				for (BonitaTask processInstance : result) {

					int j = 0;

					table.setText(i, j++, processInstance.getProcessName());
					table.setText(i, j++, processInstance.getProcessLabel());
					table.setText(i, j++, processInstance.getProcessVersion());
					table.setText(i, j++, "" + processInstance.getNb());
					table.setText(i, j++, "" + processInstance.getLastUpdateDate());
					table.setText(i, j++, "" + processInstance.getActivityName());
					table.setText(i, j++, "" + processInstance.getActivityLabel());
					table.setText(i, j++, "" + processInstance.getActivityDescription());
					
					i++;
				}
				
			}

		});

	}

}
