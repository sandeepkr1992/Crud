package com.SpringBoot.Employee.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Employee.EmployeeService.EmployeeServiceImpl;
import com.SpringBoot.Employee.Model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeServiceImpl empser;

	@GetMapping("/getall")
	public List<Employee> getAll() {
		return empser.getAll();
	}
	

	@GetMapping("/get/{id}")
	public Object get(@PathVariable int id) {
		return  empser.get(id);
	}
	
@PostMapping("/add" )
	public void add(@RequestBody Employee eobj) {
		empser.add(eobj);
			}

@DeleteMapping("/delete/{id}")
public void delete(@PathVariable int id) {
	empser.remove(id);
}

	
}
