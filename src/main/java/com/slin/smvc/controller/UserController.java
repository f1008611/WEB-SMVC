package com.slin.smvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 14-4-17.
 */
@Controller
@RequestMapping("/test")
public class UserController {


    @RequestMapping("/userList")
    public String userList(){
        System.out.println("this is  user list ........controller.............");
        return "/user/userList";
    }


}
