package com.nanna.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nanna.springboot.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
