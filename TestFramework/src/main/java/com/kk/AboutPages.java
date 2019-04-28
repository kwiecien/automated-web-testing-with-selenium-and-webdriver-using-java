package com.kk;

class AboutPages {
    private static final String url = "https://www.seleniumhq.org/about";

    void goTo() {
        Browser.goTo(url);
    }

    AboutPage getAboutPage(String page) {
        if ("News".equals(page)) {
            return Pages.newsPage();
        }
        return null;
    }
}
