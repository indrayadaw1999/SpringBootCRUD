package com.indra.abes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indra.abes.entity.Department;
import com.indra.abes.service.DepartmentService;


@RestController
public class DepartmentController {
     
	@Autowired
	private DepartmentService departmentService;
	
	//save operation
	@PostMapping("/department")
	public Department savDepartment(@Validated @RequestBody Department department)
	{
		return departmentService.saveDepartment(department);
	}
	
	//Read Operation
	
	@GetMapping("/department")
	public List<Department> fetchDepartmentList()
	{
		return departmentService.fetchDepartmentList();
	}
	
	//update department 
	@PutMapping("/department/{id}")
	public Department updateDepartment(@RequestBody Department department , @PathVariable("id") Long departmentId) {
		return departmentService.updateDepartment(department, departmentId);
		
	}
	
	//delete department
	
	@DeleteMapping("/department/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
		
		departmentService.deleteDepartmentById(departmentId);
		
		return "delete successfully";
		
	}
}
