package com.tutorial.springcoredemo.config;

import com.tutorial.springcoredemo.common.Coach;
import com.tutorial.springcoredemo.common.KarateCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("fighting")
    public Coach karateCoach(){
        return new KarateCoach();
    }
}
