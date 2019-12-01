package com.ben.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "authorities")
public class Authorities {

    @Id
    @Column(name = "username")
    private String userName;

    @Column(name = "authority")
    private String authorities;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    public Authorities(String userName, String authorities) {
        this.userName = userName;
        this.authorities = authorities;
    }

    public Authorities() {
    }
}
