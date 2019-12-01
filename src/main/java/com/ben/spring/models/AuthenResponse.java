package com.ben.spring.models;

import java.io.Serializable;

public class AuthenResponse implements Serializable {
    private String jwt;

    public AuthenResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
