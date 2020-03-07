package com.mbp.lqwangxg.mapper;

import com.mbp.lqwangxg.model.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Department record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Department record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Department selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Department record);
}