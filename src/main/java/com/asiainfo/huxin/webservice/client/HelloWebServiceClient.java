package com.asiainfo.huxin.webservice.client;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;

import com.asiainfo.huxin.webservice.model.Customer;
import com.asiainfo.huxin.webservice.service.IHelloWebService;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

public class HelloWebServiceClient {
	// log 
	private final static Log log = LogFactory.getLog(HelloWebServiceClient.class);
	// create a client
	private static JaxWsProxyFactoryBean soapFactoryBean = null;
	// destination bean
	private static IHelloWebService service = null;
	
	static {
		soapFactoryBean = new JaxWsProxyFactoryBean();
		soapFactoryBean.setAddress("http://127.0.0.1:8080/hellowebservice");
		soapFactoryBean.setServiceClass(IHelloWebService.class);
		Object o = soapFactoryBean.create ();
		service = (IHelloWebService) o;
	}
	
	public static void main(String[] args) {
//		log.debug(service.sayHello("huxin"));
		Customer customer = new Customer ();
		customer.setId(1000000L);
		customer.setName("huxin");
		
		log.debug(service.sayHelloToCustomer(customer));
	}
	
	@Test
	public void testSayHelloToCustomer (){
		// create a customer
		Customer customer = new Customer ();
		customer.setId(1000000L);
		customer.setName("huxin");
		
		log.debug(service.sayHelloToCustomer(customer));
	}
}
