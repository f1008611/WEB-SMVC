package com.slin.smvc.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 14-3-19.
 */
@Entity
@Table(name = "smvc_role_privilege_rel")
public class SmvcRolePrivilegeRel implements Serializable {
    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "role_id")
    private Long roleId;
    @Column(name = "privilege_id")
    private Long privilegeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }
}
