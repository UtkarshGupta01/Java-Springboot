package com.demo.project.cruddemoproject.service;

import com.demo.project.cruddemoproject.dao.EmployeeRepository;
import com.demo.project.cruddemoproject.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceEmployeeImpl implements ServiceEmployee {

    private EmployeeRepository employeeRepository;

    public ServiceEmployeeImpl(EmployeeRepository theEmployeeDAO){
        employeeRepository = theEmployeeDAO;
    }



    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int Id) {

        Optional<Employee> result = employeeRepository.findById(Id);
        Employee theEmployee;
        if (result.isPresent()){
            theEmployee=result.get();
        }else {
            throw new RuntimeException("Employee not found for ID : " + Id);
        }
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int Id) {
        employeeRepository.deleteById(Id);

    }
}
