/*=========================================================
 * タイトル： ◎◎◎クラス
 * 説明    ： 自動作成
 * 著作権  ： Copyright(c) 2020
 * 会社名  ： 株式会社
 *
 * 変更履歴： 2020.03.05 新規登録  MBP-SMARTEC 王小広
 *
 *=========================================================*/
package com.mbp.lqwangxg.service;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Slf4j
@Service
public class WebDriverService {
    private static ChromeDriverService service;
    private WebDriver driver;

    public static void createAndStartService() throws IOException {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("/path/to/chromedriver"))
                .usingAnyFreePort()
                .build();
        service.start();
    }

    public static void stopService() {
        service.stop();
    }

    public void createDriver() {
        driver = new RemoteWebDriver(service.getUrl(), new ChromeOptions());
    }

    public void quitDriver() {
        driver.quit();
    }

    public void testGoogleSearch() {
        driver.get("http://www.google.com");
        // rest of the test...
    }
}
