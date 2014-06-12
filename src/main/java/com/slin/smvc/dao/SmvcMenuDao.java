package com.slin.smvc.dao;

import com.slin.smvc.pojo.SmvcMenu;

import java.util.List;

/**
 * Created by Administrator on 14-6-12.
 */
public interface SmvcMenuDao extends BaseDao<SmvcMenu> {
    public List<SmvcMenu> findBySmvcMenuByParentId(Long parentId);
}
