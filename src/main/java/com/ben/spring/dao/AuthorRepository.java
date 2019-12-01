package com.ben.spring.dao;

import com.ben.spring.entity.Authorities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Authorities, Integer> {
    Authorities findByUserName(String username);
}
