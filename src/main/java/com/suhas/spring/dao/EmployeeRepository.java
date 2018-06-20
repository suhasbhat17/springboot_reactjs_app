package com.suhas.spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.suhas.spring.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
