package com.slin.smvc.service.impl;

import com.slin.smvc.dao.SmvcMemberDao;
import com.slin.smvc.pojo.SmvcMember;
import com.slin.smvc.service.SmvcMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 14-6-11.
 */
@Service("smvcMemberService")
public class SmvcMemberServiceImpl extends BaseServiceImpl<SmvcMember> implements SmvcMemberService {
    @Autowired
    private SmvcMemberDao smvcMemberDao;
    @Override
    public SmvcMember findSmvcMemberByLoginName(String loginName) {
        return smvcMemberDao.findSmvcMemberByLoginName(loginName);
    }

    @Override
    public SmvcMember login(String loginName, String password) {
        return smvcMemberDao.findSmvcMemberByLoginNameAndPassword(loginName, password);
    }

    @Override
    public SmvcMember findSmvcMemberByLoginNameAndsessionCode(String loginName, String sessionCode) {
        return smvcMemberDao.findSmvcMemberByLoginNameAndsessionCode(loginName,sessionCode);
    }
}
