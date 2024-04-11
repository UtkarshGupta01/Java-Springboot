package com.tutorial.cruddemo.dao;

import com.tutorial.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);
}
