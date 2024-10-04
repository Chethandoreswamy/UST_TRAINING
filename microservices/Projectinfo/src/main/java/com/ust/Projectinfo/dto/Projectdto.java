package com.ust.Projectinfo.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Projectdto {

    private long projectId;

    @NotNull(message = "project info cannot be null")
    private String projectInfo;

    @NotNull(message = "project name cannot be null")
    private String projectName;

    @NotNull(message = "project manager cannot be null")
    private String projectManager;

    @Min(value=2, message="team number should be more than 2")
    @Max(value = 210, message = "team number should be less than 10")
    private String teamMember;

    @Pattern(regexp = "^(InProgress | Completed) $", message = "Invalid project status")
    private String projectStatus;

    private String projectStartDate;

    private String projectEndDate;

    @NotNull(message = "cannot be blank")
    private double projectBudget;

    @NotNull(message = "project name cannot be null")
    private String companyName;

    private long Cccode;

}
