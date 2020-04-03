package com.mbp.lqwangxg.controller;


import com.mbp.lqwangxg.model.base.ApiResult;
import com.mbp.lqwangxg.model.base.JsonResult;
import com.mbp.lqwangxg.service.UserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;


@Slf4j
@Api("API")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@Controller
@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping(name = "login", value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public ApiResult login(HttpServletRequest request, HttpServletResponse response, @RequestHeader(required=false, value="User-Agent") String agent){
        String username = "";
        String password = "";
        log.debug("request:{}",request);
        log.debug("response:{}",response);

        log.debug("login.username:{},password:{},params:{}",username, password, agent);
        //User user = userService.getUser(userid,password);
        Map<String,String> data = new HashMap<>();
        data.put("token", "admin-token");
        return new ApiResult(20000, data);
        /*if(user != null){
            return new JsonResult(true, "welcome back.");
        }else{
            return new JsonResult(false, "Error: UserID or Password is not exists.");
        }*/
    }

    @RequestMapping(name = "获取用户信息", value = "/getUserInfo", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult getUserInfo(String userid) throws Exception
    {
        //User user =  userService.getUser(userid,"");
        return new JsonResult(true, "OK", "admintoken");
    }

    @RequestMapping(name = "添加或编辑用户", value = "/addOrEdit", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult add(String userid, String username, String password) throws Exception
    {
        //return userService.addOrEditUser(userid, username, password);
        return new JsonResult(true, "OK", "admintoken");
    }

    @RequestMapping(name = "用户列表", value = "/listUsers", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult list() throws Exception
    {
        //return userService.listUsers();
        return new JsonResult(true, "OK","admintoken");
    }

    @RequestMapping(name = "删除用户", value = "/delUser", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult del(String userid) throws Exception
    {
        //return userService.removeUser(userid);
        return new JsonResult(true, "OK","admintoken");
    }
}
