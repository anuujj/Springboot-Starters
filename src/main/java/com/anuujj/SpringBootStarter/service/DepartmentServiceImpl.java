package com.anuujj.SpringBootStarter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuujj.SpringBootStarter.entity.Department;
import com.anuujj.SpringBootStarter.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository deptRepo;
    @Override
    public Department saveDepartment(Department dept) {
        return deptRepo.save(dept);
    }
    @Override
    public List<Department> getDepartments() {
        return deptRepo.findAll();
    }
    @Override
    public Department getDepartmentById(long id) {
        return deptRepo.findById(id).get();
    }
    
}
