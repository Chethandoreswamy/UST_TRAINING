package com.ust.Employeeinfo.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fullresponse {

    private long companyCode;
    private String name;
    private List<String> skills;
    private String email;
    private String phone;
    private String address;

    public List<Project> projects;


}
