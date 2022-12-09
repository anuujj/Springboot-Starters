package com.anuujj.SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anuujj.SpringBoot.controller.entity.Department;
import com.anuujj.SpringBoot.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

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
    public Department getDepartmentById(long deptId) {
        
        return deptRepo.findById(deptId).get();
    }

    @Override
    public void deleteDepartmentById(long deptId) {
        deptRepo.deleteById(deptId);
    }

    @Override
    public Department updateDepartment(long deptId, Department dept) {
        Department deptDb = deptRepo.findById(deptId).get();
        return deptDb;
    }
    
}
