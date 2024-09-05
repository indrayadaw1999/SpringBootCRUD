package com.indra.abes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.indra.abes.entity.Department;

@Repository
public interface DepartmentRepo extends CrudRepository<Department, Long> {

}
