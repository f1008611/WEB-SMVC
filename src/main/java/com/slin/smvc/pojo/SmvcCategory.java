package com.slin.smvc.pojo;

import com.slin.smvc.Constants;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 14-6-12.
 */
@Entity
@Table(name = "smvc_category")
public class SmvcCategory implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    @Column(name = "sub_title")
    private String subTitle;
    private String status;
    private String picture;
    private Long sequence;
    private Date date;

    @Column(name = "menu_id")
    private Long menuId;


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPicture() {
        System.out.println("Constants.prePicture="+Constants.PREPICTURE);
        return Constants.PREPICTURE+picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }


}
