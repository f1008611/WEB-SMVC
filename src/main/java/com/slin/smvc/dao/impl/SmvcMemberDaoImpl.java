package com.slin.smvc.dao.impl;

import com.slin.smvc.dao.SmvcMemberDao;
import com.slin.smvc.pojo.SmvcMember;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 14-6-11.
 */
@Repository("smvcMemberDao")
public class SmvcMemberDaoImpl extends BaseDaoImpl<SmvcMember> implements SmvcMemberDao {
    @Override
    public SmvcMember findSmvcMemberByLoginName(String loginName) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("loginName", loginName);
        String hql = "from SmvcMember where loginName=:loginName";
        return this.get(hql, params);
    }

    @Override
    public SmvcMember findSmvcMemberByLoginNameAndPassword(String loginName, String password) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("loginName", loginName);
        params.put("password", password);
        String hql = " from SmvcMember where loginName=:loginName and password=:password";
        return this.get(hql, params);
    }

    @Override
    public SmvcMember findSmvcMemberByLoginNameAndsessionCode(String loginName, String sessionCode) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("loginName", loginName);
        params.put("sessionCode", sessionCode);
        String hql = " from SmvcMember where loginName=:loginName and sessionCode=:sessionCode";
        return this.get(hql, params);
    }
}
