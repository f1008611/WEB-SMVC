package com.slin.smvc.interceptor;

import com.slin.smvc.pojo.SmvcUser;
import com.slin.smvc.service.SmvcPrivilegeService;
import com.slin.smvc.service.SmvcUserService;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Set;

/**
 * Created by Administrator on 14-5-30.
 */
public class AccessInterceptor  extends HandlerInterceptorAdapter {
    private SmvcUserService smvcUserService;
    private SmvcPrivilegeService smvcPrivilegeService;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("before  come in.............");
        String requestUrl=request.getServletPath();
        if("/admin/login.do".equals(requestUrl)){
            if(!smvcUserService.isLogin(request.getSession())){
                return false;
            }else{
                SmvcUser smvcUser=smvcUserService.getCurrentCmsUser(request.getSession());
                if(smvcUser!=null&&smvcPrivilegeService.isPassReqUrl(request.getSession(),requestUrl)){
                    //check privileges codes
                } else {
                    return false;
                }
            }
        }else {
            if(!smvcUserService.isLogin(request.getSession())){
                return  false;
            }else{
                //check privileges
                SmvcUser smvcUser= smvcUserService.getCurrentCmsUser(request.getSession());
                if(smvcUser!=null&&smvcPrivilegeService.isPassReqUrl(request.getSession(),requestUrl)){

                }else {
                    return false;
                }

            }
            request.setAttribute("loginErrorMessage","该用户没权限。。。。");
        }

        return super.preHandle(request, response, handler);
    }
}
