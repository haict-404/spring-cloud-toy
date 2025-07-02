package com.example.employee.repos;

import com.example.employee.entity.Department;
import com.example.employee.entity.Employee;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
  private final List<Employee> employees = new ArrayList<>();

  @PostConstruct
  public void init() {
    employees.add(Employee.builder().id(1L).name("John Doe").age(30).build());
    employees.add(Employee.builder().id(2L).name("John Doe").age(30).build());
    employees.add(Employee.builder().id(3L).name("John Doe").age(30).build());
  }

  public List<Employee> findAll() {
    return new ArrayList<>(employees);
  }
}
