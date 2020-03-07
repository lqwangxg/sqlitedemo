/*=========================================================
 * タイトル： ◎◎◎クラス
 * 説明    ： 自動作成
 * 著作権  ： Copyright(c) 2020
 * 会社名  ： 株式会社
 *
 * 変更履歴： 2020.03.05 新規登録  MBP-SMARTEC 王小広
 *
 *=========================================================*/
package com.mbp.lqwangxg;

import com.mbp.lqwangxg.service.WebDriverService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MockTests {
    @Autowired
    private WebDriverService webDriverService;

    @Test
    public void exampleTest() {
        Assertions.assertEquals(1,1);
    }
}
