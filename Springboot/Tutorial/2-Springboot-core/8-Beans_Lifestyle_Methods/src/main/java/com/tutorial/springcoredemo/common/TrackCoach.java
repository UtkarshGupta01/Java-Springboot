package com.tutorial.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    @PostConstruct
    public void doMyStuff(){
        System.out.println("In doMyStuff : " + getClass().getSimpleName());
    }

    @PreDestroy
    public void clearMyStuff(){
        System.out.println("In clearMyStuff : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run for 10 minutes straight !";
    }
}
