package com.ust.Employeeinfo.service;

import com.ust.Employeeinfo.client.Fullresponse;
import com.ust.Employeeinfo.model.Employee;
import com.ust.Employeeinfo.repository.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {

    @Autowired
    private Employeerepository employeerepository;

    public Employee saveEmployee(Employee employee) {
        return employeerepository.save(employee);
    }

    public Fullresponse getEmployeesByProjectCode(long ccode) {

    }
}
