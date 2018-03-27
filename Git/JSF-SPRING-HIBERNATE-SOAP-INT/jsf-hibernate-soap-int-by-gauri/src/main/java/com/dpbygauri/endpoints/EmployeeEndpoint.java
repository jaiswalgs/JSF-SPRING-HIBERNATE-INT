package com.dpbygauri.endpoints;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.beans.BeanUtils;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.dpbygauri.gs_ws.AddEmployeeRequest;
import com.dpbygauri.gs_ws.AddEmployeeResponse;
import com.dpbygauri.gs_ws.DeleteEmployeeRequest;
import com.dpbygauri.gs_ws.DeleteEmployeeResponse;
import com.dpbygauri.gs_ws.EmployeeInfo;
import com.dpbygauri.gs_ws.EmployeeStatus;
import com.dpbygauri.gs_ws.GeAllEmployeesByNameResponse;
import com.dpbygauri.gs_ws.GetEmployeeByNameRequest;
import com.dpbygauri.gs_ws.GetEmployeeByNameResponse;
import com.dpbygauri.gs_ws.UpdateEmployeeRequest;
import com.dpbygauri.gs_ws.UpdateEmployeeResponse;


@Endpoint
public class EmployeeEndpoint {

	private static final String NAMESPACE_URI = "http://www.dpbygauri.com/employee-ws";
	
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getEmployeeByNameRequest")
	@ResponsePayload
	public GetEmployeeByNameResponse getEmployee(@RequestPayload GetEmployeeByNameRequest request) {
		
		GetEmployeeByNameResponse response = new GetEmployeeByNameResponse();
		EmployeeInfo info = new EmployeeInfo();
		info.setAddress("TEST");
		response.setEmployeeInfo(info);
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllEmployeesByNameRequest")
	@ResponsePayload
	public GeAllEmployeesByNameResponse getAllEmployees() {
		
		GeAllEmployeesByNameResponse response = new GeAllEmployeesByNameResponse();
		EmployeeInfo info = new EmployeeInfo();
		List<EmployeeInfo> employeeInfoList = new ArrayList<>();
		info.setAddress("TEST");
		employeeInfoList.set(0, info);
		info.setAddress("TEST");
		employeeInfoList.set(1, info);
		
	/*	List<Article> articleList = articleService.getAllArticles();
		for (int i = 0; i < articleList.size(); i++) {
			 ArticleInfo ob = new ArticleInfo();
		     BeanUtils.copyProperties(articleList.get(i), ob);
		     articleInfoList.add(ob);    
		}
		response.getEmployeeInfo();*/
		response.getEmployeeInfo().addAll(employeeInfoList);
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "addEmployeeRequest")
	@ResponsePayload
	public AddEmployeeResponse addEmployee(@RequestPayload AddEmployeeRequest request) {
		
		AddEmployeeResponse response = new AddEmployeeResponse();
		EmployeeInfo info = new EmployeeInfo();
		info.setAddress("TEST");
		response.setEmployeeInfo(info);
        return response;
	}
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateEmployeeRequest")
	@ResponsePayload
	public UpdateEmployeeResponse updateEmployee(@RequestPayload UpdateEmployeeRequest request) {
		
		UpdateEmployeeResponse response = new UpdateEmployeeResponse();
		EmployeeStatus serviceStatus = new EmployeeStatus();
		serviceStatus.setMessage("Sucess");
	   	serviceStatus.setStatusCode("450");
        response.setEmployeeStatus(serviceStatus);
        return response;
	}
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteEmployeeRequest")
	@ResponsePayload
	public DeleteEmployeeResponse deleteEmployee(@RequestPayload DeleteEmployeeRequest request) {
		
		DeleteEmployeeResponse response = new DeleteEmployeeResponse();
		EmployeeStatus serviceStatus = new EmployeeStatus();
		serviceStatus.setMessage("Sucess");
	   	serviceStatus.setStatusCode("450");
	    response.setEmployeeStatus(serviceStatus);
        return response;
	}
	
}
