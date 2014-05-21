package com.slin.smvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slin.smvc.pojo.User;
import com.slin.smvc.service.UserService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 14-4-17.
 */
@Controller
@RequestMapping("/user")
public class UserController {

   @Autowired
    private UserService userService;


    @RequestMapping("/userList")
    public String userList(HttpServletRequest request,Model model) throws  Exception{
        List<User> userList=userService.findAllUser();
        for(User user : userList){
        	System.out.println("name="+user.getName());
        }
        model.addAttribute("userList",userList);
        System.out.println("this is  user list ........controller.............");
        return "/user/userList";
    }


}
