package com.slin.smvc.dao.impl;
import com.slin.smvc.dao.SmvcSettingDao;
import com.slin.smvc.pojo.SmvcSetting;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 14-4-9.
 */
@Repository("cmsSettingDao")
public class SmvcSettingDaoImpl extends BaseDaoImpl<SmvcSetting> implements SmvcSettingDao {

    @Override
    public SmvcSetting findByCode(String code) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("code", code);
        return this.get("from SmvcSetting t where t.code = :code", params);
    }
}
