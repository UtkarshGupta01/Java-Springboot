package com.tutorial.springcoredemo.rest;

import com.tutorial.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public DemoController(
            @Qualifier("trackCoach") Coach theCoach,
            @Qualifier("trackCoach") Coach theAnotherCoach){

        myCoach = theCoach;
        anotherCoach=theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/checkBeans")
    public String checkBeans(){
        return "Comparing Beans : myCoach == anotherCoach ? " + (myCoach==anotherCoach);
    }
}

