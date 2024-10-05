package com.ust.Projectinfo.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Projectdto {

    private long projectID;

    @NotNull(message = "project name cannot be null")
    private String projectName;

    @NotNull(message = "project name cannot be null")
    private List<String> technologyStack;

    private long companyCode;

}





