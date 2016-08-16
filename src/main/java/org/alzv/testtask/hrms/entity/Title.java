package org.alzv.testtask.hrms.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name= "titles")
@IdClass(TitlePK.class)
public class Title {

    @Id
    @Column(name="emp_no")
    private int employeeId;

    @Id
    @Column(name="title")
    private String title;

    @Id
    @Column(name="from_date")
    private Date fromDate;

    @Column(name="to_date")
    private Date toDate;

    public Title() {
    }

    public Title(int employeeId, String title, Date fromDate, Date toDate) {
        this.employeeId = employeeId;
        this.title = title;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
