package com.kk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://duckduckgo.com/");
    }
}
