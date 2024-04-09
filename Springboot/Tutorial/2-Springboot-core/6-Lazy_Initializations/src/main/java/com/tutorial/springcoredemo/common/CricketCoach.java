package com.tutorial.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    public CricketCoach(){
        System.out.println("In Construstor : " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practise fast Bowling for 15 mins";
    }

}
