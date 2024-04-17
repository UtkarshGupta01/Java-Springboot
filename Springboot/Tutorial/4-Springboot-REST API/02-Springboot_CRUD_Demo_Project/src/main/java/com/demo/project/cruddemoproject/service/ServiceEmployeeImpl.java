package com.demo.project.cruddemoproject.service;

import com.demo.project.cruddemoproject.dao.EmployeeDAO;
import com.demo.project.cruddemoproject.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Override
    public Employee findById(int Id) {
        return employeeDAO.findById(Id);
    }

    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return employeeDAO.save(theEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int Id) {
        employeeDAO.deleteById(Id);

    }
}
