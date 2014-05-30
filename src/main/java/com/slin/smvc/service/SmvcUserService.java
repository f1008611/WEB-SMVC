package com.slin.smvc.service;

import com.slin.smvc.pojo.SmvcUser;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 14-3-1.
 */
public interface SmvcUserService extends BaseService<SmvcUser>{


    SmvcUser login(HttpSession session, String loginName, String password);
    SmvcUser findByUserName(String userName);
    boolean isLogin(HttpSession session);
    SmvcUser getCurrentCmsUser(HttpSession session);


    List<SmvcUser> findAllCmsUser();

    void updateEntity();

}
