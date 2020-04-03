package com.mbp.lqwangxg.model.base;


/**
 * 返回的基本Model对象
 *
 * @author lance
 */
public class ResultCommunication
{
    private static ResultCommunication resultCommunication = null;

    /**
     * 获取实例
     *
     * @return
     */
    public static ResultCommunication getInstance()
    {
        if (resultCommunication == null)
        {
            resultCommunication = new ResultCommunication();
        }
        return resultCommunication;
    }

    /**
     * 获取成功基础Model对象
     *
     * @return
     */
    public ApiResult getSuccessModel()
    {
        ApiResult resp = new ApiResult();
        resp.setCode(20000);
        return resp;
    }

    /**
     * 获取执行中的Model对象
     *
     * @return
     */
    public ApiResult getExecutingModel()
    {
        ApiResult resp = new ApiResult();
        resp.setCode(20000);
        return resp;
    }

    /**
     * 获取成功基础Model对象
     *
     * @return
     */
    public ApiResult getSuccessModel(Object data)
    {
        ApiResult resp = new ApiResult();
        resp.setCode(20000);
        resp.setData(data);
        return resp;
    }

    /**
     * 获取异常基础Model对象
     *
     * @return
     */
    public ApiResult getErrorModel()
    {
        ApiResult resp = new ApiResult();
        resp.setCode(20000);
        return resp;
    }

    /**
     * 获取失败基础Model对象
     *
     * @return
     */
    public ApiResult getFailedModel(String rtnCode, String rtnMsg)
    {
        ApiResult resp = new ApiResult();
        resp.setCode(20000);
        return resp;
    }

    /**
     * 获取失败基础Model对象
     *
     * @return
     */
    public ApiResult getFailedModel(ResponseCode responseCode)
    {
        ApiResult resp = new ApiResult();
        resp.setCode(20000);
        return resp;
    }
}
