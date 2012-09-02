package com.plr.iso29110.server.bonita.executor;

import java.util.ArrayList;
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
		Set<DataFieldDefinition> processDataFields = queryDefinitionAPI.getProcessDataFields(lightTaskInstance
				.getProcessDefinitionUUID());

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

		List<DataField> dataFields = transfert(processDataFields);

		t.setProcessDataFields(dataFields);

		dataFields = transfert(activityDataFields);

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

		List<DocumentInfo> docs = new ArrayList<DocumentInfo>();
		for (Document doc : doclist) {

			DocumentInfo di = new DocumentInfo();

			di.setAuthor(doc.getAuthor());
			di.setContentFileName(doc.getContentFileName());
			di.setContentMimeType(doc.getContentMimeType());
			di.setContentSize(doc.getContentSize());
			di.setCreationDate(doc.getCreationDate());

			di.setLatestVersion(doc.isLatestVersion());
			di.setMajorVersion(doc.isMajorVersion());
			di.setLastModificationDate(doc.getLastModificationDate());
			di.setLastModifiedBy(doc.getLastModifiedBy());

			di.setName(doc.getName());
			di.setProcessDefinitionUUID(doc.getProcessDefinitionUUID().toString());
			di.setProcessInstanceUUID(doc.getProcessInstanceUUID().toString());
			di.setUUID(doc.getUUID().toString());
			di.setVersionLabel(doc.getVersionLabel());
			di.setVersionSeriesId(doc.getVersionSeriesId());

			docs.add(di);

		}
		return docs;
	}

	private List<DataField> transfert(Set<DataFieldDefinition> dataFieldOrgs) {
		List<DataField> dataFields = new ArrayList<DataField>(dataFieldOrgs.size());

		for (DataFieldDefinition dtd : dataFieldOrgs) {

			DataField df = new DataField();

			df.setDataTypeClassName(dtd.getDataTypeClassName());
			df.setDescription(dtd.getDescription());
			df.setEnumeration(dtd.isEnumeration());
			df.setLabel(dtd.getLabel());
			df.setName(dtd.getLabel());
			df.setScriptingValue(dtd.getScriptingValue());
			df.setTransient(dtd.isTransient());
			df.setEnumerationValues(dtd.getEnumerationValues());

			df.setInitialValue(dtd.getInitialValue());
			dataFields.add(df);

		}
		return dataFields;
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