package com.ust.Projectinfo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project")
public class Project {

    @Id
    private long projectID;
    private String projectName;
    private List<String> technologyStack;
    private long companyCode;

}
