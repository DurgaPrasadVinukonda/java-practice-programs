package com.vs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vs.properties.AppProperties;
@RestController
public class DataController {
	
	@Autowired
	private AppProperties properties;
	
	
	@RequestMapping("/getData")
	public String getData() {
		return "properrtyOne : "+properties.getPropertyOne()+"Mesaage:"+properties.getMsg();
	}
	

}
