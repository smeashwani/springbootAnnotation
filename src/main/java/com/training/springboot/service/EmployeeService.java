package com.training.springboot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.training.springboot.model.Employee;

@Service
public class EmployeeService {

	HashMap<Integer, Employee> map = new HashMap();
	
	public Employee save(Employee e) {
		map.put(e.getId(), e);
		return e;
	}
	
	public Employee find(int id) {
		return map.get(id);
	}
	
	public boolean delete(int id) {
		map.remove(id);
		return !map.containsKey(id);
	}
	
	public List<Employee> getAll(){
		ArrayList<Employee> list = new ArrayList();
		map.forEach( (k,v) -> {
			list.add(v);
		});
		return list;
	}
		
}
