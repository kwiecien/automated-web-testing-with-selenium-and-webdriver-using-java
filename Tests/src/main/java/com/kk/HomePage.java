package com.kk;

class HomePage {
    private static final String url = "https://duckduckgo.com/";
    private static final String title = "DuckDuckGo";

    void goTo() {
        Browser.goTo(url);
    }

    boolean isAt() {
        return Browser.title().startsWith(title);
    }
}
