package com.mbp.lqwangxg.mapper;

import com.mbp.lqwangxg.model.Question;

public interface QuestionMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Question record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Question record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Question selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Question record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Question record);
}