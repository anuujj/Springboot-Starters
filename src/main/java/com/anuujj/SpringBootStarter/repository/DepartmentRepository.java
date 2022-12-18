package com.anuujj.SpringBootStarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anuujj.SpringBootStarter.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
    
}
