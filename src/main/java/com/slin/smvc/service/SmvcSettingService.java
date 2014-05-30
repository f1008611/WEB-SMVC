package com.slin.smvc.service;

import com.slin.smvc.pojo.SmvcSetting;

/**
 * Created by Administrator on 14-4-9.
 */
public interface SmvcSettingService extends BaseService<SmvcSetting> {
    void updateVersion();
}
