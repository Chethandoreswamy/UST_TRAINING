package com.ust.Employeeinfo.repository;

import com.ust.Employeeinfo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepository extends JpaRepository<Employee, Long>{
}
