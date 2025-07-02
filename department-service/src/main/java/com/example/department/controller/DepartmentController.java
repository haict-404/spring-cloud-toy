package com.example.department.controller;

import com.example.department.entity.Department;
import com.example.department.repos.DepartmentRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DepartmentController {
  private final DepartmentRepository departmentRepository;

  @GetMapping("/departments")
  public List<Department> getDepartments() {
    return departmentRepository.findAll();
  }
}
