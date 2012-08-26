package com.plr.iso29110.shared;

import java.io.Serializable;


public class Bug implements Serializable {
	private static final long serialVersionUID = 1L;

	private String project;
	private String version;
	private String summary;
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
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	

}
