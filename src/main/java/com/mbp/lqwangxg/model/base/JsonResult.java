package com.mbp.lqwangxg.model.base;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

/**
 * 返回json结果封装类
 *
 * @author lqwangxg
 * @since 2020-04-01
 */
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class JsonResult extends HashMap<String, Object>
{
    /**
     * 是否成功
     */
    private final String success = "success";

    /**
     * 返回信息
     */
    private final String message = "message";

    /**
     * 返回数据
     */
    private final String data = "data";
    /*
    * Token
    * */
    private final String token = "token";

    public JsonResult()
    {
        super();
        this.setSuccess(true);
    }

    public JsonResult(Object data)
    {
        super();
        this.setSuccess(true);
        this.setData(data);
    }

    public JsonResult(boolean success, String message, String token)
    {
        super();
        this.setSuccess(success);
        this.setMessage(message);
        this.setToken(token);
    }

    public JsonResult(boolean success, String message, String token, Object data)
    {
        super();
        this.setSuccess(success);
        this.setMessage(message);
        this.setToken(token);
        this.setData(data);
    }

    public boolean getSuccess()
    {
        return (Boolean) this.get(success);
    }

    public JsonResult setSuccess(boolean value)
    {
        this.put(success, value);
        return this;
    }

    public String getMessage()
    {
        return (String) this.get(message);
    }
    public String getToken()
    {
        return (String) this.get(token);
    }

    public JsonResult setToken(String value)
    {
        this.put(token, value);
        return this;
    }
    public JsonResult setMessage(String value)
    {
        this.put(message, value);
        return this;
    }

    public Object getData()
    {
        return this.get(data);
    }

    public JsonResult setData(Object value)
    {
        this.put(data, value);
        return this;
    }
}
