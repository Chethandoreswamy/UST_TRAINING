package com.ust.Projectinfo.service;

import com.ust.Projectinfo.dto.Projectdto;
import com.ust.Projectinfo.model.Project;
import com.ust.Projectinfo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project addProject(Projectdto dto) {
        Project project1 = new Project();
        project1.setProjectID(dto.getProjectID());
        project1.setProjectName(dto.getProjectName());
        project1.setTechnologyStack(dto.getTechnologyStack());
        project1.setCompanyCode(dto.getCompanyCode());
        projectRepository.save(project1);
        return project1;

    }

    public List<Project> getProject(long code) {
        return projectRepository.findByCompanyCode(code);

    }


}
