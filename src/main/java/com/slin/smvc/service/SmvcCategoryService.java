package com.slin.smvc.service;

import com.slin.smvc.pojo.SmvcCategory;

import java.util.List;

/**
 * Created by Administrator on 14-6-12.
 */
public interface SmvcCategoryService extends  BaseService<SmvcCategory> {
    public List<SmvcCategory> findSmvcCategoryByMenuId(Long menuId);
}
