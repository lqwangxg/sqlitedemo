package com.mbp.lqwangxg.service;


import com.mbp.lqwangxg.model.base.JsonResult;

/**
 * 业务处理service接口
 *
 * @author lance
 **/
public interface ApiService
{
    /**
     * 获取信息
     *
     * @param key 唯一标识
     * @return 返回信息
     */
    JsonResult getInfoByKey(String key);
}
