package com.example.employee.controller;

import com.example.employee.entity.Employee;
import com.example.employee.repos.EmployeeRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmployeeController {
  private final EmployeeRepository employeeRepository;

  @GetMapping("/employees")
  public List<Employee> getEmployees() {
    return employeeRepository.findAll();
  }
}
