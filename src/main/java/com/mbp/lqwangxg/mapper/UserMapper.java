package com.mbp.lqwangxg.mapper;

import com.mbp.lqwangxg.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(User record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(User record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    User selectByPrimaryKey(Integer id);

    User getUser(@Param("id")String id, @Param("pass")String pass);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(User record);
}