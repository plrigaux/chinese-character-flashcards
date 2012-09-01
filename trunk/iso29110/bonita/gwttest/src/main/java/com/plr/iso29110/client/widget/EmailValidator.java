package com.plr.iso29110.client.widget;

public class EmailValidator extends Validator {

	@Override
	public boolean validate(String value) {

		if (value.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
			errorMessage = "";
			return true;
		}
		errorMessage = "Enter valid email Id";
		return false;

	}

}