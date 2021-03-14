package com.example.empdata1.service;

import com.example.empdata1.model.Employee;
import com.example.empdata1.repository.EmployeeJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceEmpIn implements ServiceEmp{
    @Autowired
    EmployeeJpa employeeJpa;
    @Override
    public List<Employee> addemployee() {

        return employeeJpa.findAll();
    }
}
