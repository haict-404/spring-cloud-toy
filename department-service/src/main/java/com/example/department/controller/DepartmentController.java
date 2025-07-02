package com.example.department.controller;

import com.example.department.client.EmployeeClient;
import com.example.department.entity.Department;
import com.example.department.entity.Employee;
import com.example.department.repos.DepartmentRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DepartmentController {
  private final DepartmentRepository departmentRepository;
  private final EmployeeClient employeeClient;

  @GetMapping("/departments")
  public List<Department> getDepartments() {
    List<Department> result = departmentRepository.findAll();
    List<Employee> employees = employeeClient.getEmployees();

    result.forEach(item -> {
      item.setEmployees(employees);
    });

    return result;
  }
}
