package com.assignment.project.employee;

import javax.persistence.Entity;

@Entity
public class Employee {
	
	private String name;
	
	private String city;
	
	private String birthdate;
	
	
	public Employee() {
		
	}
	
	public Employee(String name, String city, String birthdate) {
		super();
		
		this.name = name;
		this.city= city;
		this.birthdate=birthdate;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", birthdate=" + birthdate + "]";
	}

}
