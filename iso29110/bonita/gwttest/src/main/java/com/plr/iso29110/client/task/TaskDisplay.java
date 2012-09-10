package com.plr.iso29110.client.task;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
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
import com.google.gwt.user.client.ui.HasAlignment;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
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
import com.plr.iso29110.shared.ActivityState;
import com.plr.iso29110.shared.BonitaTask;
import com.plr.iso29110.shared.DataField;
import com.plr.iso29110.shared.DocumentInfo;
import com.plr.iso29110.shared.SomeConsts;
import com.plr.iso29110.shared.Task;

public class TaskDisplay extends Composite implements ApplicationConst {

	private static WelcomeUiBinder uiBinder = GWT.create(WelcomeUiBinder.class);

	interface WelcomeUiBinder extends UiBinder<Widget, TaskDisplay> {
	}

	private Task task;

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
	Button execute;

	private final Map<String, WidjetGetter> widjet = new HashMap<String, WidjetGetter>();

	public TaskDisplay(String taskId) {
		initWidget(uiBinder.createAndBindUi(this));

		BugReportServiceAsync.Util.getInstance().getTask(taskId, new AsyncCallback<Task>() {

			@Override
			public void onSuccess(Task result) {
				task = result;

				if (task == null) {
					return;
				}

				fillTable();

			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());

			}
		});
	}

	@UiHandler("execute")
	public void onExecuteClick(ClickEvent event) {

		Task t = new Task();

		t.setUUID(task.getUUID());

		Map<String, Object> activityInstanceVariables = new HashMap<String, Object>();
		Map<String, Object> processInstanceVariables = new HashMap<String, Object>();

		t.setActivityInstanceVariables(activityInstanceVariables);
		t.setProcessInstanceVariables(processInstanceVariables);

		fillSendValues(task.getProcessDataFields(), processInstanceVariables, task.getProcessInstanceVariables());
		fillSendValues(task.getActivityDataFields(), activityInstanceVariables, task.getActivityInstanceVariables());

		BugReportServiceAsync.Util.getInstance().execute(t, new AsyncCallback<Boolean>() {

			@Override
			public void onSuccess(Boolean result) {
				if (result) {
					findNextTasks();
				}
			}

			@Override
			public void onFailure(Throwable caught) {

			}
		});
	}

	private void fillSendValues(List<DataField> dataFields, Map<String, Object> activityInstanceVariables,
			Map<String, Object> originalValues) {
		for (DataField dataField : dataFields) {

			String name = dataField.getName();

			Object value = null;
			
			WidjetGetter wg = widjet.get(name);

			if (wg != null) {
				value = wg.getValue();
			}
			
			if (value != null) {

				Object originalValue = originalValues.get(name);

				if (originalValue == null || !originalValue.equals(value)) {
					activityInstanceVariables.put(name, value);
				}
			}
		}
	}

	private void findNextTasks() {

		BugReportServiceAsync.Util.getInstance().getReadyTasks(task.getProcessInstanceUUID(),
				new AsyncCallback<List<BonitaTask>>() {

					@Override
					public void onSuccess(List<BonitaTask> result) {

						if (result.isEmpty()) {
							History.newItem(ApplicationConst.PROCESS_INSTANCES);
						} else {
							BonitaTask t = result.iterator().next();
							History.newItem(ApplicationConst.TASK + "/" + t.getTaskId());
						}

					}

					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub

					}
				});
	}

	private void fillTable() {
		activityName.setText(task.getActivityName());
		activityLabel.setText(task.getActivityLabel());
		activityDescription.setText(task.getActivityDescription());

		ActivityState activityState = task.getState();
		state.setText(activityState == null ? "" : activityState.name());

		int row = 0;
		row = fillTable("A", task.getActivityDataFields(), task.getActivityInstanceVariables(), row);

		row = fillTable("P", task.getProcessDataFields(), task.getProcessInstanceVariables(), row);

		for (final DocumentInfo di : task.getDocuments()) {
			int j = 0;

			variables.setText(row, j++, "F");
			variables.setText(row, j++, di.getName());

			Anchor a = new Anchor(di.getContentFileName(), "attachment/" + di.getUUID() + "/" + di.getContentFileName(), "_blank");
			variables.setWidget(row, j++, a);

			variables.setWidget(row, j++, new Button("upload", new ClickHandler() {

				@Override
				public void onClick(ClickEvent event) {

					DialogBox diag = sendForm(di.getUUID(), false);
					diag.center();
				}
			}));
			row++;
		}
	}

	private interface WidjetGetter {

		Object getValue();
	}

	private int fillTable(String type, List<DataField> activity, Map<String, Object> activityInstanceVariables, int row) {
		for (DataField df : activity) {
			int j = 0;
			String name = df.getName();
			variables.setText(row, j++, type);
			variables.setText(row, j++, name);

			variables.setText(row, j++, "" + df.getDataTypeClassName());

			if (df.isEnumeration()) {
				final ListBox lb = new ListBox();

//				lb.addItem("" + df.getInitialValue());

				Object o = activityInstanceVariables.get(name);
				
				int index = 0;
				int i = 0;
				for (String s : df.getEnumerationValues()) {
					lb.addItem(s);
					
					if (s.equals(o)) {
						index = i;
					}
					i++;
				}

				lb.setSelectedIndex(index);
				variables.setWidget(row, j++, lb);

				widjet.put(name, new WidjetGetter() {

					@Override
					public Object getValue() {
						int index = lb.getSelectedIndex();
						return lb.getValue(index);
					}

				});

			} else {
				String className = df.getDataTypeClassName();
				if (String.class.getName().equals(className)) {

					final TextBox tf = new TextBox();
					variables.setWidget(row, j++, tf);

					Object o = activityInstanceVariables.get(name);

					tf.setText(o == null ? "" : o.toString());

					widjet.put(name, new WidjetGetter() {

						@Override
						public Object getValue() {
							return tf.getValue();
						}

					});

				} else if (Long.class.getName().equals(className) || Integer.class.getName().equals(className)) {

					final CustomTextBox tf = new CustomTextBox();
					tf.addValidator(new DigitValidator());
					variables.setWidget(row, j++, tf);

					Object o = activityInstanceVariables.get(name);

					tf.setText(o == null ? "" : o.toString());

					widjet.put(name, new WidjetGetter() {

						@Override
						public Object getValue() {
							return Long.valueOf(tf.getValue());
						}

					});

				} else if (Date.class.getName().equals(className)) {

					final DateBox tf = new DateBox();
					variables.setWidget(row, j++, tf);

					Object o = activityInstanceVariables.get(name);

					tf.setValue((Date) o);

					widjet.put(name, new WidjetGetter() {

						@Override
						public Object getValue() {
							return tf.getValue();
						}

					});

				} else if (Boolean.class.getName().equals(className)) {

					final CheckBox tf = new CheckBox();
					variables.setWidget(row, j++, tf);

					Object o = activityInstanceVariables.get(name);

					tf.setValue((Boolean) o);

					widjet.put(name, new WidjetGetter() {

						@Override
						public Object getValue() {
							return tf.getValue();
						}

					});

				}

				else {
					variables.setText(row, j++, "" + activityInstanceVariables.get(name));
				}
			}

			row++;
		}
		return row;
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
