package com.anuujj.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anuujj.SpringBoot.controller.entity.Department;
import com.anuujj.SpringBoot.service.DepartmentService;

@RestController
public class DepartmentController {
    
    @Autowired
    private DepartmentService deptService;

    @PostMapping("/addDepartment")
    public Department saveDepartment(@RequestBody Department dept) {
        return deptService.saveDepartment(dept);
    }

    @GetMapping("/departments")
    public List<Department> getDepartments() {
        return deptService.getDepartments();
    }

    @GetMapping("department/{id}")
    public Department getDepartmentById(@PathVariable("id") long deptId) {
        return deptService.getDepartmentById(deptId);
    }

    @DeleteMapping("remove/{id}")
    public String deleteDepartmentById(@PathVariable("id") long deptId){
        deptService.deleteDepartmentById(deptId);
        return "Department is deleted successfully";
    }

    @PutMapping("department/id")
    public Department updateDepartment(@PathVariable long deptId, @RequestBody Department dept){
        return deptService.updateDepartment(deptId, dept);
    }
}
