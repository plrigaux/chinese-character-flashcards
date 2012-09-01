package com.plr.iso29110.server;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.plr.iso29110.server.bonita.BonitaProcessManagement;
import com.plr.iso29110.shared.SomeConsts;

public class Attachment extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			new BonitaProcessManagement().getDocument(req, resp);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private static int maxFileSize = 18 * (1024 * 1024); // 10 megs max

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// String name = (String)request.getAttribute("name");
		// String processInstanceUUID =
		// (String)request.getAttribute("processInstanceUUID");

		try {

			String fileName = null;
			String mimeType = null;
			byte[] content = null;

			ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());

			// FileItemIterator iter = upload.getItemIterator(request);

			@SuppressWarnings("unchecked")
			List<FileItem> items = upload.parseRequest(request);

			Map<String, String> params = new HashMap<>();

			for (FileItem item : items) {

				if (item.isFormField()) {

					params.put(item.getFieldName(), item.getString());

				} else {
					fileName = item.getName();
					// fileName = item.getFieldName();
					mimeType = item.getContentType();
					InputStream stream = item.getInputStream();

					// Process the input stream
					ByteArrayOutputStream out = new ByteArrayOutputStream();
					int len;
					byte[] buffer = new byte[8192];
					while ((len = stream.read(buffer, 0, buffer.length)) != -1) {
						out.write(buffer, 0, len);
					}

					if (out.size() > maxFileSize) {
						throw new RuntimeException("File is > than " + maxFileSize);
					}

					content = out.toByteArray();

					// String name, String processInstanceUUID, String fileName,
					// String mimeType, byte[] content

				}

			}

			String method = params.get(SomeConsts.METHOD);

			if (SomeConsts.ADD_DOCUMENT_VERSION.equals(method)) {
				boolean isMajorVersion = Boolean.getBoolean(params.get(SomeConsts.IS_MAJOR_VERSION));
				String documentUUID = params.get(SomeConsts.DOCUMENTUUID);

				new BonitaProcessManagement().addDocumentVersion(documentUUID, isMajorVersion, fileName, mimeType, content);
			} else if (SomeConsts.CREATATE_DOCUMENT.equals(method)) {
				String name = params.get(SomeConsts.NAME);
				String processInstanceUUID = params.get(SomeConsts.PROCESS_INSTANCE_UUID);

				new BonitaProcessManagement().creatateDocument(name, processInstanceUUID, fileName, mimeType, content);
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
}
