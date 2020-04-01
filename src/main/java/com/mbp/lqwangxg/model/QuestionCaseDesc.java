package com.mbp.lqwangxg.model;

import lombok.ToString;

/**
 * Table: QUESTION_CASE_DESC
 */
@ToString
public class QuestionCaseDesc {
    /**
     * Column: ID
     */
    private Integer id;

    /**
     * Column: QID
     */
    private Integer qid;

    /**
     * Column: CID
     */
    private Integer cid;

    /**
     * Column: DESC
     */
    private String desc;

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

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}