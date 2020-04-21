package com.vs.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vs.model.Response;


@Service
public class EmployeeService {
	
	//This is a Employee Service were we will write business logic in that class
	//if we want to use the any properties from configuration or application properties we use @ value tag
	@Value("${datasource.url}")
	private String dataSourceUrl;
	
	public Response getResponse() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Response> responseEntity =restTemplate.exchange(dataSourceUrl,HttpMethod.GET,null, Response.class);
		Response response = responseEntity.getBody();
		return response;
		
	}
	

}
