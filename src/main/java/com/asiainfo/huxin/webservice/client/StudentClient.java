package com.asiainfo.huxin.webservice.client;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class StudentClient {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		// request object
		HttpGet httpGet = new HttpGet("http://localhost:3355/student/1/getStudentByName?name=Li");
		// request client
		HttpClient httpClient = new DefaultHttpClient();
		// get response
		HttpResponse response = httpClient.execute(httpGet);
		// get inputstream
		InputStream inputstream = response.getEntity().getContent();

		byte[] b = new byte[1024];
		StringBuilder sb = new StringBuilder();
		while (inputstream.read(b) != -1) {
			sb.append(new String(b, "UTF-8"));
		}
		System.out.println(sb.toString());
	}
}
