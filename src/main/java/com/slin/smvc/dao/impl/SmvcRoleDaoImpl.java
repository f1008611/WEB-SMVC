package com.slin.smvc.dao.impl;


import com.slin.smvc.dao.SmvcRoleDao;
import com.slin.smvc.pojo.SmvcRole;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 14-3-20.
 */
@Repository("cmsRoleDao")
public class SmvcRoleDaoImpl extends BaseDaoImpl<SmvcRole> implements SmvcRoleDao {
    @Override
    public SmvcRole findCmsRoleByName(String roleName) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("roleName", roleName);
        return  this.get("from SmvcRole t where t.roleName = :roleName", params);
    }

    @Override
    public List<SmvcRole> findCmsRoleByCmsUserId(Long userId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userId",userId);
        String hql ="select t from SmvcRole t , SmvcUserRoleRel r where t.id=r.roleId and r.userId=:userId";
        return find(hql,params);
    }
}
