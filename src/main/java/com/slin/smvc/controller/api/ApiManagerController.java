package com.slin.smvc.controller.api;

import com.slin.smvc.pojo.SmvcUser;
import com.slin.smvc.service.SmvcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 14-6-11.
 */
@Controller
@RequestMapping("/api")
public class ApiManagerController {
    @Autowired
    private SmvcUserService smvcUserService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public @ResponseBody
    Map<String ,Object> login(String username,String password){
          Map<String,Object> map=new HashMap<String, Object>();
        SmvcUser smvcUser=smvcUserService.login(username, password);
        if(smvcUser==null){
           map.put("code",0);
           map.put("message","登录失败");
        }else {
            map.put("status",1);
            map.put("message","登录成功");
        }
        map.put("data",smvcUser);
        return map;
    }
}
