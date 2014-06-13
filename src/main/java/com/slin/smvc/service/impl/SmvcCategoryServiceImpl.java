package com.slin.smvc.service.impl;

import com.slin.smvc.dao.SmvcCategoryDao;
import com.slin.smvc.dao.impl.BaseDaoImpl;
import com.slin.smvc.pojo.SmvcCategory;
import com.slin.smvc.service.SmvcCategoryService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by Administrator on 14-6-12.
 */
@Service("smvcCategoryService")
public class SmvcCategoryServiceImpl extends BaseServiceImpl<SmvcCategory> implements SmvcCategoryService {
    private Logger logger=Logger.getLogger(this.getClass());
    @Autowired
    private SmvcCategoryDao smvcCategoryDao;
    @Override
    public List<SmvcCategory> findSmvcCategoryByMenuId(Long menuId) {
        logger.info("come in SmvcCategoryServiceImpl->findSmvcCategoryByMenuId.................");
        List<SmvcCategory> smvcCategoryList= smvcCategoryDao.findSmvcCategoryByMenuId(menuId);
        for(SmvcCategory smvcCategory:smvcCategoryList){

        }
        return smvcCategoryList;
    }
}
