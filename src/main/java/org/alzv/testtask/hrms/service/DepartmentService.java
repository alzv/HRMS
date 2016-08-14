package org.alzv.testtask.hrms.service;

import org.alzv.testtask.hrms.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(String id);
}
