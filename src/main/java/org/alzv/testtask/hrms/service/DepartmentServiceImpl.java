package org.alzv.testtask.hrms.service;

import org.alzv.testtask.hrms.dao.DepartmentDAO;
import org.alzv.testtask.hrms.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    @Autowired
    DepartmentDAO dao;

    public List<Department> getAllDepartments() {
        return dao.getAllDepartments();
    }

    public Department getDepartmentById(String id) {
        return dao.getDepartmentById(id);
    }
}
