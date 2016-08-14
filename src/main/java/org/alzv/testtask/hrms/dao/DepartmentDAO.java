package org.alzv.testtask.hrms.dao;

import org.alzv.testtask.hrms.entity.Department;

import java.util.List;

public interface DepartmentDAO {
    List<Department> getAllDepartments();
    Department getDepartmentById(String id);
}
