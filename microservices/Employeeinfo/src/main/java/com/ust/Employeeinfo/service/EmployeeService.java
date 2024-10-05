package com.ust.Employeeinfo.service;

import com.ust.Employeeinfo.client.Fullresponse;
import com.ust.Employeeinfo.client.Project;
import com.ust.Employeeinfo.fegin.ProjectClient;
import com.ust.Employeeinfo.model.Employee;
import com.ust.Employeeinfo.repository.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private Employeerepository employeerepository;

    @Autowired
    private ProjectClient client;

    public Employee saveEmployee(Employee employee) {
        return employeerepository.save(employee);
    }

    public Fullresponse getEmployeesByProjectCode(long ccode) {


            Employee employee = employeerepository.findByCompanyCode(ccode).orElse(null);
            List<Project> list=client.getProject(ccode);
            Fullresponse response = new Fullresponse();
            response.setCompanyCode(employee.getCompanyCode());
            response.setName(employee.getName());
            response.setEmail(employee.getEmail());
            response.setPhone(employee.getPhone());
            response.setAddress(employee.getAddress());
            response.setSkills(employee.getSkills());
            response.setProjects(list);
            return response;
    }
}
