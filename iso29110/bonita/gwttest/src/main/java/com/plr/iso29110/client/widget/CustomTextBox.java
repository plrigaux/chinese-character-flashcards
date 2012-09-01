package com.plr.iso29110.client.widget;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.TextBox;

public class CustomTextBox extends TextBox {

	private static final String TEXTBOX_VALIDATION_ERROR_STYLE = AppResources.INSTANCE.style().error_text_box();
	private String errorMessage = "";
	private List<Validator> validators = new ArrayList<Validator>();

	public CustomTextBox() {

		addKeyUpHandler(new KeyUpHandler() {

			@Override
			public void onKeyUp(KeyUpEvent event) {
				validate();
			}
		});
		
	}

	public CustomTextBox(String name) {
		setName(name);
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public void addValidator(Validator validator) {
		validators.add(validator);
	}

	public boolean validate() {
		boolean validationResult = true;

		String value = getValue().trim();
		for (Validator validator : validators) {
			validationResult = validator.validate(value);
			if (!validationResult) {
				errorMessage = validator.getErrorMessage();
				break;
			}
			errorMessage = validator.getErrorMessage();
		}
		setErrorStyles(validationResult);
		return validationResult;
	}

	private void setErrorStyles(boolean validationResult) {
		if (validationResult) {
			removeStyleName(TEXTBOX_VALIDATION_ERROR_STYLE);
			setTitle("");
		} else {
			addStyleName(TEXTBOX_VALIDATION_ERROR_STYLE);
			setTitle(errorMessage);
		}
	}

	@Override
	public void setValue(String s) {
//		removeStyleDependentName(TEXTBOX_VALIDATION_ERROR_STYLE);
		super.setValue(s);
	}

	@Override
	public String getValue() {
		return super.getValue().trim();
	}

}