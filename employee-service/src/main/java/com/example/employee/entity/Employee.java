package com.example.employee.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
  private Long id;
  private String name;
  private int age;
}
