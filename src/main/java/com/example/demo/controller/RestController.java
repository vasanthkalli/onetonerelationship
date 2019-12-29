package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entities.Employee;
import com.example.demo.service.EmployeeAddreService;

@Controller
public class RestController {
   
	@Autowired
	private EmployeeAddreService service;
	
	@GetMapping(value="/employee/get")
	@ResponseBody
	public List<Employee> getEmployee() {
	    
		return service.getEmployee();
		
     }
	 
	@RequestMapping(value="/employee/save",method=RequestMethod.POST)
	@ResponseBody
	public Employee saveEmployee(@RequestBody Employee emp) {
		
	   return service.saveEmployee(emp);	
		
	}
	@DeleteMapping(value="employee/delete")
	@ResponseBody
	public void deleteEmployee(Employee emp) {
		
		service.deleteEmployee(emp);
	}
	@PutMapping(value="employee/update")
	@ResponseBody
	public Employee updateEmployee(Employee emp) {
		
		return service.updateEmployee(emp);
		
	}
}
