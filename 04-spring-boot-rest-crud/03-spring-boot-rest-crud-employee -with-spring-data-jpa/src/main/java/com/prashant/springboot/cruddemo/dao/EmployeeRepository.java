package com.prashant.springboot.cruddemo.dao;

import com.prashant.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    //***************--Using Spring Data JPA--**************

    //that's it...no need to write any code LOL!!

    //All required methods are given by JPA

}
