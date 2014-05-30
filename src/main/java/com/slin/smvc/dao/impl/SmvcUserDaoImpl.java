package com.slin.smvc.dao.impl;

import com.slin.smvc.dao.SmvcUserDao;
import com.slin.smvc.pojo.SmvcUser;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 14-3-20.
 */
@Repository("cmsUserDao")
public class SmvcUserDaoImpl extends BaseDaoImpl<SmvcUser> implements SmvcUserDao {
    @Override
    public SmvcUser findByUserName(String userName) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userName", userName);
        return  this.get("from SmvcUser t where t.userName = :userName", params);
    }

    @Override
    public SmvcUser findCmsUserByUserNameAndPassword(String userName, String password) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userName", userName);
        params.put("password", password);
        return  this.get("from SmvcUser t where t.userName = :userName and t.password = :password", params);
    }

    @Override
    public SmvcUser findCmsUserByEmailAndPassword(String email, String password) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("email", email);
        params.put("password", password);
        return  this.get("from SmvcUser t where t.email = :email and t.password = :password", params);
    }

    @Override
    public List<SmvcUser> findAllCmsUser() {
        String hql="from CmsUser order by id desc";
        return this.find(hql);
    }
}
