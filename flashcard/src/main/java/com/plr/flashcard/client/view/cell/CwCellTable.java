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
package com.plr.flashcard.client.view.cell;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.google.gwt.cell.client.CheckboxCell;
import com.google.gwt.cell.client.EditTextCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.cell.client.SelectionCell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.SimplePager.TextLocation;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.DefaultSelectionEventManager;
import com.google.gwt.view.client.MultiSelectionModel;
import com.google.gwt.view.client.SelectionModel;
import com.plr.flashcard.client.view.cell.ContactDatabase.Category;
import com.plr.flashcard.client.view.cell.ContactDatabase.ContactInfo;

/**
 * Example file.
 */

public class CwCellTable extends ContentWidget {

  /**
   * The UiBinder interface used by this example.
   */
  
  interface Binder extends UiBinder<Widget, CwCellTable> {
  }

  /**
   * The constants used in this Content Widget.
   */
  
  public static class CwConstants  {
    String cwCellTableColumnAddress() {
		return "cwCellTableColumnAddress";
	}

    String cwCellTableColumnCategory() {
		return "cwCellTableColumnCategory";
	}

    String cwCellTableColumnFirstName() {
		return "cwCellTableColumnFirstName";
	}

    String cwCellTableColumnLastName() {
		return "cwCellTableColumnLastName";
	}

    String cwCellTableDescription() {
		return "cwCellTableDescription";
	}

    String cwCellTableName() {
		return "cwCellTableName";
	}
  }

  /**
   * The main CellTable.
   */
  
  @UiField(provided = true)
  CellTable<ContactInfo> cellTable;

  /**
   * The pager used to change the range of data.
   */
  
  @UiField(provided = true)
  SimplePager pager;

  /**
   * An instance of the constants.
   */
  
  private final CwConstants constants;

  /**
   * Constructor.
   * 
   * @param constants the constants
   */
  public CwCellTable() {
    super(new CwConstants().cwCellTableName(), new CwConstants().cwCellTableDescription(),
        false, "ContactDatabase.java", "CwCellTable.ui.xml");
    this.constants = new CwConstants();
  }

  
  public boolean hasMargins() {
    return false;
  }

  /**
   * Initialize this example.
   */
  
  @Override
  public Widget onInitialize() {
    // Create a CellTable.

    // Set a key provider that provides a unique key for each contact. If key is
    // used to identify contacts when fields (such as the name and address)
    // change.
    cellTable = new CellTable<ContactInfo>(
        ContactDatabase.ContactInfo.KEY_PROVIDER);
    cellTable.setWidth("100%", true);

    // Attach a column sort handler to the ListDataProvider to sort the list.
    ListHandler<ContactInfo> sortHandler = new ListHandler<ContactInfo>(
        ContactDatabase.get().getDataProvider().getList());
    cellTable.addColumnSortHandler(sortHandler);

    // Create a Pager to control the table.
    SimplePager.Resources pagerResources = GWT.create(SimplePager.Resources.class);
    pager = new SimplePager(TextLocation.CENTER, pagerResources, false, 0, true);
    pager.setDisplay(cellTable);

    // Add a selection model so we can select cells.
    final SelectionModel<ContactInfo> selectionModel = new MultiSelectionModel<ContactInfo>(
        ContactDatabase.ContactInfo.KEY_PROVIDER);
    cellTable.setSelectionModel(selectionModel,
        DefaultSelectionEventManager.<ContactInfo> createCheckboxManager());

    // Initialize the columns.
    initTableColumns(selectionModel, sortHandler);

    // Add the CellList to the adapter in the database.
    ContactDatabase.get().addDataDisplay(cellTable);

    // Create the UiBinder.
    Binder uiBinder = GWT.create(Binder.class);
    Widget widget = uiBinder.createAndBindUi(this);

    return widget;
  }

  @Override
  protected void asyncOnInitialize(final AsyncCallback<Widget> callback) {
    GWT.runAsync(CwCellTable.class, new RunAsyncCallback() {

      public void onFailure(Throwable caught) {
        callback.onFailure(caught);
      }

      public void onSuccess() {
        callback.onSuccess(onInitialize());
      }
    });
  }

  /**
   * Add the columns to the table.
   */
  
  private void initTableColumns(
      final SelectionModel<ContactInfo> selectionModel,
      ListHandler<ContactInfo> sortHandler) {
    // Checkbox column. This table will uses a checkbox column for selection.
    // Alternatively, you can call cellTable.setSelectionEnabled(true) to enable
    // mouse selection.
    Column<ContactInfo, Boolean> checkColumn = new Column<ContactInfo, Boolean>(
        new CheckboxCell(true, false)) {
      @Override
      public Boolean getValue(ContactInfo object) {
        // Get the value from the selection model.
        return selectionModel.isSelected(object);
      }
    };
    cellTable.addColumn(checkColumn, SafeHtmlUtils.fromSafeConstant("<br/>"));
    cellTable.setColumnWidth(checkColumn, 40, Unit.PX);

    // First name.
    Column<ContactInfo, String> firstNameColumn = new Column<ContactInfo, String>(
        new EditTextCell()) {
      @Override
      public String getValue(ContactInfo object) {
        return object.getFirstName();
      }
    };
    firstNameColumn.setSortable(true);
    sortHandler.setComparator(firstNameColumn, new Comparator<ContactInfo>() {
      public int compare(ContactInfo o1, ContactInfo o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
      }
    });
    cellTable.addColumn(firstNameColumn, constants.cwCellTableColumnFirstName());
    firstNameColumn.setFieldUpdater(new FieldUpdater<ContactInfo, String>() {
      public void update(int index, ContactInfo object, String value) {
        // Called when the user changes the value.
        object.setFirstName(value);
        ContactDatabase.get().refreshDisplays();
      }
    });
    cellTable.setColumnWidth(firstNameColumn, 20, Unit.PCT);

    // Last name.
    Column<ContactInfo, String> lastNameColumn = new Column<ContactInfo, String>(
        new EditTextCell()) {
      @Override
      public String getValue(ContactInfo object) {
        return object.getLastName();
      }
    };
    lastNameColumn.setSortable(true);
    sortHandler.setComparator(lastNameColumn, new Comparator<ContactInfo>() {
      public int compare(ContactInfo o1, ContactInfo o2) {
        return o1.getLastName().compareTo(o2.getLastName());
      }
    });
    cellTable.addColumn(lastNameColumn, constants.cwCellTableColumnLastName());
    lastNameColumn.setFieldUpdater(new FieldUpdater<ContactInfo, String>() {
      public void update(int index, ContactInfo object, String value) {
        // Called when the user changes the value.
        object.setLastName(value);
        ContactDatabase.get().refreshDisplays();
      }
    });
    cellTable.setColumnWidth(lastNameColumn, 20, Unit.PCT);

    // Category.
    final Category[] categories = ContactDatabase.get().queryCategories();
    List<String> categoryNames = new ArrayList<String>();
    for (Category category : categories) {
      categoryNames.add(category.getDisplayName());
    }
    SelectionCell categoryCell = new SelectionCell(categoryNames);
    Column<ContactInfo, String> categoryColumn = new Column<ContactInfo, String>(
        categoryCell) {
      @Override
      public String getValue(ContactInfo object) {
        return object.getCategory().getDisplayName();
      }
    };
    cellTable.addColumn(categoryColumn, constants.cwCellTableColumnCategory());
    categoryColumn.setFieldUpdater(new FieldUpdater<ContactInfo, String>() {
      public void update(int index, ContactInfo object, String value) {
        for (Category category : categories) {
          if (category.getDisplayName().equals(value)) {
            object.setCategory(category);
          }
        }
        ContactDatabase.get().refreshDisplays();
      }
    });
    cellTable.setColumnWidth(categoryColumn, 130, Unit.PX);

    // Address.
    Column<ContactInfo, String> addressColumn = new Column<ContactInfo, String>(
        new TextCell()) {
      @Override
      public String getValue(ContactInfo object) {
        return object.getAddress();
      }
    };
    addressColumn.setSortable(true);
    sortHandler.setComparator(addressColumn, new Comparator<ContactInfo>() {
      public int compare(ContactInfo o1, ContactInfo o2) {
        return o1.getAddress().compareTo(o2.getAddress());
      }
    });
    cellTable.addColumn(addressColumn, constants.cwCellTableColumnAddress());
    cellTable.setColumnWidth(addressColumn, 60, Unit.PCT);
  }
}
