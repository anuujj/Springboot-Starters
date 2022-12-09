package com.anuujj.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anuujj.SpringBoot.controller.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{
    
}
