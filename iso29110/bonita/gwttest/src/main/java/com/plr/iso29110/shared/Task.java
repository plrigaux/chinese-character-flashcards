package com.plr.iso29110.shared;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Task implements Serializable {
	private String UUID;


	private String activityName;
	private String activityLabel;
	private String activityDescription;
	// private long nb;
	// private Date startedDate;
	private Date lastUpdateDate;
	// private Date endedDate;
	//
	// private String processName;
	// private String processVersion;
	// private String processLabel;

	private Map<String, Object> activityInstanceVariables;
	private Map<String, Object> processInstanceVariables;
	
	private List<DataField> processDataFields;
	private List<DataField> activityDataFields;


	private List<DocumentInfo> documents;
	
	private String processInstanceUUID;
	
	private ActivityState state;

	public ActivityState getState() {
		return state;
	}

	public void setState(ActivityState state) {
		this.state = state;
	}

	public List<DataField> getActivityDataFields() {
		return activityDataFields;
	}

	public void setActivityDataFields(List<DataField> activityDataFields) {
		this.activityDataFields = activityDataFields;
	}

	public List<DataField> getProcessDataFields() {
		return processDataFields;
	}

	public void setProcessDataFields(List<DataField> processDataFields) {
		this.processDataFields = processDataFields;
	}

	public Map<String, Object> getActivityInstanceVariables() {
		return activityInstanceVariables;
	}

	public void setActivityInstanceVariables(Map<String, Object> activityInstanceVariables) {
		this.activityInstanceVariables = activityInstanceVariables;
	}

	public Map<String, Object> getProcessInstanceVariables() {
		return processInstanceVariables;
	}

	public void setProcessInstanceVariables(Map<String, Object> processInstanceVariables) {
		this.processInstanceVariables = processInstanceVariables;
	}
	
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityLabel() {
		return activityLabel;
	}

	public void setActivityLabel(String activityLabel) {
		this.activityLabel = activityLabel;
	}

	public String getActivityDescription() {
		return activityDescription;
	}

	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;

	}

	public void setDocuments(List<DocumentInfo> docs) {
		this.documents = docs;
	}

	public List<DocumentInfo> getDocuments() {
		return documents;
	}
	
	public String getUUID() {
		return UUID;
	}

	public void setUUID(String uUID) {
		UUID = uUID;
	}

	public String getProcessInstanceUUID() {
		return processInstanceUUID;
	}
	public void setProcessInstanceUUID(String processInstanceUUID) {
		this.processInstanceUUID = processInstanceUUID;
	}
}
