package com.slin.smvc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.slin.smvc.dao.BaseDao;
import com.slin.smvc.dao.UserDao;
import com.slin.smvc.pojo.User;

import org.springframework.stereotype.Repository;


/**
 * Created by Administrator on 14-4-17.
 */


@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements  UserDao{

}
