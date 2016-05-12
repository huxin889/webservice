package com.asiainfo.huxin.webservice.service.impl;

import javax.xml.ws.Holder;

import com.asiainfo.huxin.webservice.model.Person;
import com.asiainfo.huxin.webservice.service.IPersonService;

public class PersonServiceImpl implements IPersonService {

	@Override
	public Person getDad(Person child, Holder<Integer> dadAge) {
		if (child != null) {
			if (child.getId() == 1) {
				
				dadAge = new Holder<Integer>();
				
				Person person = new Person();
				person.setId(1001);
				person.setName("Dad");
				person.setAge(36);
				
				dadAge.value = person.getAge();
				
				return person;
			}
		}
		
		return null;
	}

}
