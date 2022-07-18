package com.assignment.project.department.controller.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.project.department.Department;

public interface Repository  extends JpaRepository<Department, Long>{
	

}
