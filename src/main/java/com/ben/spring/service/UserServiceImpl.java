package com.ben.spring.service;

import com.ben.spring.dao.UserRepository;
import com.ben.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User findByUserName(String username) {
        return userRepository.findByUserName(username);
    }
}
