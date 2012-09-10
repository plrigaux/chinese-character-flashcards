package com.plr.iso29110.server.bonita.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.ow2.bonita.facade.def.majorElement.DataFieldDefinition;
import org.ow2.bonita.facade.runtime.Document;

import com.plr.iso29110.shared.DataField;
import com.plr.iso29110.shared.DocumentInfo;

public class ExecutorUtils {
	static List<DataField> transfert(Set<DataFieldDefinition> dataFieldOrgs) {
		List<DataField> dataFields = new ArrayList<DataField>(dataFieldOrgs.size());

		for (DataFieldDefinition dtd : dataFieldOrgs) {

			DataField df = new DataField();

			df.setDataTypeClassName(dtd.getDataTypeClassName());
			df.setDescription(dtd.getDescription());
			df.setEnumeration(dtd.isEnumeration());
			df.setLabel(dtd.getLabel());
			df.setName(dtd.getLabel());
			df.setScriptingValue(dtd.getScriptingValue());
			df.setTransient(dtd.isTransient());
			df.setEnumerationValues(dtd.getEnumerationValues());

	
			dataFields.add(df);

		}
		return dataFields;
	}

	static List<DocumentInfo> doDocs(List<Document> doclist) {

		List<DocumentInfo> docs = new ArrayList<DocumentInfo>();
		for (Document doc : doclist) {

			DocumentInfo di = new DocumentInfo();

			di.setAuthor(doc.getAuthor());
			di.setContentFileName(doc.getContentFileName());
			di.setContentMimeType(doc.getContentMimeType());
			di.setContentSize(doc.getContentSize());
			di.setCreationDate(doc.getCreationDate());

			di.setLatestVersion(doc.isLatestVersion());
			di.setMajorVersion(doc.isMajorVersion());
			di.setLastModificationDate(doc.getLastModificationDate());
			di.setLastModifiedBy(doc.getLastModifiedBy());

			di.setName(doc.getName());
			di.setProcessDefinitionUUID(doc.getProcessDefinitionUUID().toString());
			di.setProcessInstanceUUID(doc.getProcessInstanceUUID().toString());
			di.setUUID(doc.getUUID().toString());
			di.setVersionLabel(doc.getVersionLabel());
			di.setVersionSeriesId(doc.getVersionSeriesId());

			docs.add(di);

		}
		return docs;
	}
}
