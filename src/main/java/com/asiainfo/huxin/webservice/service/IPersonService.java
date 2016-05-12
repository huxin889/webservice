package com.asiainfo.huxin.webservice.service;


import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebService;
import javax.xml.ws.Holder;

import com.asiainfo.huxin.webservice.model.Person;

@WebService
public interface IPersonService {
	public Person getDad (@WebParam(name="child", mode=Mode.IN) Person child, @WebParam(name="dad", mode=Mode.OUT) Holder<Integer> dadAge);
}
