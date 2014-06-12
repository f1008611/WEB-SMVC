package com.slin.smvc.service.impl;

import com.slin.smvc.dao.SmvcMenuDao;
import com.slin.smvc.pojo.SmvcMenu;
import com.slin.smvc.service.SmvcMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 14-6-12.
 */
@Service("smvcMenuService")
public class SmvcMenuServiceImpl extends BaseServiceImpl<SmvcMenu> implements SmvcMenuService {
    @Autowired
    private SmvcMenuDao smvcMenuDao;
    @Override
    public List<SmvcMenu> findSmvcMenuByParenId(Long parentId) {
        return smvcMenuDao.findBySmvcMenuByParentId(parentId);
    }
}
