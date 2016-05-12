package com.asiainfo.huxin.webservice.server;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import com.asiainfo.huxin.webservice.service.impl.StudentServiceImpl;

public class RestServer {
	public static void main(String[] args) {
		// set server factory bean
		JAXRSServerFactoryBean serverFactoryBean = new JAXRSServerFactoryBean ();
		// set service class
		serverFactoryBean.setResourceClasses(StudentServiceImpl.class);
		// set address
		serverFactoryBean.setAddress("http://localhost:3355/");
		// create server
		serverFactoryBean.create();
	}
}
