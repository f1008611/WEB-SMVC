package com.slin.smvc.dao.impl;

import com.slin.smvc.dao.SmvcCategoryDao;
import com.slin.smvc.pojo.SmvcCategory;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 14-6-12.
 */
@Repository("smvcCategoryDao")
public class SmvcCategoryDaoImpl extends  BaseDaoImpl<SmvcCategory> implements SmvcCategoryDao {
    @Override
    public List<SmvcCategory> findSmvcCategoryByMenuId(Long menuId) {
        Map<String ,Object> params=new HashMap<String, Object>();
        params.put("menuId",menuId);
        String hql="from SmvcCategory where menuId=:menuId order by sequence ";
        return this.find(hql,params);
    }
}
