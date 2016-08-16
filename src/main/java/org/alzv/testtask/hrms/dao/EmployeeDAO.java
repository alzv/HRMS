package org.alzv.testtask.hrms.dao;

import org.alzv.testtask.hrms.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
}
