package com.slin.smvc.dao;

import com.slin.smvc.pojo.SmvcUser;

import java.util.List;

/**
 * Created by Administrator on 14-3-20.
 */
public interface SmvcUserDao extends BaseDao<SmvcUser> {
    SmvcUser findByUserName(String userName);
    SmvcUser findCmsUserByUserNameAndPassword(String userName, String password);
    SmvcUser findCmsUserByEmailAndPassword(String email, String password);
    List<SmvcUser> findAllCmsUser();
}
