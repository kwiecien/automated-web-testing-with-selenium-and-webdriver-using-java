package com.kk;

import org.openqa.selenium.By;

class AboutPage {
    private static final String url = "https://www.seleniumhq.org/about";
    private static final String news = "Selenium News";

    void goTo() {
        Browser.goTo(url);
    }

    void goToNews() {
        // exported from Selenium IDE
        Browser.driver.findElement(By.xpath("//div[@id='mainContent']/h3/a")).click();
    }

    boolean isAtNews() {
        return Browser.title().equals(news);
    }
}
