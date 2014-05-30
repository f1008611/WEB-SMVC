package com.slin.smvc.dao;

import com.slin.smvc.pojo.SmvcPrivilege;

import java.util.List;

/**
 * Created by Administrator on 14-4-14.
 */
public interface SmvcPrivilegeDao extends BaseDao<SmvcPrivilege>{
    List<SmvcPrivilege> findCmsPrivilegeByRoleId(Long roleId);
    List<SmvcPrivilege> findCmsPrivilegeByParentId(Long parentId, String status);
}
