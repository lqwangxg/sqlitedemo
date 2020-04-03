package com.mbp.lqwangxg.model.base;

/**
 * 返回信息
 *
 * @author lance
 **/
public enum ResponseCode
{
    /**
     * 系统异常
     */
    D0000("D0000", "系统异常", "请联系管理员"),
    /**
     * 不允许执行
     */
    D0001("D0001", "不允许执行", "请联系管理员"),
    /**
     * 业务执行中
     */
    D8888("D8888", "请求成功", ""),
    /**
     * 请求成功
     */
    D9999("D9999", "请求成功", "");

    private String comment;
    private String key;
    private String value;

    ResponseCode(String key, String value, String comment)
    {
        this.key = key;
        this.value = value;
        this.comment = comment;
    }


    public String getComment()
    {
        return comment;
    }


    public String getKey()
    {
        return key;
    }

    public String getValue()
    {
        return value;
    }
}
