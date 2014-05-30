package com.slin.smvc.controller;

import com.slin.smvc.pojo.SmvcUser;
import com.slin.smvc.service.SmvcUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 14-4-17.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private SmvcUserService userService;


    @RequestMapping(value = "/json/{foo}/{fruit}")
    public
    @ResponseBody
    List<SmvcUser> readJson(@PathVariable String foo, @PathVariable String fruit,Model model) throws Exception {
        List<SmvcUser> userList = userService.findAllCmsUser();
        model.addAttribute("foo",foo);
        model.addAttribute("fruit",fruit);
        System.out.println("foo="+foo+",fruit="+fruit);
        return userList;
    }

    @RequestMapping("/userList")
    public String userList(HttpServletRequest request, Model model) throws Exception {
        List<SmvcUser> userList = userService.findAllCmsUser();
        for (SmvcUser user : userList) {
            System.out.println("name=" + user.getName());
        }
        model.addAttribute("userList", userList);
        System.out.println("this is  user list ........controller.............");
        return "/user/userList";
    }


}
