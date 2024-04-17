package com.demo.project.cruddemoproject.dao;

import com.demo.project.cruddemoproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
