package com.plr.iso29110.shared;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class LightProcessDef implements Serializable {

	public static enum ProcessState {
		ENABLED, DISABLED, ARCHIVED
	}

	public enum ProcessType {
		PROCESS, EVENT_SUB_PROCESS
	}

	String UUID;
	String version;
	ProcessState state;

	Date deployedDate;
	Date undeployedDate;
	String deployedBy;
	String undeployedBy;
	String name;
	String label;

	/**
	 * s the set of category names the process definition is in.
	 * 
	 * @return the set of categories. The Set may be empty.
	 */
	Set<String> categoryNames;

	/**
	 * s the type of the process.
	 * 
	 * @return the type of the process
	 */
	ProcessType type;

	Date migrationDate;

	public Set<String> getCategoryNames() {
		return categoryNames;
	}

	public String getDeployedBy() {
		return deployedBy;
	}

	public Date getDeployedDate() {
		return deployedDate;
	}

	public String getLabel() {
		return label;
	}

	public Date getMigrationDate() {
		return migrationDate;
	}

	public String getName() {
		return name;
	}

	public ProcessState getState() {
		return state;
	}

	public ProcessType getType() {
		return type;
	}

	public String getUndeployedBy() {
		return undeployedBy;
	}

	public Date getUndeployedDate() {
		return undeployedDate;
	}

	public String getUUID() {
		return UUID;
	}

	public String getVersion() {
		return version;
	}

	public void setCategoryNames(Set<String> categoryNames) {
		this.categoryNames = categoryNames;
	}

	public void setDeployedBy(String deployedBy) {
		this.deployedBy = deployedBy;
	}

	public void setDeployedDate(Date deployedDate) {
		this.deployedDate = deployedDate;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setMigrationDate(Date migrationDate) {
		this.migrationDate = migrationDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setState(ProcessState state) {
		this.state = state;
	}

	public void setType(ProcessType yype) {
		this.type = yype;
	}

	public void setUndeployedBy(String undeployedBy) {
		this.undeployedBy = undeployedBy;
	}

	public void setUndeployedDate(Date undeployedDate) {
		this.undeployedDate = undeployedDate;
	}

	public void setUUID(String uUID) {
		UUID = uUID;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	

}
