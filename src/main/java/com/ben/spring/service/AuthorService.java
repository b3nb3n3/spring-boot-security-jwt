package com.ben.spring.service;

import com.ben.spring.dao.AuthorRepository;
import com.ben.spring.entity.Authorities;
import org.springframework.beans.factory.annotation.Autowired;

public interface AuthorService {

    Authorities findByUserName(String username);
}
