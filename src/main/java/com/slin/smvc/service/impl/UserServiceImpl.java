package com.slin.smvc.service.impl;

import java.util.List;

import com.slin.smvc.Constants;
import com.slin.smvc.dao.UserDao;
import com.slin.smvc.pojo.User;
import com.slin.smvc.service.UserService;
import org.apache.cxf.feature.Features;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

/**
 * Created by Administrator on 14-4-17.
 */
@WebService(endpointInterface = "com.slin.smvc.service.UserService", targetNamespace = Constants.NS)
@Features(features = "org.apache.cxf.feature.LoggingFeature")
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAllUser() {
        System.out.println("userDao="+userDao);
        return userDao.findAllUser();
    }


}
