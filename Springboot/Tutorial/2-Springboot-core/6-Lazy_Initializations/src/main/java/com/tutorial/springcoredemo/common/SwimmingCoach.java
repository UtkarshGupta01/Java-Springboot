package com.tutorial.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach{
    public SwimmingCoach(){
        System.out.println("In Construstor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practise butterfly for 10 minutes !";
    }
}
