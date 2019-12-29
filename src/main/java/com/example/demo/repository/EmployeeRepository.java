package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.entities.Employee;
@EnableJpaRepositories
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
