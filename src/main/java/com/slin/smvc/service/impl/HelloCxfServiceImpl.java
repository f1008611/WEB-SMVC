package com.slin.smvc.service.impl;

import javax.jws.WebParam;
import javax.jws.WebService;


import org.apache.commons.lang3.StringUtils;
import com.slin.smvc.Constants;
import com.slin.smvc.service.HelloCxfService;

public class HelloCxfServiceImpl implements HelloCxfService {

    @Override
    public String sayHello(@WebParam(name = "name") String name) {
        if (StringUtils.isEmpty(name)) {
            name = "游客";
        }
        return "Hello," + name + ",welcome you to here!";
    }

    @Override
    public String login(@WebParam(name = "name") String name, @WebParam(name = "password") String password, @WebParam(name = "type") String type) {
        return "Hello," + name + ",welcome you to here!";
    }

    @Override
    public String login2(String arg0, String arg1, String type1) {
        return null;
    }
}
