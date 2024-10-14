package com.ust.spring_security_day1.Repository;

import com.ust.spring_security_day1.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserInfo, Integer> {
    public Optional<UserInfo> findByUserName(String userName);
}
