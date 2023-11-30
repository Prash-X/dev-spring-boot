package com.prashant.springboot.cruddemo.dao;

import com.prashant.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //***************--Using Spring Data JPA--**************

    //that's it...no need to write any code LOL!!
    
    //All required methods are given by JPA

}
