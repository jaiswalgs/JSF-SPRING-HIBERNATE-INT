package com.codenotfound.primefaces.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.RowEditEvent;
import org.springframework.beans.factory.annotation.Autowired;


import com.codenotfound.primefaces.model.Department;
import com.codenotfound.primefaces.model.Employee;
import com.codenotfound.primefaces.repository.DepartmentRepository;
import com.codenotfound.primefaces.repository.EmployeeRepository;


@Named
@ViewScoped
public class EmployeeListView implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
    private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	private Employee employee;
	private String department ;
	private Department depObj;
	private List<Employee> employeeList;
	private List<Department> departmentList ;

	
	@PostConstruct
    public void init() {
			employeeList = employeeRepository.findAll();
			departmentList = departmentRepository.findAll();
	    	depObj = new Department();
	    	employee = new Employee();
    }


	public String addEmployee() {
		try
		{
			if(depObj.getDepartmentId() != null){
				depObj = departmentRepository.findByDepartmentId(depObj.getDepartmentId());
			}
			employee.setDepartment(depObj);
			employeeRepository.save(employee);
			FacesContext.getCurrentInstance().addMessage(null, 
					new FacesMessage("Employee "+this.employee.getEmpName()+" Is Added Successfully"));
			init();
			System.out.println("end");
		}
		catch(Exception e)
		{
			e.getMessage();
			System.out.println("catch");
		}
		return "";
	}
	
	public String deleteEmployee(Employee empl) {
		try
		{
			employeeRepository.delete(empl);
			FacesContext.getCurrentInstance().addMessage(null, 
					new FacesMessage("The Car "+ this.employee.getEmpName()+" Is Deleted Successfully"));
			init();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		return "";
	}
	
	public void onRowEdit(RowEditEvent event) {
		try
		{
			Employee empNew = (Employee)event.getObject();
			employeeRepository.save(empNew);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	 }
    
	public String logout() {
		try
		{
			return "Login";
		}
		catch(Exception e)
		{
			e.getMessage();
			return null;
		}
	}
	
	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public List<Department> getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(List<Department> departmentList) {
		this.departmentList = departmentList;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public Department getDepObj() {
		return depObj;
	}


	public void setDepObj(Department depObj) {
		this.depObj = depObj;
	}


	public Department getDepartment(Integer id) {
        if (id == null){
            throw new IllegalArgumentException("no id provided");
        }
        for (Department dept : departmentList){
            if (id.equals(dept.getDepartmentId())){
                return dept;
            }
        }
        return null;
    }

	
	

}
