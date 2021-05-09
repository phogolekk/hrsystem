package org.sars.hrsystem.controller;

import java.util.List;
import java.util.Optional;

import org.sars.hrsystem.entities.Employee;
import org.sars.hrsystem.exceptions.EmployeeNotFoundException;
import org.sars.hrsystem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getEmployees() {

		return employeeService.getEmployees();
	}

	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee, UriComponentsBuilder builder) {
		return employeeService.createEmployee(employee);
	}

	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable("id") Long id) {

		try {
			return employeeService.getEmployeeById(id);
		} catch (EmployeeNotFoundException ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
		}
	}

	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
		try {
			return employeeService.updateEmployee(id, employee);
		} catch (EmployeeNotFoundException ex) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,ex.getMessage());
		}
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable("id") Long id) {
		
		employeeService.deleteEmployee(id);
	}
}
