package com.slin.smvc.controller.api;

import com.slin.smvc.pojo.SmvcMember;
import com.slin.smvc.pojo.SmvcUser;
import com.slin.smvc.service.SmvcMemberService;
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
    private SmvcMemberService smvcMemberService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public @ResponseBody
    Map<String ,Object> login(String username,String password){
          Map<String,Object> map=new HashMap<String, Object>();
        SmvcMember smvcMember=smvcMemberService.login(username, password);
        if(smvcMember==null){
           map.put("status",0);
           map.put("message","登录失败");
        }else {
            smvcMember.setSessionCode("123456789");
            smvcMemberService.update(smvcMember);
            map.put("status",1);
            map.put("message","登录成功");
        }
        map.put("data",smvcMember);
        return map;
    }

    @RequestMapping("/logout")
    public @ResponseBody Map<String ,Object> logout(String loginName,String sessionCode){
        SmvcMember smvcMember= smvcMemberService.findSmvcMemberByLoginNameAndsessionCode(loginName,sessionCode);
        Map<String,Object> map=new HashMap<String, Object>();
        if(smvcMember!=null){
            smvcMember.setSessionCode(null);
            map.put("status",1);
            map.put("message","登出成功");
            smvcMemberService.update(smvcMember);
        }else {
            map.put("status",0);
            map.put("message","该用户没有登录！");
        }

        return map;
    }


}
