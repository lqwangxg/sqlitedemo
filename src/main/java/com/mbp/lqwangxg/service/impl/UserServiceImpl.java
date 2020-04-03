/*
package com.mbp.lqwangxg.service.impl;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService
{
    @Override
    public JsonResult addOrEditUser(String userid, String username, String password) throws Exception
    {
        return new JsonResult(true, "操作成功", new UserInfoModel(userid, username, password));
    }

    @Override
    public JsonResult removeUser(String userid) throws Exception
    {
        return new JsonResult(true, "操作成功");
    }

    @Override
    public JsonResult getUserInfo(String userid) throws Exception
    {
        return new JsonResult(true, "操作成功", new UserInfoModel().setUserid(userid).setUsername("hhaa").setPassword("ssss"));
    }

    @Override
    public JsonResult listUsers() throws Exception
    {
        List<UserInfoModel> list = new ArrayList<>();
        list.add(new UserInfoModel("1", "一", "1"));
        list.add(new UserInfoModel("2", "二", "2"));
        list.add(new UserInfoModel("3", "三", "3"));
        return new JsonResult(true, "操作成功", list);
    }
}
*/
