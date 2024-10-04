package com.ust.Employeeinfo.client;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long pid;

    private int pcode;
    private String pname;
    private String technology;
    private int ccode;
    private String location;
    private String city;
    private String state;
    private double budget;
    private String status;
    private String startDate;
    private String endDate;
    private String companyName;

}
