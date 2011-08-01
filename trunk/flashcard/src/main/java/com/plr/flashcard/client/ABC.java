package com.plr.flashcard.client;

import java.util.List;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.cellview.client.AbstractHasData;
import com.google.gwt.view.client.SelectionModel;

public class ABC extends AbstractHasData<ZhongWenCharacter> {

	public ABC() {
		super(Document.get().createDivElement(), 10, null);
	}

	@Override
	protected boolean dependsOnSelection() {
		return false;
	}

	@Override
	protected Element getChildContainer() {
		return null;
	}

	@Override
	protected Element getKeyboardSelectedElement() {

		return null;
	}

	@Override
	protected boolean isKeyboardNavigationSuppressed() {

		return false;
	}

	@Override
	protected void renderRowValues(SafeHtmlBuilder sb, List<ZhongWenCharacter> values, int start,
			SelectionModel<? super ZhongWenCharacter> selectionModel) {
	}

	@Override
	protected boolean resetFocusOnCell() {
		return false;
	}

	@Override
	protected void setKeyboardSelected(int index, boolean selected, boolean stealFocus) {

	}

}