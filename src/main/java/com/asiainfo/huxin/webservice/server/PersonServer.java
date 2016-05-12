package com.asiainfo.huxin.webservice.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.asiainfo.huxin.webservice.service.impl.PersonServiceImpl;

public class PersonServer {
	public static void main(String[] args) {
		JaxWsServerFactoryBean psersonServerFactoryBean = new JaxWsServerFactoryBean ();
		
		// register login intercepter
		psersonServerFactoryBean.getInInterceptors().add(new LoggingInInterceptor());
		//  register logout intercepter
		psersonServerFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
		//  set service class
		psersonServerFactoryBean.setServiceClass(PersonServiceImpl.class);
		// set address
		psersonServerFactoryBean.setAddress("http://127.0.0.1:8082/helloperson");
		// cresate server
		psersonServerFactoryBean.create();
	}
}
