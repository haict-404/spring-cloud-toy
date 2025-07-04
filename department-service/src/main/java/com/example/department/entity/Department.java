package com.example.department.entity;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Department {
  private Long id;
  private String name;
  private List<Employee> employees;
}
