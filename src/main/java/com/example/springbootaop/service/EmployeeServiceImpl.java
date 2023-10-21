package com.example.springbootaop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootaop.model.Employee;
import com.example.springbootaop.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

   private EmployeeRepository employeeRepository;

   @Autowired
   public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
      this.employeeRepository = employeeRepository;
   }

   @Override
   public Employee createEmployee(Employee employee) {
      return this.employeeRepository.save(employee);
   }

   @Override
   public List<Employee> fetchAllEmployee() {
      return this.employeeRepository.findAll();
   }

   @Override
   public Employee fetchEmployeeById(Integer id) {
      return this.employeeRepository.findById(id).get();
   }

}
