package com.example.springangularcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springangularcrud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
