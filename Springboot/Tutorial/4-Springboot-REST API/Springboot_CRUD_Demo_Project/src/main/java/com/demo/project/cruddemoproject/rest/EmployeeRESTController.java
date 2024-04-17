package com.demo.project.cruddemoproject.rest;

import com.demo.project.cruddemoproject.dao.EmployeeDAO;
import com.demo.project.cruddemoproject.entity.Employee;
import com.demo.project.cruddemoproject.service.ServiceEmployee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRESTController {

    private ServiceEmployee serviceEmployee;

    public EmployeeRESTController(ServiceEmployee theServiceEmployee) {
        serviceEmployee = theServiceEmployee;

    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return serviceEmployee.findAll();
    }

}
