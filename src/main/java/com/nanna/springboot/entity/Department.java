package com.nanna.springboot.entity;


public class Department {

    private String deptid;
    private String deptName;

    public Department(String deptid, String deptName) {
        this.deptid = deptid;
        this.deptName = deptName;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptid='" + deptid + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
