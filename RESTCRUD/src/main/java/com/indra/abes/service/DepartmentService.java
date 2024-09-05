package com.indra.abes.service;

import java.util.List;

import com.indra.abes.entity.Department;

public interface DepartmentService {
    
	//Save operation
	
	Department saveDepartment(Department department);
	
	//Read operation
	
	List<Department> fetchDepartmentList();
	
	//Update operation
	
	Department updateDepartment(Department department , Long departmentId);
	
	//delete operation
	
	void deleteDepartmentById(Long departmentId);
}
