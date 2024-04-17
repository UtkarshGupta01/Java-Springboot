package com.demo.project.cruddemoproject.dao;

import com.demo.project.cruddemoproject.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int Id);

    Employee save(Employee theEmployee);

    void deleteById(int Id);
}
