package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeAddreService {
    
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployee() {
		
		return employeeRepository.findAll();
	}
	
	public Employee saveEmployee(Employee emp) {
		
		return employeeRepository.save(emp);
	}
	
	public Employee updateEmployee(Employee emp) {
		
	   Optional<Employee> optEmp=employeeRepository.findById(emp.getId());
	   Employee empl=null;
	   if(optEmp.isPresent()) {
		   
		   empl=optEmp.get();
	   }
	   
	   if(empl!=null) {
		   
     	   empl.setAddress(emp.getAddress());
		   empl.setAge(emp.getAge());
		   empl.setName(emp.getName());
	   }
	   
	   employeeRepository.deleteById(emp.getId());
	   
	   return employeeRepository.save(empl);
	   
	}
	
	public void deleteEmployee(Employee emp) {
		
		employeeRepository.deleteById(emp.getId());
	}
}
