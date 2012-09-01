package com.plr.iso29110.server.bonita.executor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.ow2.bonita.facade.QueryDefinitionAPI;
import org.ow2.bonita.facade.QueryRuntimeAPI;
import org.ow2.bonita.facade.def.majorElement.ProcessDefinition;
import org.ow2.bonita.facade.exception.ProcessNotFoundException;
import org.ow2.bonita.facade.runtime.ActivityState;
import org.ow2.bonita.facade.runtime.InstanceState;
import org.ow2.bonita.facade.runtime.ProcessInstance;
import org.ow2.bonita.facade.uuid.ProcessDefinitionUUID;
import org.ow2.bonita.light.LightTaskInstance;
import org.ow2.bonita.util.AccessorUtil;

import com.plr.iso29110.shared.BonitaProcessInstance;
import com.plr.iso29110.shared.BonitaTask;

public class ProcessLister {

	private QueryRuntimeAPI queryRuntimeAPI;
	private QueryDefinitionAPI queryDefinitionAPI;

	public ProcessLister() {
		queryRuntimeAPI = AccessorUtil.getQueryRuntimeAPI();
		queryDefinitionAPI = AccessorUtil.getQueryDefinitionAPI();
	}

	public Collection<BonitaProcessInstance> getProcessInstances() {
		Set<ProcessInstance> instances = queryRuntimeAPI.getProcessInstances();

		List<BonitaProcessInstance> list = new ArrayList<>(instances.size());

		for (ProcessInstance processInstance : instances) {
			ProcessDefinitionUUID pduuid = processInstance.getProcessDefinitionUUID();

			BonitaProcessInstance bpi = new BonitaProcessInstance();

			ProcessDefinition pd = getProcessDefinition(pduuid);
			if (pd != null) {
				bpi.setProcessLabel(pd.getLabel());
				bpi.setProcessVersion(pd.getVersion());
				bpi.setProcessName(pd.getName());
			}

			InstanceState is = processInstance.getInstanceState();

			bpi.setInstanceState(is.ordinal());
			// bpi.setNb(processInstance.getNb());
			bpi.setLastUpdateDate(processInstance.getLastUpdate());
			bpi.setStartedDate(processInstance.getStartedDate());

			list.add(bpi);
		}

		return list;
	}

	public List<BonitaTask> getReadyTasks() {
		Collection<LightTaskInstance> lightTaskList = queryRuntimeAPI.getLightTaskList(ActivityState.READY);

		List<BonitaTask> list = new ArrayList<>(lightTaskList.size());

		for (LightTaskInstance lightTaskInstance : lightTaskList) {
			ProcessDefinitionUUID pduuid = lightTaskInstance.getProcessDefinitionUUID();

			BonitaTask bpi = new BonitaTask();

			ProcessDefinition pd = getProcessDefinition(pduuid);
			if (pd != null) {
				bpi.setProcessLabel(pd.getLabel());
				bpi.setProcessVersion(pd.getVersion());
				bpi.setProcessName(pd.getName());
			}

			bpi.setActivityName(lightTaskInstance.getActivityName());
			bpi.setActivityLabel(lightTaskInstance.getActivityLabel());
			bpi.setActivityDescription(lightTaskInstance.getActivityDescription());

			bpi.setLastUpdateDate(lightTaskInstance.getLastUpdateDate());

			bpi.setTaskId(lightTaskInstance.getUUID().toString());
			
			list.add(bpi);
		}

		return list;
	}

	Map<ProcessDefinitionUUID, ProcessDefinition> processDefinitions = new HashMap<>();

	private ProcessDefinition getProcessDefinition(ProcessDefinitionUUID pduuid) {
		ProcessDefinition pd = processDefinitions.get(pduuid);

		if (pd == null) {
			try {
				pd = queryDefinitionAPI.getProcess(pduuid);
			} catch (ProcessNotFoundException e) {
				e.printStackTrace();
			}
		}

		return pd;
	}

}
