package com.example.department.entity;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
  private Long id;
  private String name;
  private int age;
}
