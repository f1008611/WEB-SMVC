package com.slin.smvc.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 14-6-11.
 */
@Entity
@Table(name="smvc_member")
public class SmvcMember implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "login_name")
    private String loginName;
    @Column(name = "real_name")
    private String realName;
    @Column(name = "session_code")
    private String sessionCode;
    @Column(name = "register_time")
    private Date registerTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getSessionCode() {
        return sessionCode;
    }

    public void setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
}
