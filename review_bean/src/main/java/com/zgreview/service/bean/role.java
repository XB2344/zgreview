package com.zgreview.service.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class role implements Serializable{
    @Id
    @Column
    private Integer id;
    @Column
    private String name;
    @Column
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
