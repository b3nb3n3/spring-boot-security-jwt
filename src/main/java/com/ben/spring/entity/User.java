package com.ben.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String passWord;

    @Column(name = "enabled")
    private int enaBled;

    public User() {
    }

    public User(String userName, String passWord, int enaBled) {
        this.userName = userName;
        this.passWord = passWord;
        this.enaBled = enaBled;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getEnaBled() {
        return enaBled;
    }

    public void setEnaBled(int enaBled) {
        this.enaBled = enaBled;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", enaBled=" + enaBled +
                '}';
    }
}
