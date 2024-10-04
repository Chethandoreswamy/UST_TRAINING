package com.ust.Employeeinfo.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fullresponse {

    private long ccode;
    private String name;
    private String email;
    private String location;
    private String department;
    private String phone;
    private List<String> skills;
    private String city;
    private String state;
    private int exp;

    public List<Project> projects;


}
