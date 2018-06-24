package com.suhas.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suhas.spring.dao.EmployeeRepository;
import com.suhas.spring.model.Employee;

@Service
public class EmployeeService {

	@Autowired 
	private EmployeeRepository empRepo;
	
	public List<Employee> getEmployees(){
		List<Employee> empList = new ArrayList<>();
		empRepo.findAll().forEach(empList :: add);
		return empList;
	}
	
	public void addEmployee(Employee emp) {
		empRepo.save(emp);
	}
}
