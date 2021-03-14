package com.example.empdata1.repository;

import com.example.empdata1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeJpa extends JpaRepository<Employee,Long> {
}
