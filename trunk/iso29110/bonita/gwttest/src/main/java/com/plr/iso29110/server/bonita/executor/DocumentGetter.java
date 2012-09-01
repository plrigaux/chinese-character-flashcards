package com.plr.iso29110.server.bonita.executor;

import java.util.LinkedList;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ow2.bonita.facade.QueryRuntimeAPI;
import org.ow2.bonita.facade.RuntimeAPI;
import org.ow2.bonita.facade.exception.DocumentNotFoundException;
import org.ow2.bonita.facade.exception.DocumentationCreationException;
import org.ow2.bonita.facade.exception.InstanceNotFoundException;
import org.ow2.bonita.facade.runtime.Document;
import org.ow2.bonita.facade.runtime.ProcessInstance;
import org.ow2.bonita.facade.uuid.DocumentUUID;
import org.ow2.bonita.facade.uuid.ProcessInstanceUUID;
import org.ow2.bonita.util.AccessorUtil;

import com.google.common.base.Splitter;

public class DocumentGetter {
	private QueryRuntimeAPI queryRuntimeAPI;

	public DocumentGetter() {
		queryRuntimeAPI = AccessorUtil.getQueryRuntimeAPI();
	}

	public byte[] getDocumentContent(String documentUUID) throws DocumentNotFoundException {

		byte[] b = queryRuntimeAPI.getDocumentContent(new DocumentUUID(documentUUID));

		return b;
	}

	public Document getDocument(String documentUUID) throws DocumentNotFoundException {

		Document d = queryRuntimeAPI.getDocument(new DocumentUUID(documentUUID));

		return d;
	}

	final static private Splitter sp = Splitter.on('/');

	public void getDocument(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		String requestURI = req.getRequestURI();

		LinkedList<String> list = new LinkedList<>();
		for (String element : sp.split(requestURI)) {
			list.add(element);
		}

		//remove 2 times
		list.removeLast();
		String documentUUID = list.removeLast();

		Document document = getDocument(documentUUID);
		byte[] content = getDocumentContent(documentUUID);

		resp.setContentType(document.getContentMimeType());
		// resp.setContentLength(document.getContentSize());

		ServletOutputStream out = resp.getOutputStream();

		try {
			out.write(content);
		} finally {
			out.flush();
		}

	}

	public void uploadDocument(String name, String processInstanceUUID, String fileName, String mimeType,  byte[] content) throws DocumentationCreationException, InstanceNotFoundException {
		RuntimeAPI runtimeAPI = AccessorUtil.getRuntimeAPI();
		
		ProcessInstanceUUID puuid = new ProcessInstanceUUID(processInstanceUUID);
				
		runtimeAPI.createDocument(name, puuid, fileName, mimeType, content);
	}

//	void test() {
//		ProcessInstance pi;
//		
//		RuntimeAPI ra;
//		
//		
//		
////		ra.createDocument(name, processDefinitionUUID, fileName, mimeType, content);
//		
//	}
	
}
