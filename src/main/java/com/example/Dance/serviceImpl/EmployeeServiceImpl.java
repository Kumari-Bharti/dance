package com.example.Dance.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dance.model.Employee;
import com.example.Dance.model.repo.EmployeeRepository;
import com.example.Dance.services.EmployeeServices;

@Service

public class EmployeeServiceImpl implements EmployeeServices {
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public List<Employee> getAllEmployee() {
		return empRepo.findAll();
	}

	@Override
	public void save(Employee employee) {
		empRepo.save(employee);
	}

	@Override
	public Employee getById(Long id) {
		java.util.Optional<Employee> optional = empRepo.findById(id);
		Employee employee = null;
		if (optional.isPresent())
			employee = optional.get();
		else
			throw new RuntimeException("Employee not found for id : " + id);
		return employee;
	}

	@Override
	public void deleteViaId(long id) {
		empRepo.deleteById(id);
	}
}
