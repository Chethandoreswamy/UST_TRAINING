package com.ust.spring_security_day1.service;

import com.ust.spring_security_day1.Repository.UserRepository;

import com.ust.spring_security_day1.entity.UserInfo;
import com.ust.spring_security_day1.entity.principalUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserInfo> user = userRepository.findByUserName(username);
        return new principalUser(user.get());
    }
}
