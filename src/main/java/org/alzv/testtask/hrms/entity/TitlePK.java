package org.alzv.testtask.hrms.entity;

import java.io.Serializable;
import java.sql.Date;

public class TitlePK implements Serializable {

    private static final long serialVersionUID = 1L;

    protected int employeeId;

    protected String title;

    protected Date fromDate;

    public TitlePK() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TitlePK titlePK = (TitlePK) o;

        if (employeeId != titlePK.employeeId) return false;
        if (!title.equals(titlePK.title)) return false;
        return fromDate.equals(titlePK.fromDate);

    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + title.hashCode();
        result = 31 * result + fromDate.hashCode();
        return result;
    }
}
