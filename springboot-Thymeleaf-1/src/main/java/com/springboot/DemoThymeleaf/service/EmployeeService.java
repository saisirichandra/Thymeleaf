package com.springboot.DemoThymeleaf.service;

import java.util.List;

import com.springboot.DemoThymeleaf.model.Employee;

public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}