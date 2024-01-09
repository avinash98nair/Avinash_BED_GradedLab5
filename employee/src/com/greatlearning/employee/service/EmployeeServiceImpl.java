package com.greatlearning.employee.service;

import java.util.List;

import com.greatlearning.employee.data.Employee;
import com.greatlearning.employee.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository repository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	@Override
	public void addNewEmployee(Employee employee) {
		repository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		repository.save(employee);
	}

	@Override
	public void deleteEmployeeById(int empId) {
		repository.deleteById(empId);
	}

	@Override
	public Employee getEmployeeById(int empId) {
		return repository.findById(empId).orElse(null);
	}
}
