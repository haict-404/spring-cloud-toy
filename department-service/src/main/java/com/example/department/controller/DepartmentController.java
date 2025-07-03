package com.example.department.controller;

import com.example.department.client.EmployeeClient;
import com.example.department.entity.Department;
import com.example.department.entity.Employee;
import com.example.department.repos.DepartmentRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class DepartmentController {
  private final DepartmentRepository departmentRepository;
  private final EmployeeClient employeeClient;

  @GetMapping("/departments")
  public List<Department> getDepartments() throws InterruptedException {
    List<Department> result = departmentRepository.findAll();
    List<Employee> employees = employeeClient.getEmployees();
    log.error(employees.toString());
    result.forEach(item -> {
      item.setEmployees(employees);

    });
    Thread.sleep(2000); // Simulate a delay for testing purposes
    return result;
  }
}
