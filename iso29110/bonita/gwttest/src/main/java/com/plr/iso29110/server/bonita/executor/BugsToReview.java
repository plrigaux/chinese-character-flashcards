package com.plr.iso29110.server.bonita.executor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.ow2.bonita.facade.QueryRuntimeAPI;
import org.ow2.bonita.facade.runtime.ActivityState;
import org.ow2.bonita.light.LightTaskInstance;
import org.ow2.bonita.util.AccessorUtil;

import com.plr.iso29110.shared.Bug;

public class BugsToReview {
	private QueryRuntimeAPI queryRuntimeAPI;

	public BugsToReview() {
		queryRuntimeAPI = AccessorUtil.getQueryRuntimeAPI();
	}

	public List<Bug> retrieve() {
		List<Bug> bugs = new ArrayList<Bug>();

//		for (ActivityState as : ActivityState.values()) {
//
//			getTasks(as);
//		}

		Collection<LightTaskInstance> lightTaskList = getTasks(ActivityState.READY);

		for (LightTaskInstance lightTaskInstance : lightTaskList)
			if (lightTaskInstance.getActivityName().equals("Review_bug"))
				bugs.add(createBugForBugsToReviewList(lightTaskInstance));

		return bugs;
	}

	private Collection<LightTaskInstance> getTasks(ActivityState as) {
		Collection<LightTaskInstance> lightTaskList;
		lightTaskList = queryRuntimeAPI.getLightTaskList(as);

//		System.out.println("" + as + "lightTaskList size " + lightTaskList.size());
//		System.out.println("" + as + "lightTaskList " + lightTaskList);

		return lightTaskList;
	}

	private Bug createBugForBugsToReviewList(LightTaskInstance lightTaskInstance) {
		Bug bug = new Bug();
		bug.setCreationDate(lightTaskInstance.getCreatedDate());
		bug.setName(lightTaskInstance.getActivityLabel());
		bug.setExecutionId(lightTaskInstance.getProcessInstanceUUID().toString());
		bug.setTaskId(lightTaskInstance.getUUID().toString());
		return bug;
	}
}