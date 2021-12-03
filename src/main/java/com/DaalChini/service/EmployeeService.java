package com.DaalChini.service;

import java.util.Map;
import com.DaalChini.dto.Employee;

public interface EmployeeService {

	Map<String, Employee> getAllEmployees();

	String deleteEmployeeById(String id);

	Employee addEmployee(Employee employee);

	Employee getEmployeeDetail(String id);

	Employee updateEmployeeDetail(String id, Employee emp);

}
