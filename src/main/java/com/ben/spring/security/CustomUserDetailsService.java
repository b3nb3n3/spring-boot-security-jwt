package com.ben.spring.security;


import com.ben.spring.dao.AuthorRepository;
import com.ben.spring.dao.UserRepository;
import com.ben.spring.entity.Authorities;
import com.ben.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final User user = userRepository.findByUserName(username);
        final Authorities authorities = authorRepository.findByUserName(username);

        if(user == null) {
            throw new UsernameNotFoundException("Not found Username: " + username);
        }

        return org.springframework.security.core.userdetails.User//
                .withUsername(username)//
                .password(user.getPassWord())//
                .authorities(authorities.getAuthorities())//
                .accountExpired(false)//
                .accountLocked(false)//
                .credentialsExpired(false)//
                .disabled(false)//
                .build();
    }
}
