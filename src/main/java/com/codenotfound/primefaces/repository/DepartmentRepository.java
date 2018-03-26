package com.codenotfound.primefaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codenotfound.primefaces.model.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long>{
	
	Department findByDepartmentId(Long id);
	
}
