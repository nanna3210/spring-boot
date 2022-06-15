package com.nanna.springboot.controller;

import com.nanna.springboot.entity.Department;
import com.nanna.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);

    }

}
