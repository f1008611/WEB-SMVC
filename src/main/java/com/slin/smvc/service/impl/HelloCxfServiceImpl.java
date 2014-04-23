package com.slin.smvc.service.impl;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.cxf.feature.Features;

import com.slin.smvc.Constants;
import com.slin.smvc.service.HelloCxfService;

@WebService(endpointInterface = "com.slin.smvc.service.HelloCxfService", targetNamespace = Constants.NS)
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class HelloCxfServiceImpl  implements HelloCxfService{

	@Override
	public String sayHello(@WebParam(name = "name") String name) {
		return "Hello,"+name+",welcome you to here!";
	}

	
}
