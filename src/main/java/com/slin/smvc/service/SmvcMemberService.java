package com.slin.smvc.service;

import com.slin.smvc.pojo.SmvcMember;

/**
 * Created by Administrator on 14-6-11.
 */
public interface SmvcMemberService extends BaseService<SmvcMember> {
    public SmvcMember findSmvcMemberByLoginName(String loginName);
    public SmvcMember login(String loginName,String password);
}
