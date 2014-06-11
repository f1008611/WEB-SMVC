package com.slin.smvc.service.impl;

import com.slin.smvc.dao.SmvcPrivilegeDao;
import com.slin.smvc.dao.SmvcRoleDao;
import com.slin.smvc.dao.SmvcUserDao;
import com.slin.smvc.pojo.SmvcPrivilege;
import com.slin.smvc.pojo.SmvcRole;
import com.slin.smvc.pojo.SmvcUser;
import com.slin.smvc.service.SmvcUserService;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 14-3-1.
 */
@Service("smvcUserService")
public class SmvcUserServiceImpl extends BaseServiceImpl<SmvcUser> implements SmvcUserService {
    private Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    private SmvcUserDao cmsUserDao;

    @Autowired
    private SmvcRoleDao cmsRoleDao;
    @Autowired
    private SmvcPrivilegeDao cmsPrivilegeDao;

    @Override
    public SmvcUser getCurrentCmsUser(HttpSession session) {
        SmvcUser cmsUser=null;
        Object obj= session.getAttribute("current_user");
        if(obj!=null&&obj instanceof  SmvcUser){
            cmsUser=(SmvcUser)obj;
        }
        return cmsUser;
    }

    @Override
    public boolean isLogin(HttpSession session) {
       Object obj= session.getAttribute("current_user");
        System.out.println("obj instanceof  SmvcUser"+(obj instanceof  SmvcUser));
        if(obj!=null&& obj instanceof  SmvcUser){
           logger.info("已经登录。。。。");
            return true;
        }
        System.out.println("imde 登录");
        return false;
    }

    @Override
    public SmvcUser findByUserName(String userName) {
        return cmsUserDao.findByUserName(userName);
    }

    @Override
    public SmvcUser login(HttpSession session,String loginName, String password) {
        logger.info("come in CmsUserServiceImpl -------> login");
        SmvcUser cmsUser=checkCmsUser(loginName,password);
        if(cmsUser!=null){

             session.setAttribute("current_user",cmsUser);
            setPrivileges(session, cmsUser);
        }
        logger.info("come out CmsUserServiceImpl -------> login");
        return cmsUser;
    }

    @Override
    public SmvcUser login(String loginName, String password) {
        return checkCmsUser(loginName,password);
    }

    private void setPrivileges(HttpSession session,SmvcUser cmsUser){
        Set<String> privilegeSet = new HashSet<String>();
        List<SmvcRole> cmsRoleList=cmsRoleDao.findCmsRoleByCmsUserId(cmsUser.getId());

            logger.info(">>>>>>>>>>>>>>>>>>>>> "+(cmsRoleList instanceof  SmvcRole));
        for(int i=0;i<cmsRoleList.size();i++){
            System.out.println("object="+cmsRoleList.get(i) instanceof  Object);
            SmvcRole cmsRole=  (SmvcRole)cmsRoleList.get(i);
            System.out.println(">>>>>>>>>>>>>>>>>>>>  "+cmsRole.getCode());
        }

        for(SmvcRole cmsRole:cmsRoleList){
            List<SmvcPrivilege> cmsPrivileges=cmsPrivilegeDao.findCmsPrivilegeByRoleId(cmsRole.getId());
            for(SmvcPrivilege cmsPrivilege:cmsPrivileges){
                logger.info("current_user_privileges -------> code="+cmsPrivilege.getCode());
                  privilegeSet.add(cmsPrivilege.getCode());
            }
        }

        session.setAttribute("current_user_privileges",privilegeSet);
    }


    private SmvcUser checkCmsUser(String loginName, String password){
        SmvcUser cmsUser=null;
        if(StringUtils.contains(loginName,"@")){
            logger.info("是否含有@:"+StringUtils.contains(loginName,"@"));
            cmsUser=cmsUserDao.findCmsUserByEmailAndPassword(loginName,password);
        }else{
            cmsUser=cmsUserDao.findCmsUserByUserNameAndPassword(loginName, password);
        }

        if(cmsUser!=null){
           /* cmsUser.setUpdateTime(new Date());
            cmsUser.setLastLoginTime(new Date());*/
            cmsUserDao.update(cmsUser);

        }
        return  cmsUser;
    }


    @Override
    public List<SmvcUser> findAllCmsUser() {
        return cmsUserDao.findAllCmsUser();
    }

    @Override
    public void updateEntity() {

    }
}
