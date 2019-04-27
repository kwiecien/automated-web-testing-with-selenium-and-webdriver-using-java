package com.kk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDuckDuckGo {
    public static void main(String[] args) {
        WebDriver driver = getWebDriver();
        DuckDuckGo duckDuckGo = new DuckDuckGo(driver);
        duckDuckGo.test();
    }

    private static WebDriver getWebDriver() {
        System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
        return new ChromeDriver();
    }
}
