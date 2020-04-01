package com.mbp.lqwangxg.model;

import lombok.ToString;

/**
 * Table: QUESTION_IMAGE
 */
@ToString
public class QuestionImage {
    /**
     * Column: ID
     */
    private Integer id;

    /**
     * Column: QID
     */
    private Integer qid;

    /**
     * Column: URI
     */
    private String uri;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }
}