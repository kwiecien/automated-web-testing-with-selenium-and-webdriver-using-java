package com.kk;

class HomePage {
    private static final String url = "https://www.seleniumhq.org/";
    private static final String title = "Selenium - Web Browser Automation";

    void goTo() {
        Browser.goTo(url);
    }

    boolean isAt() {
        return Browser.title().equals(title);
    }
}
