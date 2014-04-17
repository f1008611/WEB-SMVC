package com.slin.smvc.controller;

import com.slin.smvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 14-4-17.
 */
@Controller
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/userList")
    public String userList(){
        userService.testUserService();
        System.out.println("this is  user list ........controller.............");
        return "/user/userList";
    }


}
