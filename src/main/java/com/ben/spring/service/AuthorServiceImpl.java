package com.ben.spring.service;

import com.ben.spring.dao.AuthorRepository;
import com.ben.spring.entity.Authorities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public Authorities findByUserName(String username) {
        return authorRepository.findByUserName(username);
    }
}
