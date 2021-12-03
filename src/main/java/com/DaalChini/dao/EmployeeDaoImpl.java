package com.DaalChini.dao;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;
import com.DaalChini.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	Map<String, Employee> employeeMap = new HashMap<String, Employee>();

	// Fetching details of all employee
	@Override
	public Map<String, Employee> getAllEmployees() {
		System.out.println("Inside EmployeeDaoImpl getAllEmployees");
		return employeeMap;
	}

	// Deleting an unwanted employee
	@Override
	public String deleteEmployeeById(String id) {
		System.out.println("Inside EmployeeDaoImpl deleteEmployeeById");
		try {
			for (String m : employeeMap.keySet()) {
				if (m.equalsIgnoreCase(id)) {
					employeeMap.remove(id);
					return "Successfully deleted " + id;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	// Adding details of an employee
	@Override
	public Employee addEmployee(Employee employee) {
		System.out.println("Inside EmployeeDaoImpl addEmployee");
		try {
			Employee emp = new Employee(employee.getId(), employee.getName(), employee.getEmail(),
					employee.getLocation());
			employeeMap.put(emp.getId(), emp);
			return emp;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	// Fetching details of a single employee on the basis of id
	@Override
	public Employee getEmployeeDetail(String id) {
		System.out.println("Inside EmployeeDaoImpl getEmployeeDetail");
		try {
			for (Map.Entry<String, Employee> m : employeeMap.entrySet()) {
				if (m.getKey().equals(id)) {
					System.out.println("inside EmployeeDaoImpl getEmployeeDetail");
					return m.getValue();
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	// Updating details of an employee
	@Override
	public Employee updateEmployeeDetail(String id, Employee emp) {
		System.out.println("Inside EmployeeDaoImpl updateEmployeeDetail");
		try {
			Employee employee = getEmployeeDetail(id);
			employee.setName(emp.getName());
			employee.setEmail(emp.getEmail());
			employee.setLocation(emp.getLocation());
			employeeMap.put(id, employee);
			return employee;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;

	}

}
