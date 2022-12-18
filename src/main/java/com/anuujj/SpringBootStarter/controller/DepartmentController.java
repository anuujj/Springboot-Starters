package com.anuujj.SpringBootStarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anuujj.SpringBootStarter.entity.Department;
import com.anuujj.SpringBootStarter.service.DepartmentService;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService deptService; 
    @PostMapping("addDepartment")
    public long saveDepartment(@RequestBody Department dept){
        return deptService.saveDepartment(dept);
    }
    @GetMapping("departments")
    public List<Department> getDepartments(){
        return deptService.getDepartments(); 
    } 
    @GetMapping("department/{id}")
    public Department getDepartmentById(@PathVariable("id") long id){
        return deptService.getDepartmentById(id);
    }
}
