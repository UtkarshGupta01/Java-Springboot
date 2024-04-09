package com.tutorial.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Do 4 Sets of Chest press -  15 reps each !";
    }

}
