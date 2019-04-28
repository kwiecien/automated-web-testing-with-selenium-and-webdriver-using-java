package com.kk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Browser {
    static WebDriver driver;
    static {
        System.setProperty("webdriver.chrome.driver", "../chromedriver.exe");
        driver = new ChromeDriver();
    }

    static void goTo(String url) {
        driver.get(url);
    }

    static String title() {
        return driver.getTitle();
    }

    static void close() {
        driver.close();
    }
}
