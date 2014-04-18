package com.slin.smvc.service.impl;

import java.util.List;

import com.slin.smvc.dao.UserDao;
import com.slin.smvc.pojo.User;
import com.slin.smvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 14-4-17.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<User> findAllUser(){
        System.out.println("testUserService..........");
       return userDao.findAllUser();
    }
}
