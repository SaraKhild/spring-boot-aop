package com.example.springbootaop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootaop.model.Employee;
import com.example.springbootaop.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee addEmployee = this.employeeService.createEmployee(employee);
        return ResponseEntity.ok().body(addEmployee);

    }

    @GetMapping("/fetch-employee-by-id/{id}")
    public ResponseEntity<Employee> fetchEmployeeById(Integer id) {
        Employee getEmployee = this.employeeService.fetchEmployeeById(id);
        return ResponseEntity.ok().body(getEmployee);
    }

    @GetMapping("/fetch")
    public ResponseEntity<List<Employee>> fetchEmployees() {
        return ResponseEntity.ok().body(this.employeeService.fetchAllEmployee());
    }

}
