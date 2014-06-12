package com.slin.smvc.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 14-6-12.
 */
@Entity
@Table(name="smvc_menu")
public class SmvcMenu implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="parent_id")
    private Long parentId;
    private String name;
    private String status;
    private Long sequence;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }
}
