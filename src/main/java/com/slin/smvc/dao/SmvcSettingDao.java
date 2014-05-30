package com.slin.smvc.dao;

import com.slin.smvc.pojo.SmvcSetting;

/**
 * Created by Administrator on 14-4-9.
 */
public interface SmvcSettingDao extends BaseDao<SmvcSetting> {
    SmvcSetting findByCode(String code);
}
