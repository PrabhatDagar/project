package com.assignment.project.professor;

import javax.persistence.Entity;

@Entity
public class Professor {

	private String p_name;
	
	private String p_city;
	
	private String p_birthdate;
	

	public Professor() {
		
	}
	
	public Professor(String p_name, String p_city, String p_birthdate ) {
		this.p_name=p_name;
		this.p_city=p_city;
		this.p_birthdate=p_birthdate;
		
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_city() {
		return p_city;
	}

	public void setP_city(String p_city) {
		this.p_city = p_city;
	}

	public String getP_birthdate() {
		return p_birthdate;
	}

	public void setP_birthdate(String p_birthdate) {
		this.p_birthdate = p_birthdate;
	}

	@Override
	public String toString() {
		return "Professor [p_name=" + p_name + ", p_city=" + p_city + ", p_birthdate=" + p_birthdate + "]";
	}
	
	
	
}
