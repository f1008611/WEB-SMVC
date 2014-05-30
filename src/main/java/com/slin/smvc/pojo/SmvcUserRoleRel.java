package com.slin.smvc.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 14-3-19.
 */
@Entity
@Table(name = "smvc_user_role_rel")
public class SmvcUserRoleRel implements Serializable {
    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "role_id")
    private Long roleId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
