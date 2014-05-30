package com.slin.smvc.pojo;



import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "smvc_user")
public class SmvcUser implements Serializable {

  

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String password;
    @Column(name = "create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return "";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
