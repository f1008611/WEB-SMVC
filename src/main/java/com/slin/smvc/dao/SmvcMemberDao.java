package com.slin.smvc.dao;

import com.slin.smvc.pojo.SmvcMember;

/**
 * Created by Administrator on 14-6-11.
 */
public interface SmvcMemberDao extends BaseDao<SmvcMember> {
  public SmvcMember findSmvcMemberByLoginName(String loginName);
  public SmvcMember findSmvcMemberByLoginNameAndPassword(String loginName,String password);
}
