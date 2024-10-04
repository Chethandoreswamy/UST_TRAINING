package com.ust.Projectinfo.controller;

import com.ust.Projectinfo.dto.Projectdto;
import com.ust.Projectinfo.model.Project;
import com.ust.Projectinfo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ProjectController {

    @Autowired
    private final ProjectService projectservice;

    public ProjectController(ProjectService projectservice) {
        this.projectservice = projectservice;
    }

    @PostMapping("/addProject")
    public ResponseEntity<Project> addProject(@RequestBody Projectdto dto) {
        return new ResponseEntity<>(projectservice.addProject(dto), HttpStatus.CREATED);
    }

    @GetMapping("/project/{code}")
    public ResponseEntity<Projectdto> getProject(@PathVariable long code) {
        return ResponseEntity.ok(projectservice.getProject(code));
    }

    @PutMapping("/project/update")
    public ResponseEntity<Projectdto> updateProject(@RequestBody Projectdto dto) {
        return ResponseEntity.ok(projectservice.updateProject(dto));
    }


    @DeleteMapping("/project/delete/{code}")
    public ResponseEntity<String> deleteProject(@PathVariable long code) {
        return ResponseEntity.ok(projectservice.deleteProject(code));
    }

}
