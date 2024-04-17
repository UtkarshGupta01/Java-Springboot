package com.demo.project.cruddemoproject.dao;

import com.demo.project.cruddemoproject.entity.Employee;
import com.demo.project.cruddemoproject.rest.EmployeeRESTController;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    private EntityManager entityManager;

    public EmployeeDAOJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {

        TypedQuery<Employee> theEmployee = entityManager.createQuery("from Employee",Employee.class);

        List<Employee> employees = theEmployee.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int Id) {
        Employee theEmployee = entityManager.find(Employee.class, Id);

        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        Employee dbEmployee = entityManager.merge(theEmployee);

        return dbEmployee;
    }

    @Override
    public void deleteById(int Id) {
        Employee theEmployee = entityManager.find(Employee.class,Id);

        entityManager.remove(theEmployee);

    }
}
