package com.tutorial.springOne.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
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
