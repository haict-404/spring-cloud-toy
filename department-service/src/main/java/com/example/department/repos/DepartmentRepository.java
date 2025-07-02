package com.example.department.repos;

import com.example.department.entity.Department;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentRepository {
  private final List<Department> departments = new ArrayList<>();

  @PostConstruct
  public void init() {
    departments.add(Department.builder().id(1L).name("HR").build());
    departments.add(Department.builder().id(2L).name("IT").build());
    departments.add(Department.builder().id(3L).name("Finance").build());
  }

  public List<Department> findAll() {
    return new ArrayList<>(departments);
  }
}
