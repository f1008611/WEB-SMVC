package com.slin.smvc.service;

import com.slin.smvc.pojo.SmvcPrivilege;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 14-3-19.
 */
public interface SmvcPrivilegeService {
    boolean isPassReqUrl(HttpSession session, String reqUrl);
    List<SmvcPrivilege> findCmsPrivilegeByParentId(Long parentId, String status);
    Set<String> getCurrentPrivileges(HttpSession session);
}
