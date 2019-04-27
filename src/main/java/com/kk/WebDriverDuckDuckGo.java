package com.kk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverDuckDuckGo {
    public static void main(String[] args) throws Exception {
        WebDriver driver = getWebDriver();
        driver.get("https://duckduckgo.com/");

        WebElement searchField = driver.findElement(By.id("search_form_input_homepage"));
        searchField.sendKeys("selenium");
        searchField.submit();

        WebElement imagesLink = driver.findElement(By.linkText("Images"));
        imagesLink.click();

        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, WebDriverWait.DEFAULT_SLEEP_TIMEOUT);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.tile--img__media")));
        WebElement imageElement = driver.findElements(By.cssSelector("div.tile--img__media")).get(0);
        imageElement.click();

        WebElement imageLink = driver.findElements(By.className("detail__media")).get(0).findElement(By.tagName("a"));
        imageLink.click();

        assert driver.getCurrentUrl().contains("SeBlackRed.jpg");
    }

    private static WebDriver getWebDriver() throws MalformedURLException {
        return new RemoteWebDriver(
                new URL("http://localhost:4444/wd/hub"),
                DesiredCapabilities.chrome());
    }
}
