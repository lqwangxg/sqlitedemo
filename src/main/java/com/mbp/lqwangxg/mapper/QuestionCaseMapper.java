package com.mbp.lqwangxg.mapper;

import com.mbp.lqwangxg.model.QuestionCase;

public interface QuestionCaseMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(QuestionCase record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(QuestionCase record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    QuestionCase selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(QuestionCase record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(QuestionCase record);
}