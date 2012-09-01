package com.plr.iso29110.server.bonita.executor;

import java.util.Map;

import org.ow2.bonita.facade.QueryRuntimeAPI;
import org.ow2.bonita.facade.RuntimeAPI;
import org.ow2.bonita.facade.exception.ActivityNotFoundException;
import org.ow2.bonita.facade.exception.IllegalTaskStateException;
import org.ow2.bonita.facade.exception.InstanceNotFoundException;
import org.ow2.bonita.facade.exception.TaskNotFoundException;
import org.ow2.bonita.facade.exception.VariableNotFoundException;
import org.ow2.bonita.facade.uuid.ActivityInstanceUUID;
import org.ow2.bonita.facade.uuid.ProcessInstanceUUID;
import org.ow2.bonita.light.LightProcessInstance;
import org.ow2.bonita.util.AccessorUtil;

public abstract class TaskExecutor {
	private final ActivityInstanceUUID activityInstanceUUID;
	private final LightProcessInstance lightProcessInstance;
	private ProcessInstanceUUID processInstanceUUID;
	private RuntimeAPI runtimeAPI;
	private QueryRuntimeAPI queryRuntimeAPI;

	public TaskExecutor(String taskId) throws TaskNotFoundException, InstanceNotFoundException {
		runtimeAPI = AccessorUtil.getRuntimeAPI();
		activityInstanceUUID = new ActivityInstanceUUID(taskId);
		processInstanceUUID = queryRuntimeAPI.getLightTaskInstance(activityInstanceUUID).getProcessInstanceUUID();
		lightProcessInstance = queryRuntimeAPI.getLightProcessInstance(processInstanceUUID);
	}

	public void executeTask(Map<String, Object> processInstanceVariables, Map<String, Object> activityInstanceVariables)
			throws TaskNotFoundException, IllegalTaskStateException, InstanceNotFoundException, VariableNotFoundException,
			ActivityNotFoundException {
		runtimeAPI.startTask(activityInstanceUUID, true);

		ProcessInstanceUUID piuuid = lightProcessInstance.getProcessInstanceUUID();

		if (processInstanceVariables != null && !processInstanceVariables.isEmpty()) {
			runtimeAPI.setProcessInstanceVariables(piuuid, processInstanceVariables);
		}

		if (activityInstanceVariables != null && !activityInstanceVariables.isEmpty()) {
			runtimeAPI.setActivityInstanceVariables(activityInstanceUUID, activityInstanceVariables);
		}

		runtimeAPI.finishTask(activityInstanceUUID, true);
	}
}
