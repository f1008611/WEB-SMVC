package com.slin.smvc.service.impl;

import com.slin.smvc.dao.SmvcCategoryDao;
import com.slin.smvc.dao.impl.BaseDaoImpl;
import com.slin.smvc.pojo.SmvcCategory;
import com.slin.smvc.service.SmvcCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 14-6-12.
 */
@Service("smvcCategoryService")
public class SmvcCategoryServiceImpl extends BaseServiceImpl<SmvcCategory> implements SmvcCategoryService {
    @Autowired
    private SmvcCategoryDao smvcCategoryDao;
    @Override
    public List<SmvcCategory> findSmvcCategoryByMenuId(Long menuId) {
        return smvcCategoryDao.findSmvcCategoryByMenuId(menuId);
    }
}
