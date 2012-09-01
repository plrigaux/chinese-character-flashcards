package com.plr.iso29110.shared;

import java.io.Serializable;
import java.util.Date;


public class DocumentInfo  implements Serializable {
	
	private String UUID;

	  private String name;

	  private String processDefinitionUUID;

	  private String processInstanceUUID;

	  private String author;

	  private Date creationDate;

	  private String lastModifiedBy;

	  private Date lastModificationDate;

	  public String getUUID() {
		return UUID;
	}

	public void setUUID(String uUID) {
		UUID = uUID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProcessDefinitionUUID() {
		return processDefinitionUUID;
	}

	public void setProcessDefinitionUUID(String processDefinitionUUID) {
		this.processDefinitionUUID = processDefinitionUUID;
	}

	public String getProcessInstanceUUID() {
		return processInstanceUUID;
	}

	public void setProcessInstanceUUID(String processInstanceUUID) {
		this.processInstanceUUID = processInstanceUUID;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getLastModificationDate() {
		return lastModificationDate;
	}

	public void setLastModificationDate(Date lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	public boolean isLatestVersion() {
		return latestVersion;
	}

	public void setLatestVersion(boolean latestVersion) {
		this.latestVersion = latestVersion;
	}

	public boolean isMajorVersion() {
		return isMajorVersion;
	}

	public void setMajorVersion(boolean isMajorVersion) {
		this.isMajorVersion = isMajorVersion;
	}

	public String getVersionLabel() {
		return versionLabel;
	}

	public void setVersionLabel(String versionLabel) {
		this.versionLabel = versionLabel;
	}

	public String getVersionSeriesId() {
		return versionSeriesId;
	}

	public void setVersionSeriesId(String versionSeriesId) {
		this.versionSeriesId = versionSeriesId;
	}

	public String getContentMimeType() {
		return contentMimeType;
	}

	public void setContentMimeType(String contentMimeType) {
		this.contentMimeType = contentMimeType;
	}

	public String getContentFileName() {
		return contentFileName;
	}

	public void setContentFileName(String contentFileName) {
		this.contentFileName = contentFileName;
	}

	public long getContentSize() {
		return contentSize;
	}

	public void setContentSize(long contentSize) {
		this.contentSize = contentSize;
	}

	private boolean latestVersion;

	  private boolean isMajorVersion;

	  private String versionLabel;

	  private String versionSeriesId;

	  private String contentMimeType;

	  private String contentFileName;

	  private long contentSize;
	  

	
}
