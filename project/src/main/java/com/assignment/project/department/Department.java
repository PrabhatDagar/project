package com.assignment.project.department;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.assignment.project.employee.Employee;
import com.assignment.project.professor.Professor;

@Entity
public class Department {
	
	@Id
	@GeneratedValue
	private long d_id;
	
    private String d_name;
    
    @ManyToOne
    private Employee employee;
    
    @ManyToOne
    private Professor professor;
	
	
	public Department() {
		
	}
public Department(long d_id, String d_name) {
	this.d_id=d_id;
	this.d_name=d_name;
	
}
public long getD_id() {
	return d_id;
}
public void setD_id(long d_id) {
	this.d_id = d_id;
}
public String getD_name() {
	return d_name;
}
public void setD_name(String d_name) {
	this.d_name = d_name;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public Professor getProfessor() {
	return professor;
}
public void setProfessor(Professor professor) {
	this.professor = professor;
}
@Override
public String toString() {
	return "Department [d_id=" + d_id + ", d_name=" + d_name + ", employee=" + employee + ", professor=" + professor
			+ "]";
}


}
