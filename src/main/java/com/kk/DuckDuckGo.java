package com.kk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class DuckDuckGo {
    private final WebDriver driver;
    private static final String address = "https://duckduckgo.com/";
    private static final String imageSelector = "div.tile--img__media";

    DuckDuckGo(WebDriver webDriver) {
        driver = webDriver;
    }

    void test() {
        driver.get(address);
        WebDriverWait wait = new WebDriverWait(driver, WebDriverWait.DEFAULT_SLEEP_TIMEOUT);

        WebElement searchField = driver.findElement(By.id("search_form_input_homepage"));
        searchField.sendKeys("selenium");
        searchField.submit();

        WebElement imagesLink = driver.findElement(By.linkText("Images"));
        imagesLink.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(imageSelector)));
        WebElement imageElement = driver.findElements(By.cssSelector(imageSelector)).get(0);
        imageElement.click();

        WebElement imageLink = driver.findElements(By.className("detail__media")).get(0).findElement(By.tagName("a"));
        imageLink.click();

        assert driver.getCurrentUrl().contains("SeBlackRed.jpg");
    }
}
