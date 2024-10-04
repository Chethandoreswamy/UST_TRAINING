package com.ust.Projectinfo.service;

import com.ust.Projectinfo.dto.Projectdto;
import com.ust.Projectinfo.model.Project;
import com.ust.Projectinfo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project addProject(Projectdto dto) {
        Project project1 = new Project();
        project1.setProjectId(dto.getProjectId());
        project1.setProjectName(dto.getProjectName());
        project1.setProjectManager(dto.getProjectManager());
        project1.setTeamMember(dto.getTeamMember());
        project1.setProjectStatus(dto.getProjectStatus());
        project1.setProjectStartDate(dto.getProjectStartDate());
        project1.setProjectEndDate(dto.getProjectEndDate());
        project1.setProjectBudget(dto.getProjectBudget());
        project1.setProjectInfo(dto.getProjectInfo());
        project1.setCccode(dto.getCccode());
        projectRepository.save(project1);
        return project1;

    }

    public Projectdto getProject(long code) {
        Optional<Projectdto> projectdto = projectRepository.findByCccode(code);
        if(projectdto.isPresent())
        return projectdto.get();
        return null;
    }

    public Projectdto updateProject(Projectdto dto) {
        return dto;
    }

    public String deleteProject(long code) {
        return "";
    }
}
