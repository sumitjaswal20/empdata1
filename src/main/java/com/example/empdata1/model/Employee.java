package com.example.empdata1.model;

import org.springframework.data.repository.cdi.Eager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="empvalue")
public class Employee {
    @Id
    @GeneratedValue
    Long id;
    int empno;
    String name;

    public Employee() {
    }

    public Employee(int empno, String name) {
        this.empno = empno;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
