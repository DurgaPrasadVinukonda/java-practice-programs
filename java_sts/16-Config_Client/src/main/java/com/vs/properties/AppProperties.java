package com.vs.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties
@Component
public class AppProperties {
	
	@Value("${propertyOne}")
	private String propertyOne;
	
	@Value("${msg}")
	private String msg;
	
	public String getPropertyOne() {
		return propertyOne;
	}
	public void setPropertyOne(String propertyOne) {
		this.propertyOne = propertyOne;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
