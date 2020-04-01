package com.mbp.lqwangxg.model;

import lombok.ToString;

/**
 * Table: QUESTION_CASE
 */
@ToString
public class QuestionCase {
    /**
     * Column: ID
     */
    private Integer id;

    /**
     * Column: QID
     */
    private Integer qid;

    /**
     * Column: CASETEXT
     */
    private String casetext;

    /**
     * Column: FLAG
     */
    private Integer flag;

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

    public String getCasetext() {
        return casetext;
    }

    public void setCasetext(String casetext) {
        this.casetext = casetext == null ? null : casetext.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}