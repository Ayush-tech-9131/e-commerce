package com.restapi.service;

import com.restapi.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public List<Employee> getEmployees();
    public Employee getEmployeeById(int employee_id);
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(Employee employee, int employee_id);

}
