package com.dpbygauri.primefaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpbygauri.primefaces.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
