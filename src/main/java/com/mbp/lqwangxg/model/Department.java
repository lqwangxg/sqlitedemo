package com.mbp.lqwangxg.model;

/**
 * Table: DEPARTMENT
 */
public class Department {
    /**
     * Column: ID
     */
    private Integer id;

    /**
     * Column: DEPT
     */
    private String dept;

    /**
     * Column: EMP_ID
     */
    private Integer empId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
}