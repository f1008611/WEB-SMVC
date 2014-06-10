package com.slin.smvc.controller;

import com.slin.smvc.service.SmvcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 14-6-10.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private SmvcUserService smvcUserService;
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "/admin/login";
    }
    @RequestMapping("/login")
    public String login(HttpServletRequest request,HttpServletResponse response,String name,String password){
        smvcUserService.login(request.getSession(),name,password);
        return "admin/index";
    }
}
