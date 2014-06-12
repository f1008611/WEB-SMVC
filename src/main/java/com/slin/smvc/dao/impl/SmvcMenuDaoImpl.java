package com.slin.smvc.dao.impl;

import com.slin.smvc.dao.SmvcMenuDao;
import com.slin.smvc.pojo.SmvcMenu;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 14-6-12.
 */
@Repository("smvcMenuDao")
public class SmvcMenuDaoImpl extends BaseDaoImpl<SmvcMenu> implements SmvcMenuDao {
    @Override
    public List<SmvcMenu> findBySmvcMenuByParentId(Long parentId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("parentId", parentId);
        String hql = "from SmvcMenu where parentId=:parentId order by sequence ";
        return this.find(hql, params);
    }
}
