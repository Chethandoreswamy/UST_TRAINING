package com.ust.Employeeinfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    private long companyCode;
    private String name;
    private List<String> skills;
    private String email;
    private String phone;
    private String address;




}
