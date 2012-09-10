package com.plr.iso29110.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.base.Splitter;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.plr.iso29110.client.bonitaform.BonitaFormAdapter;
import com.plr.iso29110.client.bugsReview.BugsReviewList;
import com.plr.iso29110.client.processDefinition.ProcessDefinitions;
import com.plr.iso29110.client.processInstances.ProcessInstances;
import com.plr.iso29110.client.processStat.ProcessStart;
import com.plr.iso29110.client.reviewBug.ReviewBug;
import com.plr.iso29110.client.submitBug.SubmitBug;
import com.plr.iso29110.client.task.TaskDisplay;
import com.plr.iso29110.client.welcome.Welcome;

public class HistoryManager implements ValueChangeHandler<String>, ApplicationConst {

	private final RootLayoutPanel rootPanel;

	public HistoryManager() {

		rootPanel = RootLayoutPanel.get();

		History.addValueChangeHandler(this);

		// When you reload, stay on the same page
		String hash = Window.Location.getHash();

		History.newItem("");

		if (hash.startsWith("#")) {
			hash = hash.substring(1);
		}

		History.newItem(hash);
	}

	static private final Splitter splitter = Splitter.on('/');

	@Override
	public void onValueChange(ValueChangeEvent<String> event) {

		String value = event.getValue();

		List<String> params = new ArrayList<String>();
		for (String s : splitter.split(value)) {
			params.add(s);
		}

		if (SUBMIT_BUG.equals(value)) {
			rootPanel.clear();
			SubmitBug submitBug = new SubmitBug();
			rootPanel.add(submitBug);
		} else if (BUGS_TO_REVIEW.equals(value)) {
			rootPanel.clear();
			BugsReviewList view = new BugsReviewList();
			rootPanel.add(view);
		} else if (PROCESS_INSTANCES.equals(value)) {
			rootPanel.clear();
			ProcessInstances view = new ProcessInstances();
			rootPanel.add(view);
		} else if (PROCESS_DEFINITIONS.equals(value)) {
			rootPanel.clear();
			ProcessDefinitions view = new ProcessDefinitions();
			rootPanel.add(view);

		} else if (value.startsWith(TASK)) {

			if (value.charAt(TASK.length()) == '/') {
				String taskId = value.substring(TASK.length() + 1);

				rootPanel.clear();
				TaskDisplay view = new TaskDisplay(taskId);
				rootPanel.add(view);
			}

		} else if (value.startsWith(REVIEW_BUG)) {

			if (value.charAt(REVIEW_BUG.length()) == '/') {
				String taskId = value.substring(REVIEW_BUG.length() + 1);

				rootPanel.clear();

				ReviewBug reviewBug = new ReviewBug();

				rootPanel.add(reviewBug);

				reviewBug.setTaskId(taskId);
			}
		} else if (params.get(0).equals(BONITA_FORM)) {

			Map<String, Object> urlContext = new HashMap<String, Object>();

			String urlContextParams = params.get(1);

			Splitter urlContextParamsSplitter = Splitter.on('&');
			Splitter urlContextParamsSplitter2 = Splitter.on('=');
			for (String s : urlContextParamsSplitter.split(urlContextParams)) {

				String key = null;
				String value1 = null;
				int i = 0;
				for (String ss : urlContextParamsSplitter2.split(s)) {
					if (i == 0) {
						key = ss;
						i++;
					} else {
						value1 = ss;
					}
				}
				urlContext.put(key, value1);
			}

			rootPanel.clear();

			BonitaFormAdapter view = new BonitaFormAdapter(urlContext);

			rootPanel.add(view);
		} else if (params.get(0).equals(PROCESS_START)) {

			String processDefId = params.get(1);
			String version = params.get(2);

			rootPanel.clear();

			ProcessStart view = new ProcessStart(processDefId, version);

			rootPanel.add(view);

		} else {
			History.newItem("", false);
			rootPanel.clear();
			Welcome welcome = new Welcome();
			rootPanel.add(welcome);
		}

		// if (!l.isEmpty() && FLASH.equals(l.get(0))) {
		//
		// if (l.size() > 1 && STATS.equals(l.get(1))) {
		// rootPanel.clear();
		// FlashCardSystem mc = new FlashCardSystem();
		// rootPanel.add(mc.getStatTable());
		//
		// return;
		// }
		//
		// rootPanel.clear();
		// FlashCardSystem mc = new FlashCardSystem();
		// rootPanel.add(mc);
		//
		// } else if (SHI_SHENME.equals(value)) {
		// rootPanel.clear();
		// ShiShenmeSystem charDictionnary = new ShiShenmeSystem();
		// rootPanel.add(charDictionnary);
		// } else if (value.startsWith(CHARARCTER)) {
		//
		// if (value.charAt(CHARARCTER.length()) == '/') {
		// String charId = value.substring(CHARARCTER.length() + 1);
		//
		// rootPanel.clear();
		// ZwCharDetails charDetails = new ZwCharDetails();
		// rootPanel.add(charDetails);
		//
		// charDetails.setCharaterId(charId);
		// }
		// } else if (value.equals(DICTIONNARY)) {
		// rootPanel.clear();
		// ZwCharBrowser charDictionnary = new ZwCharBrowser();
		// rootPanel.add(charDictionnary);
		// } else {
		// History.newItem("", false);
		// rootPanel.clear();
		// Welcome welcome = new Welcome();
		// rootPanel.add(welcome);
		// }
	}
}
