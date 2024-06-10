package com.restapi.controller;

import com.restapi.entity.Employee;
import com.restapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return this.employeeService.getEmployees();

    }
    @GetMapping("/employees/{employee_id}")
    public Employee getEmployeeById(@PathVariable int employee_id){
        return this.employeeService.getEmployeeById(employee_id);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return this.employeeService.addEmployee(employee);

    }

    @PutMapping("/employees/{employee_id}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("employee_id") int employee_id){
        this.employeeService.updateEmployee(employee,employee_id);
        return employee;
    }

}
