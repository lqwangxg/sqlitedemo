package com.mbp.lqwangxg.model;

import lombok.ToString;

/**
 * Table: COMPANY
 */
@ToString
public class Company {
    /**
     * Column: IDX
     */
    private Integer idx;

    /**
     * Column: ID
     */
    private String id;

    /**
     * Column: NAME
     */
    private String name;

    /**
     * Column: AGE
     */
    private Integer age;

    /**
     * Column: ADDRESS
     */
    private String address;

    /**
     * Column: SALARY
     */
    private Double salary;

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}