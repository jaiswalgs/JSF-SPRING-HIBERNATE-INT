package com.codenotfound.converter;


import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.springframework.beans.factory.annotation.Autowired;

import com.codenotfound.primefaces.model.Department;
import com.codenotfound.primefaces.repository.DepartmentRepository;

@FacesConverter(value = "departmentConverter")
public class DepartmentConverter implements Converter{
	
	@Autowired
	private DepartmentRepository departmentRepository;
 
	 @Override
	    public Object getAsObject(FacesContext ctx, UIComponent uiComponent, String deptId) {
	        return departmentRepository.findByDepartmentId(Long.valueOf(deptId));	    }

	    @Override
	    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object dept) {
	        return ((Department)dept).getDepartmentId().toString();
	    }

}
