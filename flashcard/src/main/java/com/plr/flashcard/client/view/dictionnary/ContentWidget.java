/*
 * Copyright 2008 Google Inc.
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gwt.event.logical.shared.HasValueChangeHandlers;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.LazyPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * <p>
 * A widget used to show GWT examples in the ContentPanel.
 * </p>
 * <p>
 * This {@link Widget} uses a lazy initialization mechanism so that the content
 * is not rendered until the onInitialize method is called, which happens the
 * first time the {@link Widget} is added to the page. The data in the source
 * and css tabs are loaded using an RPC call to the server.
 * </p>
 */
public abstract class ContentWidget extends LazyPanel implements HasValueChangeHandlers<String> {

	/**
	 * Generic callback used for asynchronously loaded data.
	 * 
	 * @param <T>
	 *            the data type
	 */
	public static interface Callback<T> {
		void onError();

		void onSuccess(T value);
	}

	/**
	 * Get the simple filename of a class.
	 * 
	 * @param c
	 *            the class
	 */
	protected static String getSimpleName(Class<?> c) {
		String name = c.getName();
		return name.substring(name.lastIndexOf(".") + 1);
	}


	/**
	 * A list of filenames of the raw source code included with this example.
	 */
	private final List<String> rawSourceFilenames = new ArrayList<String>();
	
	/**
	 * The view that holds the name, description, and example.
	 */
	private SimplePanel view;

	/**
	 * Whether the demo widget has been initialized.
	 */
	private boolean widgetInitialized;

	/**
	 * Whether the demo widget is (asynchronously) initializing.
	 */
	private boolean widgetInitializing;

	public HandlerRegistration addValueChangeHandler(ValueChangeHandler<String> handler) {
		return addHandler(handler, ValueChangeEvent.getType());
	}

	@Override
	public void ensureWidget() {
		super.ensureWidget();
		ensureWidgetInitialized();
	}

	

	/**
	 * Get the filenames of the raw source files.
	 * 
	 * @return the raw source files.
	 */
	public List<String> getRawSourceFilenames() {
		return Collections.unmodifiableList(rawSourceFilenames);
	}



	

	/**
	 * When the widget is first initialized, this method is called. If it
	 * returns a Widget, the widget will be added as the first tab. Return null
	 * to disable the first tab.
	 * 
	 * @return the widget to add to the first tab
	 */
	public abstract Widget onInitialize();

	/**
	 * Called when initialization has completed and the widget has been added to
	 * the page.
	 */
	public void onInitializeComplete() {
	}

	protected abstract void asyncOnInitialize(final AsyncCallback<Widget> callback);

	/**
	 * Initialize this widget by creating the elements that should be added to
	 * the page.
	 */
	@Override
	protected final Widget createWidget() {
		view = new SimplePanel();
		return view;
	}

	/**
	 * Fire a {@link ValueChangeEvent} indicating that the user wishes to see
	 * the specified source file.
	 * 
	 * @param filename
	 *            the filename that the user wishes to see
	 */
	protected void fireRawSourceRequest(String filename) {
		if (!rawSourceFilenames.contains(filename)) {
			throw new IllegalArgumentException("Filename is not registered with this example: " + filename);
		}
		ValueChangeEvent.fire(this, filename);
	}

	@Override
	protected void onLoad() {
		ensureWidget();
	}

	/**
	 * Ensure that the demo widget has been initialized. Note that
	 * initialization can fail if there is a network failure.
	 */
	private void ensureWidgetInitialized() {
		if (widgetInitializing || widgetInitialized) {
			return;
		}

		widgetInitializing = true;

		asyncOnInitialize(new AsyncCallback<Widget>() {
			public void onFailure(Throwable reason) {
				widgetInitializing = false;
				Window.alert("Failed to download code for this widget (" + reason + ")");
			}

			public void onSuccess(Widget result) {
				widgetInitializing = false;
				widgetInitialized = true;

				Widget widget = result;
				if (widget != null) {
					view.clear();
					view.add(widget);
				}
				onInitializeComplete();
			}
		});
	}

	
}
