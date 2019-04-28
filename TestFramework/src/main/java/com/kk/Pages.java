package com.kk;

import org.openqa.selenium.support.PageFactory;

class Pages {

    static HomePage homePage() {
        return new HomePage();
    }

    static AboutPages aboutPages() {
        return new AboutPages();
    }

    static AboutPage newsPage() {
        AboutPage newsPage = new NewsPage();
        PageFactory.initElements(Browser.driver, newsPage); // PageObject pattern
        return newsPage;
    }
}