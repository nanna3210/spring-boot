package com.nanna.springboot.service;

import com.nanna.springboot.entity.Employee;

import java.util.List;


public interface EmployeeService {

    public Employee getEmployeeDetails ( String deptId );

    public List <Employee> getEmployee ( );

	public Employee addEmployee(Employee employee);

	public void deleteEmployee(Long empId);
	
	public Employee updateEmployee(Employee employee);

	 



}
