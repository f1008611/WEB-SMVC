package com.slin.smvc.service;

import com.slin.smvc.pojo.SmvcMenu;

import java.util.List;

/**
 * Created by Administrator on 14-6-12.
 */
public interface SmvcMenuService extends BaseService<SmvcMenu> {
    public List<SmvcMenu> findSmvcMenuByParenId(Long parentId);
}
