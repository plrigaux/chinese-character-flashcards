package org.bonitasoft.forms.client.view.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bonitasoft.forms.client.model.HeadNode;

import com.google.gwt.dom.client.NodeList;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Utility Class form DOM manipulation
 * 
 * @author Anthony Birembaut
 */
public class DOMUtils {

	/**
	 * ID of the element containing the static html part of the entry point
	 */
	public static final String STATIC_CONTENT_ELEMENT_ID = "static_application";

	/**
	 * Mandatory frame id for the forms application when the form is in a frame
	 */
	public static final String DEFAULT_FORM_ELEMENT_ID = "bonita_form";

	/**
	 * Id of the element of the page template in witch the title has to be
	 * injected
	 */
	public static final String PAGE_LABEL_ELEMENT_ID = "bonita_form_page_label";

	/**
	 * Instance attribute
	 */
	protected static DOMUtils INSTANCE = null;

	private final String CSS_ID_PRE = "CSS_";

	/**
	 * @return the view controller instance
	 */
	public static DOMUtils getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DOMUtils();
		}
		return INSTANCE;
	}

	/**
	 * Private contructor to prevent instantiation
	 */
	protected DOMUtils() {
		super();
	}

	/**
	 * Deals with the whole page template injection
	 * 
	 * @param headNodes
	 * @param pageHTMLPanel
	 * @param bodyAttributes
	 * @param list
	 * @param elementId
	 * @return the onload attribute value if it exists, null otherwise
	 */
	public String insertPageTemplate(final List<HeadNode> headNodes, final HTMLPanel pageHTMLPanel,
			final Map<String, String> bodyAttributes, final HTMLPanel processHTMLPanel, final String elementId) {

		addHeaders(headNodes);
		addPageContent(pageHTMLPanel, processHTMLPanel, elementId);
		final String onloadValue = addBodyAttributes(bodyAttributes);
		if (isPageInFrame()) {
			setBodyTransparency();
		}
		return onloadValue;
	}

	/**
	 * set the body of the page transparency
	 */
	protected void setBodyTransparency() {

		final String existingClassName = RootPanel.getBodyElement().getClassName();
		if (existingClassName != null && existingClassName.length() > 0) {
			RootPanel.getBodyElement().setClassName("bonita_transparent_body " + existingClassName);
		} else {
			RootPanel.getBodyElement().setClassName("bonita_transparent_body");
		}
	}

	protected Element getHeadElement() {
		Element headElement = null;
		final Element documentElement = DOM.getParent(RootPanel.getBodyElement());
		final int documentChildrenCount = DOM.getChildCount(documentElement);
		for (int i = 0; i < documentChildrenCount; i++) {
			final Element documentChildElement = DOM.getChild(documentElement, i);
			if ("head".equalsIgnoreCase(documentChildElement.getNodeName())) {
				headElement = documentChildElement;
				break;
			}
		}
		return headElement;
	}

	/**
	 * @param headNodes
	 */
	public void addHeaders(final List<HeadNode> headNodes) {
		Element headElement = getHeadElement();
		if (headElement != null) {
			for (final HeadNode headNode : headNodes) {
				if (isHeadNodeUseful(headNode)) {
					if (!isContainHeadNode(headElement, headNode)) {
						// removeOldHeaderElementIfPresent(headElement,
						// headNode);
						final Element headChildElement = DOM.createElement(headNode.getTagName());
						for (final Entry<String, String> attributeEntry : headNode.getAttributes().entrySet()) {
							headChildElement.setAttribute(attributeEntry.getKey(), attributeEntry.getValue());
						}
						if (headNode.getInnerHtml() != null && headNode.getInnerHtml().length() > 0) {
							headChildElement.setInnerText(headNode.getInnerHtml());
						}
						headElement.appendChild(headChildElement);
					}
					if ("title".equalsIgnoreCase(headNode.getTagName())) {
						Window.setTitle(headNode.getInnerHtml());
					}
				}
			}
		}
	}

	private boolean isContainHeadNode(final Element headElement, final HeadNode headNode) {
		boolean isContained = false;
		final Map<String, String> attribeteMap = headNode.getAttributes();
		final String headInnerHtml = headNode.getInnerHtml();
		final int childrenCount = DOM.getChildCount(headElement);
		for (int i = 0; i < childrenCount; i++) {
			final Element childElement = DOM.getChild(headElement, i);

			boolean isSameNode = true;
			int theIndex = 0;
			if (headNode.getTagName().equalsIgnoreCase(childElement.getTagName())) {
				final String childElementValue = childElement.getInnerHTML();
				boolean innerHtml = false;
				if (headInnerHtml == null && childElementValue == null) {
					innerHtml = true;
				} else if (headInnerHtml != null && childElementValue != null) {
					if (headInnerHtml.equals(childElementValue)) {
						innerHtml = true;
					}
				}
				if (innerHtml) {
					for (final Entry<String, String> attributeEntry : attribeteMap.entrySet()) {
						if (!isSameNode) {
							break;
						}
						final String attributeKey = attributeEntry.getKey();
						final String attribeteValue = attributeEntry.getValue();
						if (childElement.hasAttribute(attributeKey)) {
							final String childElementAttributeValue = childElement.getAttribute(attributeKey);
							isSameNode = childElementAttributeValue.equals(attribeteValue);
							if (isSameNode) {
								theIndex++;
							}
						}

					}

					if (theIndex == attribeteMap.size()) {
						isContained = true;
						break;
					}
				}

			}
		}
		return isContained;
	}

	/**
	 * Deals with the whole application template injection
	 * 
	 * @param headNodes
	 * @param applicationHTMLPanel
	 * @param bodyAttributes
	 * @return the onload attribute value if it exists, null otherwise
	 */
	public String insertApplicationTemplate(final List<HeadNode> headNodes, final HTMLPanel applicationHTMLPanel,
			final Map<String, String> bodyAttributes) {

		addHeaders(headNodes);
		addApplicationContent(applicationHTMLPanel, STATIC_CONTENT_ELEMENT_ID);
		cleanBodyAttributes();
		return addBodyAttributes(bodyAttributes);
	}

	/**
	 * Add a stylesheet link is the link does not still exist
	 */
	public void addStyleSheetLink(String cssFileName) {
		final String theme = cssFileName.substring(0, cssFileName.length() - 4); // remove
																					// ".css"
		final List<HeadNode> cssLinks = new ArrayList<HeadNode>();
		if (!isStylesheetExist(theme)) {
			HeadNode cssLink = new HeadNode();
			cssLink.setTagName("link");
			Map<String, String> attributes = new HashMap<String, String>();
			attributes.put("type", "text/css");
			attributes.put("rel", "stylesheet");
			attributes.put("href", "consoleResource?location=" + cssFileName);
			attributes.put("title", theme);
			attributes.put("id", theme);
			cssLink.setAttributes(attributes);
			cssLinks.add(cssLink);
			DOMUtils.getInstance().addHeaders(cssLinks);
		}
	}

	/**
	 * Add a theme stylesheet link is the link does not still exist
	 */
	@Deprecated
	public void addThemeStyleSheetLink(String themeName, String[] cssNames, String[] cssFileNames) {
		final List<HeadNode> cssLinks = new ArrayList<HeadNode>();
		for (int i = 0; i < cssNames.length; i++) {
			if (!isStylesheetExist(CSS_ID_PRE + cssNames[i])) {
				HeadNode cssLink = new HeadNode();
				cssLink.setTagName("link");
				Map<String, String> attributes = new HashMap<String, String>();
				attributes.put("type", "text/css");
				attributes.put("rel", "stylesheet");
				attributes.put("href", "themeResource?location=" + cssFileNames[i] + "&theme=" + themeName);
				attributes.put("title", cssNames[i]);
				attributes.put("id", CSS_ID_PRE + cssNames[i]);
				cssLink.setAttributes(attributes);
				cssLinks.add(cssLink);
				DOMUtils.getInstance().addHeaders(cssLinks);
			}
		}
	}

	/**
	 * Find if a link of a stylesheet is in the header
	 */
	protected boolean isStylesheetExist(String cssName) {
		boolean result = false;
		Element cssElement = DOM.getElementById(cssName);
		if (cssElement != null) {
			result = true;
		}
		return result;
	}

	/**
	 * clean the body attributes
	 */
	protected void cleanBodyAttributes() {
		final Element bodyElement = RootPanel.getBodyElement();
		bodyElement.removeAttribute("class");
		bodyElement.removeAttribute("style");
		bodyElement.removeAttribute("onload");
	}

	/**
	 * Replace the content of the body by the template body
	 * 
	 * @param applicationHTMLPanel
	 * @param elementId
	 */
	protected void addApplicationContent(final HTMLPanel applicationHTMLPanel, final String elementId) {

		RootPanel container = RootPanel.get(elementId);
		if (container == null) {
			container = RootPanel.get();
		}
		container.clear();
		container.add(applicationHTMLPanel);
		addScriptElementToDOM(applicationHTMLPanel.getElement(), container.getElement());
	}

	/**
	 * Replace the content of the body by the template body
	 * 
	 * @param pageHTMLPanel
	 * @param processHTMLPanel
	 * @param elementId
	 */
	protected void addPageContent(final HTMLPanel pageHTMLPanel, final HTMLPanel processHTMLPanel, final String elementId) {

		if (processHTMLPanel != null) {
			processHTMLPanel.add(pageHTMLPanel, elementId);
			addScriptElementToDOM(pageHTMLPanel.getElement(), processHTMLPanel.getElement());
		} else {
			// RootPanel container = RootPanel.get(STATIC_CONTENT_ELEMENT_ID);
			static_application.clear();
			static_application.add(pageHTMLPanel);
			addScriptElementToDOM(pageHTMLPanel.getElement(), static_application.getElement());
		}
	}

	/**
	 * Add the body attributes
	 * 
	 * @param bodyAttributes
	 * @return the onload attribute value if it exists, null otherwise
	 */
	protected String addBodyAttributes(final Map<String, String> bodyAttributes) {

		String onloadValue = null;
		if (bodyAttributes != null && !bodyAttributes.isEmpty()) {
			final Element bodyElement = RootPanel.getBodyElement();
			for (final Entry<String, String> bodyAttribute : bodyAttributes.entrySet()) {
				if ("class".equalsIgnoreCase(bodyAttribute.getKey())) {
					bodyElement.setClassName(bodyAttribute.getValue());
				} else {
					if ("onload".equalsIgnoreCase(bodyAttribute.getKey())) {
						onloadValue = bodyAttribute.getValue();
					}
					bodyElement.setAttribute(bodyAttribute.getKey(), bodyAttribute.getValue());
				}
			}
		}
		return onloadValue;
	}

	/**
	 * @param headNode
	 * @return true if the head node present in the template is useful
	 */
	protected boolean isHeadNodeUseful(final HeadNode headNode) {

		if (headNode.getTagName().equalsIgnoreCase("meta")) {
			final Map<String, String> attributes = headNode.getAttributes();
			if (attributes.get("http-equiv") != null && attributes.get("http-equiv").equalsIgnoreCase("content-type")) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Remove an element of the entry point header if it's present in the
	 * template (only for certain elements)
	 * 
	 * @param parentElement
	 * @param headNode
	 */
	protected void removeOldHeaderElementIfPresent(final Element parentElement, final HeadNode headNode) {

		final int headChildrenCount = DOM.getChildCount(parentElement);
		if (headNode.getTagName().equalsIgnoreCase("title")) {
			for (int i = 0; i < headChildrenCount; i++) {
				final Element headChildElement = DOM.getChild(parentElement, i);
				if (headNode.getTagName().equalsIgnoreCase(headChildElement.getTagName())) {
					DOM.removeChild(parentElement, headChildElement);
					break;
				}
			}
		}
	}

	/**
	 * insert a content inside an element
	 * 
	 * @param htmlPanel
	 * @param pageLabelElementId
	 * @param pageLabel
	 */
	public void insertInElement(final HTMLPanel htmlPanel, final String elementId, final String content) {

		insertInElement(htmlPanel, elementId, content, false);
	}

	/**
	 * insert a content inside an element
	 * 
	 * @param htmlPanel
	 * @param pageLabelElementId
	 * @param pageLabel
	 * @param allowHTML
	 */
	public void insertInElement(final HTMLPanel htmlPanel, final String elementId, final String content, final boolean preventHTML) {

		if (htmlPanel != null) {
			final HTML htmlContent = new HTML();
			if (preventHTML) {
				htmlContent.setText(content);
			} else {
				htmlContent.setHTML(content);
			}
			htmlPanel.add(htmlContent, elementId);
		} else {
			final Element element = DOM.getElementById(elementId);
			if (element != null) {
				if (preventHTML) {
					element.setInnerText(content);
				} else {
					element.setInnerHTML(content);
				}
			}
		}
	}

	/**
	 * Remove the required element from the body and remove its css classes
	 * 
	 * @param elementToRemoveId
	 */
	public void cleanBody(final String elementToRemoveId) {

		final Element elementToRemove = DOM.getElementById(elementToRemoveId);
		if (elementToRemove != null) {
			DOM.removeChild(RootPanel.getBodyElement(), elementToRemove);
		}
		RootPanel.getBodyElement().setClassName("");
	}

	/**
	 * simulate a click on the console refresh button (in case the form module
	 * is used inside the console)
	 * 
	 * @return true if the frame was found, false otherwise
	 */
	native public boolean consoleRefresh()
	/*-{
		var formFrameWindow = window.parent;
		if (formFrameWindow != window.top) {
			var consoleWindow = formFrameWindow.parent;
			var refreshContainerElement = consoleWindow.document
					.getElementById("WidgetRefreshCasesContainer");
			if (refreshContainerElement != null) {
				var refreshElement = refreshContainerElement.firstChild;
				if (refreshElement != null) {
					try {//for ie
						refreshElement.click();
					} catch (e) {//for ff
						var evt = document.createEvent("MouseEvents");
						evt.initMouseEvent("click", true, true, consoleWindow,
								0, 0, 0, 0, 0, false, false, false, false, 0,
								null);
						refreshElement.dispatchEvent(evt);
					}
					return true;
				}
			}
		}
		return false;
	}-*/;

	/**
	 * simulate a click on the back to inbox button (in case the form module is
	 * used inside the console)
	 * 
	 * @return true if the frame was found, false otherwise
	 */
	native public boolean consoleRefreshAndRedirectToInbox()
	/*-{
		var formFrameWindow = window.parent;
		if (formFrameWindow != window.top) {
			var consoleWindow = formFrameWindow.parent;
			var refreshElement = consoleWindow.document
					.getElementById("backToInboxButton");
			if (refreshElement != null) {
				try {//for ie
					refreshElement.click();
				} catch (e) {//for ff
					var evt = document.createEvent("MouseEvents");
					evt.initMouseEvent("click", true, true, consoleWindow, 0,
							0, 0, 0, 0, false, false, false, false, 0, null);
					refreshElement.dispatchEvent(evt);
				}
				return true;
			}
		}
		return false;
	}-*/;

	/**
	 * redirect to the case editor (in case the form module is used inside the
	 * console)
	 * 
	 * @param processInstanceUUIDStr
	 * @return true if the frame was found, false otherwise
	 */
	native public boolean consoleRedirectToCase(String processInstanceUUIDStr)
	/*-{
		var formFrameWindow = window.parent;
		if (formFrameWindow != window.top) {
			var consoleWindow = formFrameWindow.parent;
			var refreshElement = consoleWindow.document
					.getElementById("backToInboxButton");
			if (refreshElement != null) {
				try {
					consoleWindow.location.hash = encodeURI("#CaseEditor/jou:"
							+ processInstanceUUIDStr);
				} catch (e1) {
					try {//for ie
						refreshElement.click();
					} catch (e2) {//for ff
						var evt = document.createEvent("MouseEvents");
						evt.initMouseEvent("click", true, true, consoleWindow,
								0, 0, 0, 0, 0, false, false, false, false, 0,
								null);
						refreshElement.dispatchEvent(evt);
					}
				}
				return true;
			}
		}
		return false;
	}-*/;

	/**
	 * resize a frame to fit its content's height this method is meant to be
	 * called in the form frame (not in the application/console window)
	 * 
	 * @param frameId
	 *            the ID of the frame to resize
	 * @return true if the frame was found, false otherwise
	 */
	native public boolean resizeFrame(String frameId)
	/*-{
		var formFrameWindow = window.parent;
		var framePageHeight = formFrameWindow.document.body.offsetHeight + 10;
		if (formFrameWindow != window.top) {
			var parentWindow = formFrameWindow.parent;
			var formFrame = parentWindow.document.getElementById(frameId);
			if (formFrame != null) {
				if (formFrame.scrollHeight < framePageHeight) {
					formFrame.style.height = framePageHeight + "px";
				}
				return true;
			}
		}
		return false;
	}-*/;

	/**
	 * Indicates whether the page is in a frame or not this method is meant to
	 * be called in the form frame (not in the application window)
	 * 
	 * @return true if the page is in a frame
	 */
	native public boolean isPageInFrame()
	/*-{
		var applicationWindow = window.parent;
		if (applicationWindow == window.top) {
			return false;
		} else {
			return true;
		}
	}-*/;

	/**
	 * perform a Javascript evaluation
	 * 
	 * @param jsSourceCode
	 *            the source code to execute
	 */
	native public void javascriptEval(String jsSourceCode)
	/*-{
		$wnd.eval(jsSourceCode);
	}-*/;

	/**
	 * To make script in scriptElements work , need to add script elements in
	 * the currentElement to parentElement
	 * 
	 * @param currentElement
	 * @param parentElement
	 */
	public void addScriptElementToDOM(final Element currentElement, final Element parentElement) {
		final List<Element> list = new ArrayList<Element>();
		final NodeList<com.google.gwt.dom.client.Element> scripts = currentElement.getElementsByTagName("script");
		for (int i = 0; i < scripts.getLength(); i++) {
			list.add((Element) scripts.getItem(i));
		}

		for (int i = 0; i < list.size(); i++) {
			final Element e = list.get(i);
			e.removeFromParent();
			final Element scriptElement = DOM.createElement("script");
			final String type = e.getAttribute("type");
			if (!isEmpty(type)) {
				scriptElement.setAttribute("type", type);
			}
			final String language = e.getAttribute("language");
			if (!isEmpty(language)) {
				scriptElement.setAttribute("language", language);
			}
			final String src = e.getAttribute("src");
			if (!isEmpty(src)) {
				scriptElement.setAttribute("src", src);
			}
			scriptElement.setInnerText(e.getInnerText());
			parentElement.appendChild(scriptElement);
		}
	}

	private boolean isEmpty(final String str) {
		return str == null || str.trim().length() == 0 || str.equals("null");
	}

	public boolean isInternetExplorer() {
		return "Microsoft Internet Explorer".equals(Window.Navigator.getAppName());
	}

	private HTMLPanel static_application;

	public void setApplicationHTMLPanel(HTMLPanel static_application) {
		this.static_application = static_application;

	}

	public HTMLPanel getApplicationHTMLPanel() {
		return this.static_application;
	}
}
