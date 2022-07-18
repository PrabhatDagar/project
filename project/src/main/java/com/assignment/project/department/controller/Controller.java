package com.assignment.project.department.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.project.department.Department;
import com.assignment.project.department.controller.repository.Repository;

@RestController
public class Controller {
	
	
	@Autowired
private Repository repository;
	
	
	@GetMapping("/department")
	public List<Department> getAllDepartment(){
		return repository.findAll();
	}
	@GetMapping("/department/{id}")
	public Department getDepartmentDetails(@PathVariable long id) {
		
		Optional<Department> department= repository.findById(id);
		
		if(department.isEmpty()) {
			 throw new RuntimeException("Department not found with id" + id);
			 
		}
		return department.get();
	}
	
	@PostMapping("/department")
	public void createDepartment(@RequestBody Department department) {
		repository.save(department);
		
	}
	
	@PutMapping("/department/{id}")
	public void updateDepartment(@PathVariable long id) {
		Department department = new Department();
		repository.save(department);
		
	}
	
	@DeleteMapping("/department/{id}")
	public void deleteDepartment(@PathVariable long id) {
		repository.deleteById(id);
	}
}
