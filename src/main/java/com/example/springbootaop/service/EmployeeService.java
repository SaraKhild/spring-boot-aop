package com.example.springbootaop.service;

import java.util.List;

import com.example.springbootaop.model.Employee;

public interface EmployeeService {

    public Employee createEmployee(Employee employee);

    public Employee fetchEmployeeById(Integer id);

    public List<Employee> fetchAllEmployee();

}
