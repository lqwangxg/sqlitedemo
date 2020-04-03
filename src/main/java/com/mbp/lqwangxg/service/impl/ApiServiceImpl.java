/*
package com.mbp.lqwangxg.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

*/
/**
 * 业务处理service接口实现类
 *
 * @author lance
 **//*

@Slf4j
@Service
public class ApiServiceImpl implements ApiService
{
    @Autowired
    private ApiDao apiDao;

    */
/**
     * 获取信息
     *
     * @param key 唯一标识
     * @return 返回信息
     *//*

    @Override
    public JsonResult getInfoByKey(String key)
    {
        SampleModel chargeModel = apiDao.getTestInfoByKey(key);
        String failedMsg = chargeModel.validateResult();
        if (StringUtils.isEmpty(failedMsg))
        {
            return new JsonResult(true, "成功获取欠费信息", chargeModel);
        }
        else
        {
            return new JsonResult(false, failedMsg, ResponseCode.D0001);
        }
    }
}
*/
