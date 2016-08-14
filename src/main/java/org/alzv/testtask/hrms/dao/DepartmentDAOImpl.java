package org.alzv.testtask.hrms.dao;

import org.alzv.testtask.hrms.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

import java.util.List;

@Transactional
@Repository
public class DepartmentDAOImpl implements DepartmentDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public List<Department> getAllDepartments() {
        return (List<Department>) hibernateTemplate.loadAll(Department.class);
    }

    public Department getDepartmentById(String id) {
        return hibernateTemplate.get(Department.class, id);
    }
}
