package com.plr.iso29110.client.task;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteHandler;
import com.google.gwt.user.client.ui.FormPanel.SubmitEvent;
import com.google.gwt.user.client.ui.FormPanel.SubmitHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasAlignment;
import com.google.gwt.user.client.ui.Hidden;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.plr.iso29110.client.ApplicationConst;
import com.plr.iso29110.client.BugReportServiceAsync;
import com.plr.iso29110.client.widget.CustomTextBox;
import com.plr.iso29110.client.widget.DigitValidator;
import com.plr.iso29110.shared.DataField;
import com.plr.iso29110.shared.DocumentInfo;
import com.plr.iso29110.shared.Task;

public class TaskDisplay extends Composite implements ApplicationConst {

	private static WelcomeUiBinder uiBinder = GWT.create(WelcomeUiBinder.class);

	interface WelcomeUiBinder extends UiBinder<Widget, TaskDisplay> {
	}

	private final String taskId;

	private Task task;

	@UiField
	FlexTable variables;

	@UiField
	Label activityName;

	@UiField
	Label activityLabel;

	@UiField
	Label activityDescription;

	public TaskDisplay(String taskId) {
		initWidget(uiBinder.createAndBindUi(this));

		this.taskId = taskId;

		BugReportServiceAsync.Util.getInstance().getTask(taskId, new AsyncCallback<Task>() {

			@Override
			public void onSuccess(Task result) {
				task = result;

				if (task == null) {
					return;
				}

				activityName.setText(task.getActivityName());
				activityLabel.setText(task.getActivityLabel());
				activityDescription.setText(task.getActivityDescription());

				int row = 0;
				row = fillTable("A", task.getActivityDataFields(), task.getActivityInstanceVariables(), row);

				row = fillTable("P", task.getProcessDataFields(), task.getProcessInstanceVariables(), row);

				for (DocumentInfo di : task.getDocuments()) {
					int j = 0;

					variables.setText(row, j++, "F");
					variables.setText(row, j++, di.getName());

					Anchor a = new Anchor(di.getContentFileName(), "attachment/" + di.getUUID() + "/" + di.getContentFileName(),
							"_blank");
					variables.setWidget(row, j++, a);
					
					
					
					final String name = di.getName();
					final String processInstanceUUID = di.getProcessInstanceUUID();
					
					
					variables.setWidget(row, j++, new Button("upload", new ClickHandler() {
						
						@Override
						public void onClick(ClickEvent event) {
							
							DialogBox diag =  sendForm(name, processInstanceUUID);
							diag.center();
						}
					}));

				}
			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());

			}
		});
	}

	private int fillTable(String type, List<DataField> activity, Map<String, Object> activityInstanceVariables, int row) {
		for (DataField df : activity) {
			int j = 0;
			String name = df.getName();
			variables.setText(row, j++, type);
			variables.setText(row, j++, name);
			// variables.setHTML(row, j++, df.getLabel());
			// variables.setHTML(row, j++, df.getDescription());

			// variables.setHTML(row, j++, df.getScriptingValue());
			// variables.setText(row, j++, "" + df.isEnumeration());
			// variables.setText(row, j++, "" + df.getEnumerationValues());
			// variables.setHTML(row, j++, "" + df.isTransient());

			// variables.setText(row, j++, "" + df.getInitialValue());
			variables.setText(row, j++, "" + df.getDataTypeClassName());

			if (df.isEnumeration()) {
				ListBox lb = new ListBox();

				lb.addItem("" + df.getInitialValue());

				for (String s : df.getEnumerationValues()) {
					lb.addItem(s);
				}

				variables.setWidget(row, j++, lb);

			} else {
				String className = df.getDataTypeClassName();
				if (String.class.getName().equals(className)) {

					TextBox tf = new TextBox();
					variables.setWidget(row, j++, tf);

					Object o = activityInstanceVariables.get(name);

					tf.setText(o == null ? "" : o.toString());

				} else if (Long.class.getName().equals(className) || Integer.class.getName().equals(className)) {

					CustomTextBox tf = new CustomTextBox();
					tf.addValidator(new DigitValidator());
					variables.setWidget(row, j++, tf);

					Object o = activityInstanceVariables.get(name);

					tf.setText(o == null ? "" : o.toString());

				} else if (Date.class.getName().equals(className)) {

					DateBox tf = new DateBox();
					variables.setWidget(row, j++, tf);

					Object o = activityInstanceVariables.get(name);

					tf.setValue((Date) o);

				} else if (Boolean.class.getName().equals(className)) {

					CheckBox tf = new CheckBox();
					variables.setWidget(row, j++, tf);

					Object o = activityInstanceVariables.get(name);

					tf.setValue((Boolean) o);

				}

				else {
					variables.setText(row, j++, "" + activityInstanceVariables.get(name));
				}
			}

			row++;
		}
		return row;
	}

	public static DialogBox sendForm(final String name, final String processInstanceUUID) {
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
//		final TextBox tb = new TextBox();
//		tb.setName("textBoxFormElement");
//		panel.add(tb);

		final Hidden nameHidden = new Hidden("name", name);
		panel.add(nameHidden);
		
		
		final Hidden processInstanceUUIDHidden = new Hidden("processInstanceUUID", processInstanceUUID);
		panel.add(processInstanceUUIDHidden);
		
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
				System.out.println(fname);
				upload.setName(fname);
				form.submit();

			}
		}));

		String buttonText = "pizza";
		HTML nativeSubmitButton = new HTML("<input class='gwt-Button' type='submit' value='" + buttonText + "' />");
		panel.add(nativeSubmitButton);
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
//				Window.alert(event.getResults());
				
				System.out.println(event.getResults());
				
			}
		});
		
		form.addSubmitHandler(new SubmitHandler() {
			
			@Override
			public void onSubmit(SubmitEvent event) {
				// This event is fired just before the form is submitted. We can
				// take
				// this opportunity to perform validation.
//				if (tb.getText().length() == 0) {
//					Window.alert("The text box must not be empty");
//					event.cancel();
//				}
			}
		});
		

		buttonClose.setWidth("90px");
		panel.add(buttonClose);
		panel.setCellHorizontalAlignment(buttonClose, HasAlignment.ALIGN_RIGHT);
		box.add(form);
		box.setGlassEnabled(true);
		return box;
	}
}
