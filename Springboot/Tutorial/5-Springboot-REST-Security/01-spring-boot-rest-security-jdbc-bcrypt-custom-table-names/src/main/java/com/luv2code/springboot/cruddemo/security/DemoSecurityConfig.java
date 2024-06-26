package com.luv2code.springboot.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(configure ->
                configure
                        .requestMatchers(HttpMethod.GET,"/api/employees").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.GET,"/api/employees/**").hasRole("EMPLOYEE")
                        .requestMatchers(HttpMethod.POST,"/api/employees").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.PUT,"/api/employees").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.DELETE,"/api/employees/**").hasRole("ADMIN"));

        http.httpBasic(Customizer.withDefaults());

        http.csrf(csrf-> csrf.disable());

        return http.build();

    }

      /*
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
     */
}
