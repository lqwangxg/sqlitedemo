package com.mbp.lqwangxg.mapper;

import com.mbp.lqwangxg.model.QuestionImage;

public interface QuestionImageMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(QuestionImage record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(QuestionImage record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    QuestionImage selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(QuestionImage record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(QuestionImage record);
}