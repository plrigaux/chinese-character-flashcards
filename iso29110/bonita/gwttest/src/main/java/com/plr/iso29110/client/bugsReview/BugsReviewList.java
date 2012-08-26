package com.plr.iso29110.client.bugsReview;

import java.util.List;

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
import com.plr.iso29110.shared.Bug;

public class BugsReviewList extends Composite implements ApplicationConst {

	private static WelcomeUiBinder uiBinder = GWT.create(WelcomeUiBinder.class);

	interface WelcomeUiBinder extends UiBinder<Widget, BugsReviewList> {
	}

	@UiField (provided=true)
	FlexTable table;


	public BugsReviewList() {
		table = new FlexTable();
		initWidget(uiBinder.createAndBindUi(this));
		
		table.setText(0, 0, "CreationDate");
		table.setText(0, 1, "Name");
		table.setText(0, 2, "ExecutionId");
		table.setText(0, 3, "TaskId");
		table.setText(0, 4, "Assignedto");
		
		
		BugReportServiceAsync.Util.getInstance().listBugsToReview(new AsyncCallback<List<Bug>> (){

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());
			}

			@Override
			public void onSuccess(List<Bug> result) {
				
				int i = 1;
				for(Bug bug : result) {
					
					
					table.setText(i, 0, bug.getCreationDate().toString());
					table.setText(i, 1, bug.getName());
					table.setText(i, 2, bug.getExecutionId());
					table.setText(i, 3, bug.getTaskId());
					table.setText(i, 4, bug.getAssignedTo());
					
					Hyperlink anchor = new Hyperlink("Review Bug", ApplicationConst.REVIEW_BUG + "/" + bug.getTaskId());
					
					table.setWidget(i, 5, anchor);
					
					i++;
				}
				
			}		

		});

	}

	

}
