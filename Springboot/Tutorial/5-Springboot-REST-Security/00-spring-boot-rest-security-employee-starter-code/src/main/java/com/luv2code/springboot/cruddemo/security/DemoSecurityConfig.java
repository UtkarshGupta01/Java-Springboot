package com.luv2code.springboot.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){

        UserDetails utkarsh = User.builder()
                .username("utkarsh123")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails sneha = User.builder()
                .username("sneha123")
                .password("{noop}test123")
                .roles("EMPLOYEE","ADMIN")
                .build();

        UserDetails sarthak= User.builder()
                .username("sarthak123")
                .password("{noop}test123")
                .roles("EMPLOYEE","ADMIN","MANAGER")
                .build();

        return  new InMemoryUserDetailsManager(utkarsh,sneha,sarthak);

    }
}
