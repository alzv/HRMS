package org.alzv.testtask.hrms.controller.rest;

import org.alzv.testtask.hrms.entity.Department;
import org.alzv.testtask.hrms.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "/departments", method = RequestMethod.GET)
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @RequestMapping(value = "/departments/{id}", method = RequestMethod.GET)
    public Department getDepartmentById(@PathVariable String id) {
        return departmentService.getDepartmentById(id);
    }
}
