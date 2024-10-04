package com.ust.Employeeinfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

}
