package com.codenotfound.primefaces.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name="emp_id")
	private Long empId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_address")
	private String address;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	public Employee() {
		
	}
	
	public Employee(String empName) {
		this.empName = empName;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
}