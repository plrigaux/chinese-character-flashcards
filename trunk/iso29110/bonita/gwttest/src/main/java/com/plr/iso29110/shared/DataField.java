package com.plr.iso29110.shared;

import java.io.Serializable;
import java.util.Collection;

public class DataField implements Serializable {

	String processDefinitionUUID;
	
	String name;

	String label;

	String description;

	String dataTypeClassName;

	Serializable initialValue;

	String scriptingValue;

	Collection<String> enumerationValues;

	boolean isEnumeration;

	boolean isTransient;

	public String getProcessDefinitionUUID() {
		return processDefinitionUUID;
	}

	public void setProcessDefinitionUUID(String processDefinitionUUID) {
		this.processDefinitionUUID = processDefinitionUUID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDataTypeClassName() {
		return dataTypeClassName;
	}

	public void setDataTypeClassName(String dataTypeClassName) {
		this.dataTypeClassName = dataTypeClassName;
	}

	public Serializable getInitialValue() {
		return initialValue;
	}

	public void setInitialValue(Serializable getInitialValue) {
		this.initialValue = getInitialValue;
	}

	public String getScriptingValue() {
		return scriptingValue;
	}

	public void setScriptingValue(String scriptingValue) {
		this.scriptingValue = scriptingValue;
	}

	public Collection<String> getEnumerationValues() {
		return enumerationValues;
	}

	public void setEnumerationValues(Collection<String> enumerationValues) {
		this.enumerationValues = enumerationValues;
	}

	public boolean isEnumeration() {
		return isEnumeration;
	}

	public void setEnumeration(boolean isEnumeration) {
		this.isEnumeration = isEnumeration;
	}

	public boolean isTransient() {
		return isTransient;
	}

	public void setTransient(boolean isTransient) {
		this.isTransient = isTransient;
	}

	

}
