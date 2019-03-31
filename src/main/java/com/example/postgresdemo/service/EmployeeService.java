package com.example.postgresdemo.service;

import com.example.postgresdemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    void insertEmployee(Employee emp);

    void updateEmployee(Employee emp);

    void executeUpdateEmployee(Employee emp);

    void deleteEmployee(Employee emp);
}
