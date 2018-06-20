package com.suhas.spring.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Employee {
	
	private long id;
	private String firstName;
	private String lastName;
	private String description;
	
	private Employee() {}

	public Employee(String firstName, String lastName, String description) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;
	}
	
	

}
