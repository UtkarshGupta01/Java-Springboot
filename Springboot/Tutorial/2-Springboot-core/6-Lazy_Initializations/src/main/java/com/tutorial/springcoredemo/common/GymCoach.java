package com.tutorial.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class GymCoach implements Coach{
    public GymCoach(){
        System.out.println("In Construstor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Do 4 Sets of Chest press -  15 reps each !";
    }

}
