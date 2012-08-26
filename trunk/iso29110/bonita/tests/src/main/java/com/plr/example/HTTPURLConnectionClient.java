package com.plr.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import org.ow2.bonita.util.Base64;

/**
 * @author Elias Ricken de Medeiros
 * 
 */
public class HTTPURLConnectionClient {
	public static void main(String[] args) throws Exception {
		// instantiateProcess method
		// the given process must be deployed before
		System.out.println("--------------\nCreating a new process instance (variables with default values)\n--------------\n");
		String url = "http://localhost:8080/bonita-server-rest/API/runtimeAPI/instantiateProcess/myProcess--1.0";
		String parameters = "options=user:john";
		HttpURLConnection connection = getConnection(url, parameters);
		processResponse(connection);

		// instantiateProcessWithVariables
		System.out.println("\n--------------\nCreating a new process instance (variables with initialized values)\n--------------\n");
		url = "http://localhost:8080/bonita-server-rest/API/runtimeAPI/instantiateProcessWithVariables/myProcess--1.0";
		parameters = "options=user:john&variables=<map><entry><string>globalVar</string><string>new value</string></entry></map>";
		connection = getConnection(url, parameters);
		processResponse(connection);

		System.out.println("\n--------------\nRetriving all process instances ...\n--------------\n");
		// get light process instances
		url = "http://localhost:8080/bonita-server-rest/API/queryRuntimeAPI/getLightProcessInstances";
		parameters = "options=user:john";
		connection = getConnection(url, parameters);
		processResponse(connection);
	}

	private static HttpURLConnection getConnection(final String url, final String parameters) throws IOException, MalformedURLException,
			ProtocolException {
		final HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setUseCaches(false);
		connection.setDoInput(true);
		connection.setDoOutput(true);
		connection.setInstanceFollowRedirects(false);
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		connection.setRequestProperty("Authorization", "Basic " + Base64.encodeBytes("restuser:restbpm".getBytes()));

		final DataOutputStream output = new DataOutputStream(connection.getOutputStream());
		output.writeBytes(parameters);
		output.flush();
		output.close();
		connection.disconnect();

		return connection;
	}

	/**
	 * @param connection
	 * @throws IOException
	 */
	private static void processResponse(HttpURLConnection connection) throws IOException {
		int responseCode = connection.getResponseCode();
		if (responseCode != HttpURLConnection.HTTP_OK) {
			System.out.println("----------\nRequest failled: " + responseCode + "\n----------");
		} else {
			System.out.println("----------\nResponse content: \n----------");
			final InputStream is = connection.getInputStream();
			final BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String line;
			StringBuffer response = new StringBuffer();
			try {
				while ((line = reader.readLine()) != null) {
					response.append(line);
					response.append('\n');
				}
			} finally {
				reader.close();
				is.close();
			}
			System.out.println(response.toString().trim());
		}
	}

}