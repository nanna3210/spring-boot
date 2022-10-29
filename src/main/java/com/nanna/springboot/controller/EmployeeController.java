package com.nanna.springboot.controller;

import com.nanna.springboot.entity.Employee;
import com.nanna.springboot.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/emp/{dept}")
	public Employee getEmployeeByEmployeeId(@PathVariable String dept) {

		return employeeService.getEmployeeDetails(dept);

	}

	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {

		return employeeService.getEmployee();
	}

	@PostMapping("/employee/add")
	public Employee addEmployee(@RequestBody Employee employee ) { 

			
		return employeeService.addEmployee(employee) ; 
	}


	@DeleteMapping("/employee/delete/{empId}")
	public void deleteEmployee(@PathVariable Long empId) { 
		
		employeeService.deleteEmployee(empId); 
	}
}
