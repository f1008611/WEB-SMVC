package com.slin.smvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 14-4-17.
 */
@Controller
@RequestMapping("/user1")
public class TestController {

    @RequestMapping("/userList")
    public String test(HttpServletRequest request,Model model){
        System.out.println("come in here ....1233. ");
        //request.setAttribute("userList","userList");


        System.out.println("ffff");

        System.out.println("sssssssss");


        return "/user/userList";
    }
}
