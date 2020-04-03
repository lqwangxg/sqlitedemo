/*=========================================================
 * タイトル： ◎◎◎クラス
 * 説明    ： 自動作成
 * 著作権  ： Copyright(c) 2020
 * 会社名  ： 株式会社
 *
 * 変更履歴： 2020.03.05 新規登録  MBP-SMARTEC 王小広
 *
 *=========================================================*/
package com.mbp.lqwangxg.controller;

import com.mbp.lqwangxg.model.User;
import com.mbp.lqwangxg.model.base.ApiResult;
import com.mbp.lqwangxg.model.base.JsonResult;
import com.mbp.lqwangxg.model.base.ResultCommunication;
import com.mbp.lqwangxg.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Api("API")
@Controller
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class SystemController {
    @Autowired
    UserService userService;

    /**
     * 获取测试信息
     */
    @ResponseBody
    @RequestMapping(value = "/sampleTest", method = RequestMethod.POST)
    @ApiOperation(value = "测试", notes = "根据标识获取信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "key", value = "唯一标识", required = true, dataType = "String"),
            @ApiImplicitParam(name = "extend", value = "预留", dataType = "String")})
    public ApiResult sampleTest(@RequestParam String key, @RequestParam(required = false) String extend)
    {
        log.info(extend);
       /* JsonResult result = apiService.getInfoByKey(key);
        if (result.getSuccess())
        {
            return ResultCommunication.getInstance().getSuccessModel(result.getData());
        }
        else
        {
            return ResultCommunication.getInstance().getFailedModel((ResponseCode) result.getData());
        }*/
        //JsonResult result = apiService.getInfoByKey(key);
        return null;
    }
}
