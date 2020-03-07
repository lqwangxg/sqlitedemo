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

import com.mbp.lqwangxg.mapper.CompanyMapper;
import com.mbp.lqwangxg.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DemoController {

    @Autowired
    private CompanyMapper companyMapper;

    @GetMapping("/demo")
    public ModelAndView demo() {
        // map to demo.jsp
        ModelAndView mv = new ModelAndView("demo");
        mv.addObject("value", "hello lqwangxg");
        return mv;
    }
    @GetMapping("/demos")
    @ResponseBody
    public List<Company> demos() {
        return companyMapper.selectAll();
    }


}
