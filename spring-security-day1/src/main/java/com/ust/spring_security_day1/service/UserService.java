package com.ust.spring_security_day1.service;

import com.ust.spring_security_day1.Repository.UserRepository;
import com.ust.spring_security_day1.dto.Userdto;
import com.ust.spring_security_day1.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authorization.method.AuthorizeReturnObject;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserInfo register(Userdto user) {
        UserInfo u = new UserInfo();
        u.setUserName(user.getName());
        u.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(u);
    }

}
