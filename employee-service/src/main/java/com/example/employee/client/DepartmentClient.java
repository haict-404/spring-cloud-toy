package com.example.employee.client;

import com.example.employee.entity.Department;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "department-service")
public interface DepartmentClient {
  @GetMapping("/departments")
  List<Department> getDepartments();
}
