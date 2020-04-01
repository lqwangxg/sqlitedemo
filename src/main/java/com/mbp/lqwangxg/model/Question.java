package com.mbp.lqwangxg.model;

import lombok.ToString;

/**
 * Table: QUESTION
 */
@ToString
public class Question {
    /**
     * Column: ID
     */
    private Integer id;

    /**
     * Column: TITLE
     */
    private String title;

    /**
     * Column: SUBJECT_ID
     */
    private Integer subjectId;

    /**
     * Column: TYPE
     */
    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}