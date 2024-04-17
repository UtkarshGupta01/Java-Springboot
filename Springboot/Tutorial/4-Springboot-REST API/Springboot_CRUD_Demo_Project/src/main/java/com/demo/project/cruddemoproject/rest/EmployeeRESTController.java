package com.demo.project.cruddemoproject.rest;


import com.demo.project.cruddemoproject.entity.Employee;
import com.demo.project.cruddemoproject.service.ServiceEmployee;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employees/{employeeid}")
    public Employee findEmployee(@PathVariable int employeeid){
        Employee theEmployee = serviceEmployee.findById(employeeid);

        if(theEmployee ==null){
            throw new RuntimeException("Employee not found for ID : " + employeeid);
        }

        return theEmployee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){
        theEmployee.setId(0);

        Employee dbEmployee = serviceEmployee.save(theEmployee);

        return dbEmployee;

    }

}
