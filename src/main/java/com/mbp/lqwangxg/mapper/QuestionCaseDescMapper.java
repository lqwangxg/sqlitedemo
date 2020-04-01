package com.mbp.lqwangxg.mapper;

import com.mbp.lqwangxg.model.QuestionCaseDesc;

public interface QuestionCaseDescMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(QuestionCaseDesc record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(QuestionCaseDesc record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    QuestionCaseDesc selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(QuestionCaseDesc record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(QuestionCaseDesc record);
}