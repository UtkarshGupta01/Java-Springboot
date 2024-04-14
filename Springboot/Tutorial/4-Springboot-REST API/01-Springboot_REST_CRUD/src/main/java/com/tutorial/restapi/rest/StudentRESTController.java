package com.tutorial.restapi.rest;

import com.tutorial.restapi.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRESTController {
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Utkarsh","Gupta"));
        theStudents.add(new Student("Sneha","Shrivastava"));
        theStudents.add(new Student("Utkarsh","Sirohi"));


        return theStudents;
    }
}
