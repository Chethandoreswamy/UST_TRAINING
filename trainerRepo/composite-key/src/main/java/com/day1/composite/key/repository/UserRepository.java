package com.day1.composite.key.repository;
import java.util.Optional;

import com.day1.composite.key.model.User;
import com.day1.composite.key.model.UserPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, UserPK> {
    @Query("SELECT u FROM User u WHERE u.userId = :userId AND u.userType = :userType and u.isActive = true")
    Optional<User> findUser(int userId, String userType);
}