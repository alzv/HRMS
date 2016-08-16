package org.alzv.testtask.hrms.service;

import org.alzv.testtask.hrms.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
}
