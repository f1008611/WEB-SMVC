package com.slin.smvc.service.impl;

import com.slin.smvc.dao.UserDao;
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

    public void testUserService() {
        System.out.println("testUserService..........");
        userDao.findAllUser();
    }
}
