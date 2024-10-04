package com.ust.Projectinfo.repository;

import com.ust.Projectinfo.dto.Projectdto;
import com.ust.Projectinfo.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    Optional<Projectdto> findByCccode(Long ccode);
}
