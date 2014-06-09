package com.slin.smvc.service.impl;


import com.slin.smvc.Constants;
import com.slin.smvc.dao.SmvcSettingDao;
import com.slin.smvc.pojo.SmvcSetting;
import com.slin.smvc.service.SmvcSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 14-4-9.
 */
@Service("cmsSettingService")
public class SmvcSettingServiceImpl extends BaseServiceImpl<SmvcSetting> implements SmvcSettingService {

    @Autowired
    private SmvcSettingDao cmsSettingDao;
    @Override
    public void updateVersion() {
        SmvcSetting cmsSetting=cmsSettingDao.findByCode(Constants.versionCode);
        if(cmsSetting==null){
            cmsSetting=new SmvcSetting();
            cmsSetting.setCode(Constants.versionCode);
        }
        cmsSetting.setValue(String.valueOf(System.currentTimeMillis()));
        cmsSettingDao.update(cmsSetting);
    }
}
