package com.slin.smvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slin.smvc.pojo.User;
import com.slin.smvc.service.UserService;

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
        List<User> userList=userService.findAllUser();
        for(User user : userList){
        	System.out.println("name="+user.getName());
        }
        System.out.println("this is  user list ........controller.............");
        return "/user/userList";
    }


}
