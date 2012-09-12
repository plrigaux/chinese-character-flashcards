package com.plr.iso29110.client.bonitaform;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.bonitasoft.console.client.ItemUpdates;
import org.bonitasoft.console.client.cases.CaseFilter;
import org.bonitasoft.console.client.cases.CaseItem;
import org.bonitasoft.console.client.cases.CaseUUID;
import org.bonitasoft.console.client.cases.CasesConfiguration;
import org.bonitasoft.console.client.common.RpcConsoleServices;
import org.bonitasoft.console.client.common.data.AsyncHandler;
import org.bonitasoft.console.client.controller.UserRightsManager;
import org.bonitasoft.console.client.events.ModelChangeListener;
import org.bonitasoft.console.client.i18n.ConsoleMessages;
import org.bonitasoft.console.client.i18n.LocaleUtil;
import org.bonitasoft.console.client.labels.LabelModel;
import org.bonitasoft.console.client.labels.LabelUUID;
import org.bonitasoft.console.client.model.ItemSelection;
import org.bonitasoft.console.client.model.cases.CaseDataSource;
import org.bonitasoft.console.client.model.cases.CaseDataSourceImpl;
import org.bonitasoft.console.client.model.cases.CaseSelection;
import org.bonitasoft.console.client.steps.CommentItem;
import org.bonitasoft.console.client.steps.StepItem;
import org.bonitasoft.console.client.users.UserProfile;
import org.bonitasoft.console.client.users.UserUUID;
import org.bonitasoft.console.client.view.cases.CaseCommentEditorWidget;
import org.bonitasoft.console.security.client.privileges.RuleType;
import org.bonitasoft.console.security.client.users.User;
import org.bonitasoft.forms.client.view.common.DOMUtils;
import org.bonitasoft.forms.client.view.controller.FormViewControllerFactory;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.plr.iso29110.client.ApplicationConst;
import com.plr.iso29110.client.Utils;
import com.plr.iso29110.client.login.LoginWidget;

public class BonitaFormAdapter extends Composite implements ApplicationConst {
	static final ConsoleMessages messages = (ConsoleMessages) GWT.create(ConsoleMessages.class);
	private static WelcomeUiBinder uiBinder = GWT.create(WelcomeUiBinder.class);

	interface WelcomeUiBinder extends UiBinder<Widget, BonitaFormAdapter> {
	}

	@UiField
	HTMLPanel applicationHTMLPanel;

	@UiField
	HTMLPanel static_application;

	@UiField
	HTMLPanel commentsPanel;

	@UiField
	FlexTable commentsTable;

	final String applicationHTMLPanelId;

	final String static_applicationId;

	private CaseItem myCase;

	private CaseFilter aFilter;

	public BonitaFormAdapter(final Map<String, Object> urlContext) {
		initWidget(uiBinder.createAndBindUi(this));

		applicationHTMLPanel.getElement().setId(DOM.createUniqueId());
		applicationHTMLPanelId = applicationHTMLPanel.getElement().getId();
		static_application.getElement().setId(DOM.createUniqueId());
		static_applicationId = static_application.getElement().getId();

		// hack
		DOMUtils.getInstance().setApplicationHTMLPanel(static_application);

		final String formID = "" + urlContext.get("form");

		RpcConsoleServices.getLoginService().consoleIsAlreadyLoggedIn("en", formID, urlContext, new AsyncCallback<UserProfile>() {

			@Override
			public void onFailure(Throwable caught) {

			}

			@Override
			public void onSuccess(UserProfile result) {

				LoginWidget.getLogin().setUserProfile(result);

				User aUser = LoginWidget.getLogin().getUser();

				FormViewControllerFactory.getFormApplicationViewController(formID, urlContext, aUser).createFormInitialView(
						applicationHTMLPanelId);

				getComments(urlContext);

			}
		});

	}

	private void getComments(Map<String, Object> urlContext) {
		String userName = LoginWidget.getUsername();

		if (userName == null) {
			return;
		}

		String aValue = "" + urlContext.get(CASEID);

		CaseUUID anCaseUUID = new CaseUUID(aValue);
		LabelModel aLabelUUIDCollection = new LabelModel(LabelModel.INBOX_LABEL, new UserUUID(userName));
		Collection<LabelUUID> theLabels = new ArrayList<LabelUUID>();
		theLabels.add(aLabelUUIDCollection.getUUID());

		aFilter = new CaseFilter(theLabels, 0, 100);

		RpcConsoleServices.getCaseService().getCase(anCaseUUID, aFilter, new AsyncCallback<CaseItem>() {

			@Override
			public void onFailure(Throwable caught) {
				System.err.println(caught.getMessage());

			}

			@Override
			public void onSuccess(CaseItem result) {
				myCase = result;
				
				for (StepItem si : result.getSteps()) {
					
					System.out.println(si.getLabel() + " " + si.getState() + " " + si.getAuthor() + " " + si.getLastUpdateDate());
				}
				
				RpcConsoleServices.getCaseService().getCaseCommentFeed(myCase.getUUID(), aFilter,
						new AsyncCallback<List<CommentItem>>() {

							@Override
							public void onSuccess(List<CommentItem> result) {
								fillinCommentsTable(result);
							}

							@Override
							public void onFailure(Throwable caught) {
								System.err.println(caught.getMessage());
							}
						});
			}

		});

	}

	protected static final int ACTION_COL = 2;
	protected static final int CONTENT_COL = 1;
	protected static final int AUTHOR_COL = 1;
	protected static final int DATE_COL = 0;
	protected static final int NEW_CONTENT_COL = 0;

	protected static final String MODE_SELECTOR = "AbstractCaseEditorWidget_mode_selector";
	protected static final String CASE_EDITOR_STYLE = "case_editor";

	protected static final String BOS_OPENSTEPS_PANEL_STYLE = "bos_opensteps_panel";
	protected static final String BOS_COMMENT_PANEL_STYLE = "bos_comment_panel";
	protected static final String BOS_OVERVIEW_PANEL_STYLE = "bos_overview_panel";
	protected static final String BOS_INNER_PANEL_STYLE = "bos_inner_panel";

	protected static final String COMMENT_TABLE_STYLE = "bos_comment_table";
	protected static final String COMMENT_CONTENT_STYLE = "bos_comment_content";
	protected static final String COMMENT_DATE_STYLE = "bos_comment_date";
	protected static final String COMMENT_AUTHOR_STYLE = "bos_comment_author";
	protected static final String COMMENT_ACTION_STYLE = "bos_comment_action";

	protected static final String EVEN_STYLE = "bos_row_even";
	protected static final String ODD_STYLE = "bos_row_odd";

	protected void fillinCommentsTable(List<CommentItem> aCommentList) {
		int i = 0;
		if (aCommentList != null && !aCommentList.isEmpty()) {
			
			commentsTable.clear();
			for (CommentItem theCommentItem : aCommentList) {
				commentsTable.setHTML(i, DATE_COL, LocaleUtil.shortDateFormat(theCommentItem.getDate()));
				commentsTable.setHTML(i, AUTHOR_COL, theCommentItem.getUserUUID().getValue());
				/* CSS Style */
				commentsTable.getFlexCellFormatter().setStylePrimaryName(i, DATE_COL, COMMENT_DATE_STYLE);
				commentsTable.getFlexCellFormatter().setStylePrimaryName(i, AUTHOR_COL, COMMENT_AUTHOR_STYLE);
				commentsTable.getFlexCellFormatter().setColSpan(i, DATE_COL, 1);
				commentsTable.getFlexCellFormatter().setColSpan(i, AUTHOR_COL, 1);
				if (i % 2 == 0) {
					commentsTable.getRowFormatter().setStyleName(i, EVEN_STYLE);
				} else {
					commentsTable.getRowFormatter().setStyleName(i, ODD_STYLE);
				}
				i++;
				String theComment = theCommentItem.getContent();
				theComment = toMultiLine(theComment, commentsTable.getOffsetWidth() / 10);
				commentsTable.setText(i, CONTENT_COL, theComment);
				commentsTable.setHTML(i, ACTION_COL, "");
				/* CSS Style */
				commentsTable.getFlexCellFormatter().setStylePrimaryName(i, CONTENT_COL, COMMENT_CONTENT_STYLE);
				commentsTable.getFlexCellFormatter().setStylePrimaryName(i, ACTION_COL, COMMENT_ACTION_STYLE);
				commentsTable.getFlexCellFormatter().setColSpan(i, CONTENT_COL, 2);
				commentsTable.getFlexCellFormatter().setColSpan(i, ACTION_COL, 1);
				if (i % 2 == 0) {
					commentsTable.getRowFormatter().setStyleName(i, EVEN_STYLE);
				} else {
					commentsTable.getRowFormatter().setStyleName(i, ODD_STYLE);
				}
				i++;
			}
		} else {
			// Archived cases without comment shows information
			if (myCase.isArchived()) {
				commentsTable.setHTML(1, CONTENT_COL, messages.noCommentsAttached());
				commentsTable.getRowFormatter().setStyleName(1, ODD_STYLE);
			} else {
				commentsTable.clear();
			}
		}
		// Archived cases have to be considered as readonly.

		CaseDataSource caseDataSource = new CaseDataSource() {
			
			@Override
			public void removeModelChangeListener(String aPropertyName, ModelChangeListener aListener) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public List<CaseUUID> getVisibleItems() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void addModelChangeListener(String aPropertyName, ModelChangeListener aListener) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateItem(CaseUUID anUUID, CaseItem anItem, AsyncHandler<CaseItem> aHandler) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setItemFilter(CaseFilter aFilter) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void reload() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void listItems(CaseFilter aFilter, AsyncHandler<ItemUpdates<CaseItem>> aHandler) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public int getSize() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void getItems(List<CaseUUID> aUUIDSelection, AsyncHandler<List<CaseItem>> aHandler) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public ItemSelection<CaseUUID> getItemSelection() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public CaseFilter getItemFilter() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void getItem(CaseUUID anUUID, AsyncHandler<CaseItem> aHandler) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public CaseItem getItem(CaseUUID anUUID) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void deleteItems(List<CaseUUID> anItemSelection, AsyncHandler<ItemUpdates<CaseItem>> aHandler) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void addItem(CaseItem anItem, AsyncHandler<ItemUpdates<CaseItem>> aHandler) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void updateConfiguration(CasesConfiguration aNewConfiguration, AsyncHandler<CasesConfiguration> aHandler) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void synchronizeDBs(AsyncHandler<Void> aHandler) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void getConfiguration(AsyncHandler<CasesConfiguration> aHandler) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public CaseSelection getCaseSelection() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void getCaseCommentFeed(CaseUUID aCaseUUID, AsyncHandler<List<CommentItem>> aHandler) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void deleteCases(List<CaseUUID> aItemSelection, boolean deleteAttachments) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void cancelCases(List<CaseUUID> anItemSelection) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void addCaseComment(final CaseUUID aCaseUUID, final String aComment,
					final AsyncHandler<List<CommentItem>> aHandler) {
				if (aCaseUUID != null && aComment != null && aComment.length() > 0) {

					RpcConsoleServices.getCaseService().addCommentToCase(aCaseUUID, aComment, aFilter,
							new AsyncCallback<List<CommentItem>>() {

								@Override
								public void onFailure(Throwable caught) {
									Utils.errorManagement(caught);

								}

								@Override
								public void onSuccess(List<CommentItem> result) {
									if (result != null) {
										fillinCommentsTable(result);
									}

								}
							});
				}

			}
		};

		if (!myCase.isArchived()) {
			if (UserRightsManager.getInstance().isAllowed(RuleType.PROCESS_ADD_COMMENT, myCase.getProcessUUID().getValue())) {
				commentsTable.setWidget(i, NEW_CONTENT_COL, new CaseCommentEditorWidget(caseDataSource, myCase));
				commentsTable.getFlexCellFormatter().setColSpan(i, NEW_CONTENT_COL, 3);
				commentsPanel.setVisible(true);
			} else {
				commentsPanel.setVisible(false);
			}
		}
	}

	public static String toMultiLine(String str, int len) {
		char[] chs = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0, sum = 0; i < chs.length; i++) {
			sum += chs[i] < 0xff ? 1 : 2;
			sb.append(chs[i]);
			if (sum >= len || chs[i] == 10 || chs[i] == 13) {
				sum = 0;
				sb.append("\n");
			}
		}
		return sb.toString();
	}
}
