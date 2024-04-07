package com.tutorial.springOne.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
//    inject properties from application.properties
    @Value("${student.name}")
    private String studentName;


    @Value("${student.rollno}")
    private String studentRollNumber;

    @GetMapping("/studentInfo")
    public String studentInfo(){
        return "Student Name : " + studentName + " and Student Roll Number : " + studentRollNumber;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello Utkarsh! Welcome to learning Springboot :)";
    }

    @GetMapping("/dailygoal")
    public  String dailyGoal(){
        return "Jog for 5km daily";
    }

    @GetMapping("/dailyreminder")
    public String dailyReminder(){
        return "Avoid too much calorie intake";
    }
}
