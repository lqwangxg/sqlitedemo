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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.core.env.Environment;

import java.io.File;
import java.io.IOException;


@Slf4j
@Service
public class WebDriverService {
    private ChromeDriverService service;
    private WebDriver driver;

    @Autowired
    Environment env;
    public WebDriver getDriver(){
        return driver;
    }
    public void createAndStartService() throws IOException {
        String driverPath = env.getProperty("webdriver.path");
        log.debug("driverPath:{}", driverPath);
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File(driverPath))
                .usingAnyFreePort()
                .build();
        service.start();
    }

    public void stopService() {
        service.stop();
    }

    public void createDriver() {
        driver = new RemoteWebDriver(service.getUrl(), new ChromeOptions());
    }

    public void quitDriver() {
        driver.quit();
    }

    public void open(String Url) {
        driver.get(Url);
        // rest of the test...
    }
}
