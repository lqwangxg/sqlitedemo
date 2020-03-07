package com.mbp.lqwangxg.mapper;

import com.mbp.lqwangxg.model.Company;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompanyMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Company record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Company record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Company selectByPrimaryKey(Integer id);

    List<Company> selectAll();

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Company record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Company record);
}