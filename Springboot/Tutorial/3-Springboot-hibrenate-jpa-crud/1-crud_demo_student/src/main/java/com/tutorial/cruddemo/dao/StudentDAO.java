package com.tutorial.cruddemo.dao;

import com.tutorial.cruddemo.entity.Student;
import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastNAme(String theLastName);

    void update(Student theStudent);
}
