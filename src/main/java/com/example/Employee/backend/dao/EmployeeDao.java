package com.example.Employee.backend.dao;

import com.example.Employee.backend.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
}
