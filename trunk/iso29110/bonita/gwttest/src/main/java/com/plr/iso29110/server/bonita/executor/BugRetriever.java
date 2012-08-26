package com.plr.iso29110.server.bonita.executor;

import java.util.Map;

import org.ow2.bonita.facade.QueryRuntimeAPI;
import org.ow2.bonita.facade.exception.ActivityNotFoundException;
import org.ow2.bonita.facade.exception.InstanceNotFoundException;
import org.ow2.bonita.facade.uuid.ActivityInstanceUUID;
import org.ow2.bonita.facade.uuid.ProcessInstanceUUID;
import org.ow2.bonita.light.LightActivityInstance;
import org.ow2.bonita.util.AccessorUtil;

import com.plr.iso29110.shared.Bug;

public class BugRetriever {
	private String taskId;
	private final ActivityInstanceUUID activityInstanceUUID;
	private final LightActivityInstance lightActivityInstance;
	private final ProcessInstanceUUID processInstanceUUID;
	private QueryRuntimeAPI queryRuntimeAPI;

	public BugRetriever(String taskId) throws ActivityNotFoundException {
		queryRuntimeAPI = AccessorUtil.getQueryRuntimeAPI();
		this.taskId = taskId;
		activityInstanceUUID = new ActivityInstanceUUID(taskId);
		lightActivityInstance = queryRuntimeAPI.getLightActivityInstance(activityInstanceUUID);
		processInstanceUUID = lightActivityInstance.getProcessInstanceUUID();
	}

	public Bug retrieve() throws InstanceNotFoundException {
		return initializeBug();
	}

	private Bug initializeBug() throws InstanceNotFoundException {
		Bug bug = new Bug();
		Map<String, Object> variables = getCaseVariables();
		bug.setTaskId(taskId);
		bug.setProject((String) variables.get("project"));
		bug.setDescription((String) variables.get("summary"));
		bug.setVersion((String) variables.get("version"));
		return bug;
	}

	private Map<String, Object> getCaseVariables() throws InstanceNotFoundException {
		return queryRuntimeAPI.getProcessInstanceVariables(processInstanceUUID);
	}

}
