package com.DaalChini.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DaalChini.dto.Employee;
import com.DaalChini.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	//Get method to get details of all the employees
	@GetMapping("/getEmployees")
	public Map<String, Employee> getAllEmployees() {
		System.out.println("inside Employee controller getEmployees");
		return empService.getAllEmployees();
	}
	
	//Get method to get details of single employee on the basis of ID
	@GetMapping("/getEmployees/{id}")
	public Employee getEmployeeDetail(@PathVariable String id) {
		System.out.println("inside EmployeeController getEmployeeDetail");
		return empService.getEmployeeDetail(id);
	}
	
	//Post method to add details of an employee
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		System.out.println("inside EmployeeController addEmployee");
		return this.empService.addEmployee(employee);
	}
	
	//Delete method to delete an unwanted employee details
	@DeleteMapping("/employee/{id}")
	public String deleteEmployeeById(@PathVariable String id) {
		System.out.println("inside EmployeeController deleteEmployeeById");
		return empService.deleteEmployeeById(id);
	}
	
	//Put method to update values of a single employee
	@PutMapping("/employee/{id}")
	public Employee updateEmployeeDetail(@PathVariable String id,@RequestBody @Valid Employee emp) {
		System.out.println("inside EmployeeController updateEmployeeDetail");
		return empService.updateEmployeeDetail(id,emp);
	}
	

}
