package com.training.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.model.Employee;
import com.training.springboot.service.DatasourceConfig;
import com.training.springboot.service.EmployeeService;

@RestController
@RequestMapping("/v1/api/employee")
public class EmployeeController {
	
	@Autowired
	private Environment env;
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	//@Qualifier("devDatasourceConfig")
	DatasourceConfig config;
	
	@Value("${jdbc.url}")
	String jdbcURL;
	
	@Value("${jdbc.username}")
	String jdbcUsername;
	
	@GetMapping("/list")
	public List<Employee> allEmployee(){
		
		return employeeService.getAll();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable int id){
		return employeeService.find(id);
	}
	
	@PostMapping
	public Employee postEmployee(@RequestBody Employee e){
		return employeeService.save(e);
	}
	
	@DeleteMapping("/{id}")
	public String  deleteEmployee(@PathVariable int id){
		return employeeService.delete(id) ? "Successfully" : "Not Successfully";
	}
	
	@GetMapping("/details")
	public String  details(){
		return jdbcURL + " " + jdbcUsername
			+ "   " + env.getProperty("application.version")	
				;
	}
	
}
