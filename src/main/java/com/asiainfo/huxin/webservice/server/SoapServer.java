package com.asiainfo.huxin.webservice.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.asiainfo.huxin.webservice.service.impl.HelloWebService;

public class SoapServer {
	public static void main(String[] args) {
		JaxWsServerFactoryBean serverFactoryBean = new JaxWsServerFactoryBean ();
		
		// add login interceptor
		serverFactoryBean.getInInterceptors().add(new LoggingInInterceptor());
		
		// add logout interceptor
		serverFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
		
		//  add service class
		serverFactoryBean.setServiceClass(HelloWebService.class);
		
		//  register address
		serverFactoryBean.setAddress("http://127.0.0.1:8080/hellowebservice");
		
		//  create server
		serverFactoryBean.create();
	}
}
