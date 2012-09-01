package com.plr.iso29110.client.widget;

import com.google.gwt.regexp.shared.RegExp;

public class DigitValidator extends Validator {

	RegExp reg = RegExp.compile("^[0-9]+$");

	@Override
	public boolean validate(String value) {

		if (reg.test(value)) {
			errorMessage = "";
			return true;
		}

		errorMessage = "Enter valid email Id";
		return false;
	}
}
