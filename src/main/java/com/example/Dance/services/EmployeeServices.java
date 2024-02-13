package com.example.Dance.services;

import java.util.List;

import com.example.Dance.model.Employee;

public interface EmployeeServices {
	    List<Employee> getAllEmployee();
	    void save(Employee employee);
	    Employee getById(Long id);
	    void deleteViaId(long id);
	}
