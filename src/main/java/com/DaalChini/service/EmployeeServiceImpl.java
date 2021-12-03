package com.DaalChini.service;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.DaalChini.dao.EmployeeDao;
import com.DaalChini.dto.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;
	
	//Fetching details of all employee
	@Override
	public Map<String, Employee> getAllEmployees() {
		System.out.println("inside EmployeeServiceImpl getAllEmployees");
		return empDao.getAllEmployees();
		
	}
	
	//Deleting an unwanted employee
	@Override
	public String deleteEmployeeById(String id) {
		System.out.println("inside EmployeeServiceImpl deleteEmployeeById");
		return empDao.deleteEmployeeById(id);
		
	}
	
	//Adding details of an employee
	@Override
	public Employee addEmployee(Employee employee) {
		System.out.println("inside EmployeeServiceImpl addEmployee");
		return empDao.addEmployee(employee);
	}
	
	//Fetching details of a single employee on the basis of id
	@Override
	public Employee getEmployeeDetail(String id) {
		System.out.println("inside EmployeeServiceImpl getEmployeeDetail");
		return empDao.getEmployeeDetail(id);
	}

	//Updating details of an employee
	@Override
	public Employee updateEmployeeDetail(String id,Employee emp) {
		System.out.println("inside EmployeeServiceImpl updateEmployeeDetail");
		return empDao.updateEmployeeDetail(id,emp);
	}

}
