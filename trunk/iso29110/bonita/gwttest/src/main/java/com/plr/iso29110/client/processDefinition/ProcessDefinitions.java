package com.plr.iso29110.client.processDefinition;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Widget;
import com.plr.iso29110.client.ApplicationConst;
import com.plr.iso29110.client.BugReportServiceAsync;
import com.plr.iso29110.shared.LightProcessDef;

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


		BugReportServiceAsync.Util.getInstance().getLightProcesses(new AsyncCallback<List<LightProcessDef>>() {
			
			@Override
			public void onSuccess(List<LightProcessDef> result) {
				int i = 1;
				for (LightProcessDef lprocess : result) {

					int j = 0;
					
					Hyperlink hl = new Hyperlink("start", PROCESS_START + "/" + lprocess.getName() + "/" +  lprocess.getVersion());
					table.setWidget(i, j++, hl);
					table.setText(i, j++, lprocess.getName());
					table.setText(i, j++, lprocess.getLabel());
					table.setText(i, j++, lprocess.getVersion());
					table.setText(i, j++, "" + lprocess.getState());
					table.setText(i, j++, "" + lprocess.getDeployedDate());
		
					
					i++;
				}
				
				
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	
	}

}
