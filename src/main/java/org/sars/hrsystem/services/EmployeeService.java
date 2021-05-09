package org.sars.hrsystem.services;

import java.util.List;
import java.util.Optional;

import org.sars.hrsystem.entities.Employee;
import org.sars.hrsystem.exceptions.EmployeeExistException;
import org.sars.hrsystem.exceptions.EmployeeNotFoundException;
import org.sars.hrsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployees(){
		
		return employeeRepository.findAll();
		
	}
	
	public Employee createEmployee(Employee employee) {
		
		
		return employeeRepository.save(employee);
	}
	
	public Optional<Employee> getEmployeeById(Long id) throws EmployeeNotFoundException {
		
		Optional<Employee> employee= employeeRepository.findById(id);
		
		if(!employee.isPresent()) {
			throw new EmployeeNotFoundException("Employee does not exists");
		}
		return employee;		
		
	}
	
	
	public Employee updateEmployee(Long id, Employee employee) throws EmployeeNotFoundException {
		
		Optional<Employee> Optionalemployee = employeeRepository.findById(id);

		if(!Optionalemployee.isPresent()) {
			throw new EmployeeNotFoundException("Employee does not exists");
		}
		employee.setId(id);
		
		return employeeRepository.save(employee);
	}
	
	
	public void deleteEmployee(Long id) {
		
		Optional<Employee> Optionalemployee = employeeRepository.findById(id);

		if(!Optionalemployee.isPresent()) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Employee not present");
		}
		employeeRepository.deleteById(id);
	}
}
