package com.ust.Projectinfo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "project")
public class Project {

    @Id
    private long projectId;

    private String projectInfo;

    private String projectName;

    private String projectManager;

    private String teamMember;

    private String projectStatus;

    private String projectStartDate;

    private String projectEndDate;

    private double projectBudget;

    private String companyName;

    private long Cccode;

}
