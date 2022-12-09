package com.anuujj.SpringBoot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anuujj.SpringBoot.controller.entity.Department;

@Service
public interface DepartmentService {

    public Department saveDepartment(Department dept);

    public List<Department> getDepartments();

    public Department getDepartmentById(long deptId);

    public void deleteDepartmentById(long deptId);

    public Department updateDepartment(long deptId, Department dept);
    
}
