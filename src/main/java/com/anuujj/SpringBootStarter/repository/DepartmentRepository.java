package com.anuujj.SpringBootStarter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.anuujj.SpringBootStarter.entity.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, Long>{
    
}
