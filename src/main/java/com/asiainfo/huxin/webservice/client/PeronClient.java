package com.asiainfo.huxin.webservice.client;

import javax.xml.ws.Holder;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.asiainfo.huxin.webservice.model.Person;
import com.asiainfo.huxin.webservice.service.IPersonService;

public class PeronClient {
	// create log factory
	private final static Log log = LogFactory.getLog(PeronClient.class);
	
	public static void main(String[] args) {
		//  create client proxy bean
		JaxWsProxyFactoryBean proxyFactoryBean = new JaxWsProxyFactoryBean();
		// set request address
		proxyFactoryBean.setAddress("http://127.0.0.1:8082/helloperson");
		// set service class
		proxyFactoryBean.setServiceClass(IPersonService.class);
		// create client object
		IPersonService service = (IPersonService)proxyFactoryBean.create();
		
		//  create child object
		Person child = new Person ();
		child.setId(1);
		child.setName("child");
		child.setAge(10);
		
		Holder<Integer> dad = new Holder<Integer> ();
		Person person = service.getDad(child, dad);
		
		log.debug(dad.value);
		log.debug(person);
	}
}
