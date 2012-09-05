package com.plr.iso29110.server.bonita.executor;

import java.util.List;
import java.util.Set;

import org.ow2.bonita.facade.QueryDefinitionAPI;
import org.ow2.bonita.facade.QueryRuntimeAPI;
import org.ow2.bonita.facade.RuntimeAPI;
import org.ow2.bonita.facade.def.majorElement.DataFieldDefinition;
import org.ow2.bonita.facade.exception.ActivityDefNotFoundException;
import org.ow2.bonita.facade.exception.ActivityNotFoundException;
import org.ow2.bonita.facade.exception.IllegalTaskStateException;
import org.ow2.bonita.facade.exception.InstanceNotFoundException;
import org.ow2.bonita.facade.exception.ProcessNotFoundException;
import org.ow2.bonita.facade.exception.TaskNotFoundException;
import org.ow2.bonita.facade.exception.VariableNotFoundException;
import org.ow2.bonita.facade.runtime.Document;
import org.ow2.bonita.facade.uuid.ActivityInstanceUUID;
import org.ow2.bonita.facade.uuid.ProcessInstanceUUID;
import org.ow2.bonita.light.LightTaskInstance;
import org.ow2.bonita.search.DocumentCriterion;
import org.ow2.bonita.search.DocumentResult;
import org.ow2.bonita.search.DocumentSearchBuilder;
import org.ow2.bonita.search.index.DocumentIndex;
import org.ow2.bonita.util.AccessorUtil;

import com.plr.iso29110.shared.ActivityState;
import com.plr.iso29110.shared.DataField;
import com.plr.iso29110.shared.DocumentInfo;
import com.plr.iso29110.shared.Task;

public class TaskMangement {
	private final ActivityInstanceUUID activityInstanceUUID;
	private ProcessInstanceUUID processInstanceUUID;
	private QueryRuntimeAPI queryRuntimeAPI;
	private QueryDefinitionAPI queryDefinitionAPI;
	private LightTaskInstance lightTaskInstance;

	public TaskMangement(String taskId) throws TaskNotFoundException {
		queryRuntimeAPI = AccessorUtil.getQueryRuntimeAPI();

		queryDefinitionAPI = AccessorUtil.getQueryDefinitionAPI();

		activityInstanceUUID = new ActivityInstanceUUID(taskId);
		lightTaskInstance = queryRuntimeAPI.getLightTaskInstance(activityInstanceUUID);
		processInstanceUUID = lightTaskInstance.getProcessInstanceUUID();
	}

	public Task getTask() throws ActivityNotFoundException, InstanceNotFoundException, ActivityDefNotFoundException,
			ProcessNotFoundException {

		Set<DataFieldDefinition> activityDataFields = queryDefinitionAPI.getActivityDataFields(lightTaskInstance
				.getActivityDefinitionUUID());
		

		Task t = new Task();

		t.setUUID(lightTaskInstance.getUUID().toString());
		t.setProcessInstanceUUID(processInstanceUUID.toString());
		t.setActivityName(lightTaskInstance.getActivityName());
		t.setActivityLabel(lightTaskInstance.getDynamicLabel());
		t.setActivityDescription(lightTaskInstance.getDynamicDescription());

		
		org.ow2.bonita.facade.runtime.ActivityState as = lightTaskInstance.getState();
		ActivityState activityState = null;
		
		for (ActivityState as2 : ActivityState.values()) {
			
			if (as2.name().equals(as.name())) {
				activityState = as2;
				break;
			}
		}
			
		t.setState(activityState);
		
		t.setLastUpdateDate(lightTaskInstance.getLastUpdateDate());

		t.setActivityInstanceVariables(queryRuntimeAPI.getActivityInstanceVariables(activityInstanceUUID));
		t.setProcessInstanceVariables(queryRuntimeAPI.getProcessInstanceVariables(processInstanceUUID));

		Set<DataFieldDefinition> processDataFields = queryDefinitionAPI.getProcessDataFields(lightTaskInstance
				.getProcessDefinitionUUID());
		
		List<DataField> dataFields = ExecutorUtils.transfert(processDataFields);

		t.setProcessDataFields(dataFields);

		dataFields = ExecutorUtils.transfert(activityDataFields);

		t.setActivityDataFields(dataFields);

		List<DocumentInfo> docs = doDocs();

		t.setDocuments(docs);
		return t;

	}

	private List<DocumentInfo> doDocs() {
		DocumentSearchBuilder dsb = new DocumentSearchBuilder();

		DocumentCriterion dc = dsb.criterion(DocumentIndex.PROCESS_INSTANCE_UUID);
		dc.equalsTo(processInstanceUUID.toString());
		dc.latestVersion();

		DocumentResult res = queryRuntimeAPI.searchDocuments(dsb, 0, 1000);
		List<Document> doclist = res.getDocuments();

		
		return ExecutorUtils.doDocs(doclist);
	}



	public boolean executeTask(Task task) throws TaskNotFoundException, IllegalTaskStateException, InstanceNotFoundException,
			VariableNotFoundException, ActivityNotFoundException {
		RuntimeAPI runtimeAPI = AccessorUtil.getRuntimeAPI();

		if  (org.ow2.bonita.facade.runtime.ActivityState.READY.equals( lightTaskInstance.getState())) {
			runtimeAPI.startTask(activityInstanceUUID, true);
		}
		
		runtimeAPI.setProcessInstanceVariables(processInstanceUUID, task.getProcessInstanceVariables());
		runtimeAPI.setActivityInstanceVariables(activityInstanceUUID, task.getActivityInstanceVariables());

		runtimeAPI.finishTask(activityInstanceUUID, true);
		
		return true;
	}
}
