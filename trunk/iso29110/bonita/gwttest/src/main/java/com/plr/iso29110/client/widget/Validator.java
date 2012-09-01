package com.plr.iso29110.client.widget;

public abstract class Validator {
	protected String errorMessage;
	
	public abstract boolean validate(String value);
	
	public String getErrorMessage() {
		return errorMessage;
	}
}
