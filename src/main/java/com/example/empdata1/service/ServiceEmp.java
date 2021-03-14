package com.example.empdata1.service;

import com.example.empdata1.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ServiceEmp {
    List<Employee> addemployee();
}
