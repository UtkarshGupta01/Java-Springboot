package com.tutorial.restapi.rest;

import com.tutorial.restapi.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRESTController {

    private List<Student> theStudents;

    @PostConstruct
    public void loadData(){

        theStudents = new ArrayList<>();

        theStudents.add(new Student("Utkarsh","Gupta"));
        theStudents.add(new Student("Sneha","Shrivastava"));
        theStudents.add(new Student("Utkarsh","Sirohi"));
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        //Check id of Student
        if((studentId>=theStudents.size())||studentId<0){
           throw new StudentNotFoundException("Data not found for student ID : "+ studentId);
        }

        return theStudents.get(studentId);
    }

}
