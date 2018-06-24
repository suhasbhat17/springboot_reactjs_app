package com.suhas.spring.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.suhas.spring.model.Employee;
import com.suhas.spring.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empserv;
	
	@RequestMapping("/emp")
	public List<Employee> getEmployees() {
		//return empserv.getEmployees();	
		return Arrays.asList(
				new Employee("suhas", "bhat", "asdasd"),
				new Employee("asdasd", "asdasd", "awqeqwe"),
				new Employee("asdasdasdasdasd", "asdasd", "awqeqwe")
				);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/emp")
	public void addEmployee(@RequestBody Employee emp) {
		empserv.addEmployee(emp);
	}
}
