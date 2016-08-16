package org.alzv.testtask.hrms.controller.rest;

import org.alzv.testtask.hrms.entity.Employee;
import org.alzv.testtask.hrms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
    public Employee getDepartmentById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }
}
