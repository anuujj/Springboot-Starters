package com.anuujj.SpringBootStarter.service;

import java.util.List;

import com.anuujj.SpringBootStarter.entity.Department;

public interface DepartmentService {

    public Department saveDepartment(Department dept);

    public List<Department> getDepartments();

    public Department getDepartmentById(long id);
    
}
