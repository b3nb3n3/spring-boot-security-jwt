package com.ben.spring.service;

import com.ben.spring.entity.User;

public interface UserService {

    User findByUserName(String username);
}
