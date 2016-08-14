package org.alzv.testtask.hrms.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "departments")
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="dept_no")
    private String id;

    @Column(name = "dept_name")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
