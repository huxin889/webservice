package com.asiainfo.huxin.webservice.service;

import javax.jws.WebService;

import com.asiainfo.huxin.webservice.model.Customer;

@WebService
public interface IHelloWebService {
	public String sayHello (String name);
	public String sayHelloToCustomer (Customer customer);
}
