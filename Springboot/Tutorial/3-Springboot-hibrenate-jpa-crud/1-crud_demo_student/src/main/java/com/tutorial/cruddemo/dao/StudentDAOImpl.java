package com.tutorial.cruddemo.dao;

import com.tutorial.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);

    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName",Student.class);
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastNAme(String theLastName) {
        //Type Query
        TypedQuery<Student> theQuery =
                        entityManager.createQuery("FROM Student where lastName =:lastName",Student.class);

        //Set Parameter
        theQuery.setParameter("lastName",theLastName);


        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        //Find the Student
        Student theStudent = entityManager.find(Student.class,id);

        //Delete the Student
        entityManager.remove(theStudent);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int number = entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return number;
    }
}
