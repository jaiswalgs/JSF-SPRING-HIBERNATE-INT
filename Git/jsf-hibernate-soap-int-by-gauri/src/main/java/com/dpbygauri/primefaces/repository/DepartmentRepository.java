package com.dpbygauri.primefaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpbygauri.primefaces.model.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long>{
	
	Department findByDepartmentId(Long id);
	
}
