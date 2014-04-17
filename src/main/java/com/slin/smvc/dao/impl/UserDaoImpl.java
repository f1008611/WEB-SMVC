package com.slin.smvc.dao.impl;

import com.slin.smvc.dao.UserDao;
import org.springframework.stereotype.Repository;


/**
 * Created by Administrator on 14-4-17.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void testDao() {
        System.out.println("testDao............");
    }
}
