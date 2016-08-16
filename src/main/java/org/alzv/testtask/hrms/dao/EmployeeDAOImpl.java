package org.alzv.testtask.hrms.dao;

import org.alzv.testtask.hrms.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public List<Employee> getAllEmployees() {
        hibernateTemplate.setMaxResults(100);
        List<Employee> employees =  hibernateTemplate.loadAll(Employee.class);
        hibernateTemplate.setMaxResults(0);
        return employees;
    }

    public Employee getEmployeeById(int id) {
        return hibernateTemplate.get(Employee.class, id);
    }
}
