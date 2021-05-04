package com.springboot.DemoThymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.DemoThymeleaf.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}