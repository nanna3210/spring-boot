package com.nanna.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empployee_tbl")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empId; 
    private String fname ;
    private String lname;
    private String deptId ;
    private String dname;
    


    public Employee(String fname, String lname, String deptId, String dname) {
        this.fname = fname;
        this.lname = lname;
        this.deptId = deptId;
        this.dname = dname;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", deptId='" + deptId + '\'' +
                ", dname='" + dname + '\'' +
                '}';
    }

    
    public void setEmpId(Long empId) {
		this.empId = empId;
	}
    public Long getEmpId() {
		return empId;
	}
    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
