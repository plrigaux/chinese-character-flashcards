package com.plr.iso29110.shared;

import java.io.Serializable;
import java.util.Date;

public class BonitaProcessInstance implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long nb;
	private Date startedDate;
	private Date lastUpdateDate;
	private Date endedDate;
	
	private String processName;
	private String processVersion;
	private String processLabel;
	private InstanceState instanceState;
	
	public InstanceState getInstanceState() {
		return instanceState;
	}

	public void setInstanceState(int instanceStateOrdinal) {
		this.instanceState = InstanceState.values()[instanceStateOrdinal];
	}

	public Date getEndedDate() {
		return endedDate;
	}

	public void setEndedDate(Date endedDate) {
		this.endedDate = endedDate;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessVersion() {
		return processVersion;
	}

	public void setProcessVersion(String processVersion) {
		this.processVersion = processVersion;
	}

	public String getProcessLabel() {
		return processLabel;
	}

	public void setProcessLabel(String processLabel) {
		this.processLabel = processLabel;
	}

	public Date getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(Date startedDate) {
		this.startedDate = startedDate;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public long getNb() {
		return nb;
	}

	public void setNb(long nb) {
		this.nb = nb;
	}

}
