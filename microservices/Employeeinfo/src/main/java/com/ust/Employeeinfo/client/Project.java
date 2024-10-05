package com.ust.Employeeinfo.client;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    private long projectID;
    private String projectName;
    private List<String> technologyStack;
    private long companyCode;

}
