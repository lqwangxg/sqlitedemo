package com.mbp.lqwangxg.model;

/**
 * Table: USER
 */
public class User {
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
     * Column: PASS
     */
    private String pass;

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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass == null ? null : pass.trim();
    }
}