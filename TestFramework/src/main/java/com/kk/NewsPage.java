package com.kk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

class NewsPage extends AboutPage {

    @FindBy(how = How.CSS, using = "#mainContent > h2")
    private WebElement title;

    @Override
    void goTo() {
        // exported from Selenium IDE
        Browser.driver.findElement(By.xpath("//div[@id='mainContent']/h3/a")).click();
    }

    @Override
    String section() {
        return title.getText();
    }
}
