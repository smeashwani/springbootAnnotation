package com.training.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.service.DatasourceConfig;

@RestController
@RequestMapping("/v1/api/employee")
public class EmployeeController {
	
	@Autowired
	DatasourceConfig config;
	
	@GetMapping("/profile")
	public String  profile(){
		return 	String.format("URL= %s , Name=%s , Pwd=%s", config.getUrl(), config.getUsername(), config.getUserPwd() );
	}
}
