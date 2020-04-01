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
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@Slf4j
@ExtendWith(SpringExtension.class)
public class MockTests {
    @Autowired
    private WebDriverService webDriverService;

    @BeforeAll
    public static void testBeforeClass() {
        log.info("before class init.===============");
    }
    @AfterAll
    public static void testAfterClass() {
        log.info("after class end===============");
    }

    @BeforeEach
    public void testBefore() {
        log.info("before===============");
    }

    @AfterEach
    public void testAfter() {
        log.info("after===============");
    }

    @DisplayName("自動テスト")
    @Test
    public void webdriver() throws Exception {
        webDriverService.createAndStartService();
        webDriverService.createDriver();

        webDriverService.quitDriver();
        webDriverService.stopService();
    }

}
