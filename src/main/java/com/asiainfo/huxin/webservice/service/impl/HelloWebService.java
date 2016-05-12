package com.asiainfo.huxin.webservice.service.impl;

import com.asiainfo.huxin.webservice.model.Customer;
import com.asiainfo.huxin.webservice.service.IHelloWebService;

public class HelloWebService implements IHelloWebService {
	
	@Override
	public String sayHello(String name) {
		return name;
	}

	@Override
	public String sayHelloToCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return "Hello : " + customer.getName();
	}

}
