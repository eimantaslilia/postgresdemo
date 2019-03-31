package com.example.postgresdemo.controller;


import com.example.postgresdemo.entity.Employee;
import com.example.postgresdemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("postgresApp")
public class ApplicationController {

    @Resource
    EmployeeService employeeService;

    @GetMapping(value = "/employeeList")
    public List<Employee> getEmployees(){
        return employeeService.findAll();
    }

    @PostMapping(value = "/createEmp")
    public void createEmployee(@RequestBody Employee emp){
        employeeService.insertEmployee(emp);
    }

    @PutMapping(value = "/updateEmp")
    public void updateEmployee(@RequestBody Employee emp){
        employeeService.updateEmployee(emp);
    }

    @PutMapping(value = "/executeUpdateEmp")
    public void executeUpdateEmployee(@RequestBody Employee emp){
        employeeService.executeUpdateEmployee(emp);
    }

    @DeleteMapping(value = "/deleteEmpById")
    public void deleteEmployee(@RequestBody Employee emp){
        employeeService.deleteEmployee(emp);
    }
}
