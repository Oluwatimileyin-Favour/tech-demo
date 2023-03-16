package com.example.demo;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
public class EmployeeTestConfiguration {
    @Bean
    @Primary
    public Employee emp() {
        return Mockito.mock(Employee.class);
    }
}
