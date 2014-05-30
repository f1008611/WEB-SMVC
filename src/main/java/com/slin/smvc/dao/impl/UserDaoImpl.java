package com.slin.smvc.dao.impl;

import com.slin.smvc.dao.UserDao;
import com.slin.smvc.pojo.SmvcUser;

import org.springframework.stereotype.Repository;


/**
 * Created by Administrator on 14-4-17.
 */


@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<SmvcUser> implements  UserDao{

}
