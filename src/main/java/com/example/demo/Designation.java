package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Designation {
    @Autowired
    Employee emp;
    public Designation(Employee emp) {
        this.emp = emp;
    }
    public String getDesignation() {
        return emp.getEmpName ();
    }

}
