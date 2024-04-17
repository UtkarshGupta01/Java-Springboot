package com.demo.project.cruddemoproject.service;

import com.demo.project.cruddemoproject.entity.Employee;
import java.util.List;

public interface ServiceEmployee {
    List<Employee> findAll();

    Employee findById(int Id);

    Employee save(Employee theEmployee);

    void deleteById(int Id);
}
