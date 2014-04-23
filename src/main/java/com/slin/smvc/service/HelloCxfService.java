package com.slin.smvc.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.slin.smvc.Constants;

@WebService(targetNamespace = Constants.NS)
public interface HelloCxfService {

	public String sayHello(@WebParam(name = "name") String name);

}
