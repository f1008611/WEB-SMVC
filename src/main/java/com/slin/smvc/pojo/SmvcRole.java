package com.slin.smvc.pojo;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 14-3-18.
 */
@Entity
@Table(name = "smvc_role")
public class SmvcRole implements Serializable {
    private static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    private String code;
    @Column(name = "role_name")
    private String roleName;
    private String description;
    private String status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
