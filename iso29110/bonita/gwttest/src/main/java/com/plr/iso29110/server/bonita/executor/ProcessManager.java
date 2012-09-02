package com.plr.iso29110.server.bonita.executor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.ow2.bonita.facade.QueryDefinitionAPI;
import org.ow2.bonita.facade.QueryRuntimeAPI;
import org.ow2.bonita.facade.RuntimeAPI;
import org.ow2.bonita.facade.def.majorElement.ProcessDefinition;
import org.ow2.bonita.facade.exception.InstanceNotFoundException;
import org.ow2.bonita.facade.exception.ProcessNotFoundException;
import org.ow2.bonita.facade.exception.VariableNotFoundException;
import org.ow2.bonita.facade.runtime.ActivityState;
import org.ow2.bonita.facade.runtime.InstanceState;
import org.ow2.bonita.facade.runtime.ProcessInstance;
import org.ow2.bonita.facade.uuid.ProcessDefinitionUUID;
import org.ow2.bonita.facade.uuid.ProcessInstanceUUID;
import org.ow2.bonita.light.LightProcessDefinition;
import org.ow2.bonita.light.LightTaskInstance;
import org.ow2.bonita.util.AccessorUtil;

import com.plr.iso29110.shared.BonitaProcessInstance;
import com.plr.iso29110.shared.BonitaTask;
import com.plr.iso29110.shared.LightProcessDef;

public class ProcessManager {

	private QueryRuntimeAPI queryRuntimeAPI;
	private QueryDefinitionAPI queryDefinitionAPI;

	public ProcessManager() {
		queryRuntimeAPI = AccessorUtil.getQueryRuntimeAPI();
		queryDefinitionAPI = AccessorUtil.getQueryDefinitionAPI();
	}

	public Collection<BonitaProcessInstance> getProcessInstances() {
		Set<ProcessInstance> instances = queryRuntimeAPI.getProcessInstances();

		List<BonitaProcessInstance> list = new ArrayList<BonitaProcessInstance>(instances.size());

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

	public List<BonitaTask> getReadyTasks(String processInstanceId) throws InstanceNotFoundException {

		Collection<LightTaskInstance> lightTaskList;

		if (processInstanceId == null) {
			lightTaskList = queryRuntimeAPI.getLightTaskList(ActivityState.READY);
		} else {
			lightTaskList = queryRuntimeAPI.getLightTaskList(new ProcessInstanceUUID(processInstanceId), ActivityState.READY);
		}

		return getReadyTasks(lightTaskList);
	}

	private List<BonitaTask> getReadyTasks(Collection<LightTaskInstance> lightTaskList) {

		List<BonitaTask> list = new ArrayList<BonitaTask>(lightTaskList.size());

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

	Map<ProcessDefinitionUUID, ProcessDefinition> processDefinitions = new HashMap<ProcessDefinitionUUID, ProcessDefinition>();

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

	public List<LightProcessDef> getDeployedProcess() {

		List<LightProcessDef> list = new ArrayList<LightProcessDef>();
		for (LightProcessDefinition lightProcessDefinition : queryDefinitionAPI.getLightProcesses()) {
			LightProcessDef pd = new LightProcessDef();

			pd.setName(lightProcessDefinition.getName());
			pd.setLabel(lightProcessDefinition.getLabel());

			pd.setCategoryNames(lightProcessDefinition.getCategoryNames());
			pd.setDeployedBy(lightProcessDefinition.getDeployedBy());
			pd.setDeployedDate(lightProcessDefinition.getDeployedDate());

			pd.setMigrationDate(lightProcessDefinition.getMigrationDate());
			pd.setState(LightProcessDef.ProcessState.values()[lightProcessDefinition.getState().ordinal()]);
			pd.setType(LightProcessDef.ProcessType.values()[lightProcessDefinition.getType().ordinal()]);
			pd.setUUID(lightProcessDefinition.getUUID().toString());

			pd.setVersion(lightProcessDefinition.getVersion());
			pd.setUndeployedDate(lightProcessDefinition.getUndeployedDate());

			list.add(pd);

		}

		return list;

	}

	public void start(String processName, String processVersion, Map<String, Object> parameters) throws ProcessNotFoundException,
			VariableNotFoundException {
		ProcessDefinitionUUID processDefinitionUUID = new ProcessDefinitionUUID(processName, processVersion);

		RuntimeAPI runtimeAPI = AccessorUtil.getRuntimeAPI();
		runtimeAPI.instantiateProcess(processDefinitionUUID, parameters);
		
		
		
	}
	
	
	public void getProcess(String processName, String processVersion) throws ProcessNotFoundException {
		
		
	 ProcessDefinition lightProcessDefinition =	 queryDefinitionAPI.getProcess(processName, processVersion);


			LightProcessDef pd = new LightProcessDef();

			pd.setName(lightProcessDefinition.getName());
			pd.setLabel(lightProcessDefinition.getLabel());

			pd.setCategoryNames(lightProcessDefinition.getCategoryNames());
			pd.setDeployedBy(lightProcessDefinition.getDeployedBy());
			pd.setDeployedDate(lightProcessDefinition.getDeployedDate());

			pd.setMigrationDate(lightProcessDefinition.getMigrationDate());
			pd.setState(LightProcessDef.ProcessState.values()[lightProcessDefinition.getState().ordinal()]);
			pd.setType(LightProcessDef.ProcessType.values()[lightProcessDefinition.getType().ordinal()]);
			pd.setUUID(lightProcessDefinition.getUUID().toString());

			pd.setVersion(lightProcessDefinition.getVersion());
			pd.setUndeployedDate(lightProcessDefinition.getUndeployedDate());

		

	

	

	}
	
}
