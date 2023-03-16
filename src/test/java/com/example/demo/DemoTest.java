package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.mockito.Mockito.mock;

@SpringBootTest
@ActiveProfiles("test")
public class DemoTest {
    @Autowired
    private Designation desg;
    @Autowired
    private Employee emp;
    @Test
    public void whenEmpIdIsProvided_thenNameIsCorrect() {
        desg.emp = emp;
        emp = mock(Employee.class);
        Mockito.when(emp.getEmpName ()).thenReturn(desg.getDesignation());
        String test1 = desg.getDesignation();
        Assertions.assertEquals(emp.getEmpName(), test1);
    }
}
