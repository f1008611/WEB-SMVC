package com.slin.smvc.dao;


import com.slin.smvc.pojo.SmvcRole;

import java.util.List;

/**
 * Created by Administrator on 14-3-20.
 */
public interface SmvcRoleDao {
    SmvcRole findCmsRoleByName(String roleName);
   List<SmvcRole> findCmsRoleByCmsUserId(Long userId);
}
