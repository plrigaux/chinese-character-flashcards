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
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * A view of a {@link ContentWidget}.
 */
public class ContentWidgetView extends Composite {

  interface ContentWidgetViewUiBinder extends UiBinder<
      Widget, ContentWidgetView> {
  }

  private static ContentWidgetViewUiBinder uiBinder = GWT.create(
      ContentWidgetViewUiBinder.class);

  @UiField
  Element descElem;

  @UiField
  SimplePanel examplePanel;

  @UiField
  Element nameElem;

  public ContentWidgetView() {
    initWidget(uiBinder.createAndBindUi(this));
  }

  public void setDescription(String html) {
    descElem.setInnerHTML(html);
  }

  public void setExample(Widget widget) {
    examplePanel.setWidget(widget);
  }

  public void setName(String text) {
    nameElem.setInnerText(text);
  }
}