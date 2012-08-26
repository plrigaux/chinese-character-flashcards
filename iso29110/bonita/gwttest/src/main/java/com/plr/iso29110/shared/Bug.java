package com.plr.iso29110.shared;

import java.io.Serializable;
import java.util.Date;

public class Bug implements Serializable {
	private static final long serialVersionUID = 1L;

	private String project;
	private String version;
	private String description;
	private Date creationDate;
	private String name;
	private String executionId;
	private String priority;
	private String summary;

	private String taskId;

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExecutionId() {
		return executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	private String assignedTo;

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getPriority() {
		return priority;
	}

	public String getTaskId() {
		return taskId;
	}

	@Override
	public String toString() {

		return "p " + project + " v " + version + " d " + creationDate;
	}

	public void setSummary(String text) {
		this.summary = text;		
	}

	public String getSummary() {
		return this.summary;		
	}
}
