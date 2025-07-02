package com.example.department.client;

import com.example.department.entity.Employee;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "employee-service")
public interface EmployeeClient {
  @GetMapping("/employees")
  List<Employee> getEmployees();
}
