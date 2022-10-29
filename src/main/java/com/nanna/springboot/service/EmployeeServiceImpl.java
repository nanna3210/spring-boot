package com.nanna.springboot.service;

import com.nanna.springboot.dao.EmployeeRepository;
import com.nanna.springboot.entity.Department;
import com.nanna.springboot.entity.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    @Qualifier("restTemplate")
    private RestTemplate restTemplate;
    @Autowired
    private EmployeeRepository employeeRepo;


    @Value("${department.url}")
    private String DEPTurl;


    @Override
    public Employee getEmployeeDetails(String deptId) {

        ResponseEntity<Department> response = restTemplate.getForEntity(DEPTurl + deptId, Department.class);
        Department department = response.getBody();


        assert department != null;
        Employee employee = new Employee("nanna", "Dash", "101", department.getDeptName());
        Employee nannaDash = new Employee("nannaBhai", "dash", "56", "software Devlopers");

        return employee;


    }


    @Override
    public List<Employee> getEmployee() {
        List<Employee> allEmployee = employeeRepo.findAll();


        System.out.println("nanna Dash ");
        return allEmployee;
    }


	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee); 
		
	}


	@Override
	public void deleteEmployee(Long empId) {
		Employee nana= new Employee(); 
		nana.setEmpId(empId);
		employeeRepo.delete(nana);
		
		
	}


	@Override
	public Employee updateEmployee(Employee employee) {
		
		return null;
	}
}
