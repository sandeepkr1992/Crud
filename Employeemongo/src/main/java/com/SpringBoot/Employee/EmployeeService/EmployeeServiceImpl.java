package com.SpringBoot.Employee.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SpringBoot.Employee.EmployeeDao.EmployeeDao;

import com.SpringBoot.Employee.Model.Employee;

@Service
public class EmployeeServiceImpl {
	
	@Autowired
	EmployeeDao emp;
	
	@Transactional
	public Object get(int id) {
		return emp.findById(id);
	}
	@Transactional
	public List<Employee> getAll(){
		return emp.findAll();
	}

	@Transactional
	public void add(Employee em) {
		emp.save(em);
	}
	
	@Transactional
	public void remove(int id) {
		emp.deleteById(id);
	}
	

}
