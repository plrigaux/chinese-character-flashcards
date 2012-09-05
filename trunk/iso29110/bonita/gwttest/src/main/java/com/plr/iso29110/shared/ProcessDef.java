package com.plr.iso29110.shared;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class ProcessDef extends LightProcessDef {




	  /**
	   * Gets all meta-data of the process.
	   * @return all meta-data of the process
	   */
	private  Map<String, String> metaData;



	  /**
	   * Gets the attachments of the process
	   * @return the attachments of the process
	   */
	  private  Map<String, AttachmentDefinition> attachments;



	  /**
	   * Gets process dataFields.
	   * @return the process dataFields.
	   */
	  private  List<DataField> dataFields;

	  /**
	   * Gets the participants of the process.
	   * @return the participant list
	   */
	  private  List<String> participants;

	



	  /**
	   * Gets the process sub-processes.
	   * @return the process sub-processes
	   */
	  private  Set<String> subProcesses;

	  /**
	   * Gets the process dependencies (sub-processes) of this process.<br>
	   * Note: If a sub-process of this process is defined in another process, it is not possible
	   * to undeploy these sub-processes until this process is undeployed.
	   * @return The set of processDefinitionUUID depending on this process definition.
	   */
	  private	  Set<String> processDependencies;


	  private List<String> activities;

//	  /**
//	   * Returns the activity with the given name. Null if no activity exists within the process with the given name.
//	   * @param name the activity name
//	   * @return the activity
//	   */
//	  private ActivityDefinition activity;
//

//
//	  /**
//	   * Gets the initial activities.
//	   * @return the initial activities
//	   */
//	  private  Map<String, ActivityDefinition> initialActivities;

//	  /**
//	   * Gets the final activities.
//	   * @return the final activities
//	   */
//	  private Map<String, ActivityDefinition> finalActivities;

//	  /**
//	   * Gets the iteration descriptors.
//	   * @return the iteration descriptors
//	   */
//	  private Set<IterationDescriptor> iterationDescriptors;



	  /**
//	   * Gets the list of event sub-processes.
//	   * @return the list of event sub-processes
//	   */
//	  private List<EventProcessDefinition> eventSubProcesses;



	public Map<String, String> getMetaData() {
		return metaData;
	}



	public void setMetaData(Map<String, String> metaData) {
		this.metaData = metaData;
	}



	public Map<String, AttachmentDefinition> getAttachments() {
		return attachments;
	}



	public void setAttachments(Map<String, AttachmentDefinition> attachments) {
		this.attachments = attachments;
	}



	public List<DataField> getDataFields() {
		return dataFields;
	}



	public void setDataFields(List<DataField> dataFields) {
		this.dataFields = dataFields;
	}



	public List<String> getParticipants() {
		return participants;
	}



	public void setParticipants(List<String> participants) {
		this.participants = participants;
	}



	public List<String> getActivities() {
		return activities;
	}


	public void setActivities(List<String> activities) {
		this.activities = activities;
	}





	public Set<String> getSubProcesses() {
		return subProcesses;
	}



	public void setSubProcesses(Set<String> subProcesses) {
		this.subProcesses = subProcesses;
	}



	public Set<String> getProcessDependencies() {
		return processDependencies;
	}



	public void setProcessDependencies(Set<String> processDependencies) {
		this.processDependencies = processDependencies;
	}


//
//	public ActivityDefinition getActivity() {
//		return activity;
//	}
//
//
//
//	public void setActivity(ActivityDefinition activity) {
//		this.activity = activity;
//	}
//
//
//
//	public DataFieldDefinition getDatafield() {
//		return datafield;
//	}
//
//
//
//	public void setDatafield(DataFieldDefinition datafield) {
//		this.datafield = datafield;
//	}
//
//
//
//	public Map<String, ActivityDefinition> getInitialActivities() {
//		return initialActivities;
//	}
//
//
//
//	public void setInitialActivities(Map<String, ActivityDefinition> initialActivities) {
//		this.initialActivities = initialActivities;
//	}
//
//
//
//	public Map<String, ActivityDefinition> getFinalActivities() {
//		return finalActivities;
//	}
//
//
//
//	public void setFinalActivities(Map<String, ActivityDefinition> finalActivities) {
//		this.finalActivities = finalActivities;
//	}
//
//
//
//	public Set<IterationDescriptor> getIterationDescriptors() {
//		return iterationDescriptors;
//	}
//
//
//
//	public void setIterationDescriptors(Set<IterationDescriptor> iterationDescriptors) {
//		this.iterationDescriptors = iterationDescriptors;
//	}
//
//
//
//	public List<EventProcessDefinition> getEventSubProcesses() {
//		return eventSubProcesses;
//	}
//
//
//
//	public void setEventSubProcesses(List<EventProcessDefinition> eventSubProcesses) {
//		this.eventSubProcesses = eventSubProcesses;
//	}
//	  
	  

}
