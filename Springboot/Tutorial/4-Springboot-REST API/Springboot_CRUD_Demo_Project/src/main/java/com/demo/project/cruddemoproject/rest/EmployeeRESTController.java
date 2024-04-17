package com.demo.project.cruddemoproject.rest;

import com.demo.project.cruddemoproject.dao.EmployeeDAO;
import com.demo.project.cruddemoproject.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRESTController {

    private EmployeeDAO employeeDAO;

    public EmployeeRESTController(EmployeeDAO theEmoployeeDAO) {
        employeeDAO = theEmoployeeDAO;

    }

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDAO.findAll();
    }

}
