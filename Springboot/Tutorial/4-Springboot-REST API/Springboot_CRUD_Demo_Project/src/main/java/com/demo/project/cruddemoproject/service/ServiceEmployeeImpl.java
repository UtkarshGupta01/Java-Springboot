package com.demo.project.cruddemoproject.service;

import com.demo.project.cruddemoproject.dao.EmployeeDAO;
import com.demo.project.cruddemoproject.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEmployeeImpl implements ServiceEmployee {

    private EmployeeDAO employeeDAO;

    public ServiceEmployeeImpl(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }



    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
