package com.SpringBoot.Employee.EmployeeDao;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.SpringBoot.Employee.Model.Employee;





public interface EmployeeDao extends MongoRepository<Employee, Integer> {
	

	

}
