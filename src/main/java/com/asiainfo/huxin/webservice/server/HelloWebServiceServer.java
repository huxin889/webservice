package com.asiainfo.huxin.webservice.server;

import javax.xml.ws.Endpoint;

import com.asiainfo.huxin.webservice.service.impl.HelloWebService;

public class HelloWebServiceServer {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8080/hellowebservice", new HelloWebService());
	}
}
