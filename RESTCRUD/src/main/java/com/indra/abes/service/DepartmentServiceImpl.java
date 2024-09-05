package com.indra.abes.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.abes.entity.Department;
import com.indra.abes.repository.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepo departmentRepo;
	
	//save operation

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepo.save(department);
	}
	
	//Read Operation

	@Override
	public List<Department> fetchDepartmentList() {
		// TODO Auto-generated method stub
		return (List<Department>)departmentRepo.findAll();
	}

	@Override
	public Department updateDepartment(Department department, Long departmentId) {
		// TODO Auto-generated method stub
		Department depDB
        = departmentRepo.findById(departmentId)
              .get();

    if (Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase( department.getDepartmentName())) 
    {
        depDB.setDepartmentName( department.getDepartmentName());
    }

    if (Objects.nonNull( department.getDepartmentAddress()) && !"".equalsIgnoreCase( department.getDepartmentAddress())) 
    {
    	
                depDB.setDepartmentAddress(  department.getDepartmentAddress());
    }

    if (Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase( department.getDepartmentCode())) 
    {
        depDB.setDepartmentCode( department.getDepartmentCode());
    }

       return departmentRepo.save(depDB);	
	}

	//delete operation
	
	@Override
	public void deleteDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		
		departmentRepo.deleteById(departmentId);
		
	}
	
	
	
}
