package com.tutorial.springcoredemo.common;

public class KarateCoach implements Coach{

    public KarateCoach(){
        System.out.println("In Contructor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practise punching 100 times !";
    }
}
