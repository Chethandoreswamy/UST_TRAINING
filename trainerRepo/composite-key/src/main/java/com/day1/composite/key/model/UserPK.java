package com.day1.composite.key.model;

import java.io.Serializable;
import java.util.Objects;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UserPK implements Serializable {
    private int userId;
    private String userType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserPK userPK)) return false;
        return userId == userPK.userId && Objects.equals(userType, userPK.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userType);
    }
}