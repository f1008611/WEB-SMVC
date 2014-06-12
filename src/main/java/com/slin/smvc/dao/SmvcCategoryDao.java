package com.slin.smvc.dao;

import com.slin.smvc.pojo.SmvcCategory;

import java.util.List;

/**
 * Created by Administrator on 14-6-12.
 */
public interface SmvcCategoryDao extends BaseDao<SmvcCategory> {
    public List<SmvcCategory> findSmvcCategoryByMenuId(Long menuId);
}
