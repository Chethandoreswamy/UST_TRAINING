package com.expenseTracker.User.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * This class is used to transfer data from one layer to another
 */
public class Userdto {


    private long userId;
    private String name;
    private String email;
    private String password;
    private double balance;
}
