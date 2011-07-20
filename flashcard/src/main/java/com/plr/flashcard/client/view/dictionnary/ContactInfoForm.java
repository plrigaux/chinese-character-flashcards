/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.plr.flashcard.client.view.dictionnary;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.DateTimeFormat.PredefinedFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.plr.flashcard.client.ZhongWenCharacter;

/**
 * A form used for editing contacts.
 */
public class ContactInfoForm extends Composite {

	private static Binder uiBinder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, ContactInfoForm> {
	}

	@UiField
	TextBox firstNameBox;
	@UiField
	TextBox lastNameBox;

//	private ZhongWenCharacter contactInfo;

	public ContactInfoForm() {
		initWidget(uiBinder.createAndBindUi(this));

		// Add the categories to the category box.

		// Initialize the contact to null.
		setContact(null);

	}

	public void setContact(ZhongWenCharacter contact) {
//		this.contactInfo = contact;
		// updateButton.setEnabled(contact != null);
		if (contact != null) {
			firstNameBox.setText("" + contact.getId());
			lastNameBox.setText(contact.getSimplifiedCharacter());

		}
	}
}
