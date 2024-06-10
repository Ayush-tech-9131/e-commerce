package com.restapi.service.impl;

import com.restapi.entity.Employee;
import com.restapi.repository.EmployeeRepository;
import com.restapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {
        List<Employee> list = (List<Employee>)this.employeeRepository.findAll();
        return list;
    }

    @Override
    public Employee getEmployeeById(int employee_id) {
        Employee employee = null;
        employee = this.employeeRepository.findById(employee_id);
        return employee;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        Employee employee1 = employeeRepository.save(employee);
        return employee1;
    }


    @Override
    public Employee updateEmployee(Employee employee, int employee_id) {
        employeeRepository.save(employee);
        return employee;
    }
}

