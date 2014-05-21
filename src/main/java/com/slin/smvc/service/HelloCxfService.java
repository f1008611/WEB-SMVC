package com.slin.smvc.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.slin.smvc.Constants;


public interface HelloCxfService {

	public String sayHello(@WebParam(name = "name") String name);
    public String login(@WebParam(name = "name") String name,@WebParam(name = "password") String password,@WebParam(name = "type") String type);
    public String login2(@WebParam(name = "arg0") String arg0,@WebParam(name = "arg1") String arg1,@WebParam(name = "type1") String type1);
}
