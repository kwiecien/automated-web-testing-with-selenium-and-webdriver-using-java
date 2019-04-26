package com.kk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class DuckDuckGo {
    private final WebDriver driver;
    private static final String address = "https://duckduckgo.com/";

    DuckDuckGo(WebDriver webDriver) {
        driver = webDriver;
    }

    void test() {
        driver.get(address);
        WebElement searchField = driver.findElement(By.id("search_form_input_homepage"));
        searchField.sendKeys("selenium");
        searchField.submit();
        WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
        imagesLink.click();
    }
}
