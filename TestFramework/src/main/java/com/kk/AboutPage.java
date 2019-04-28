package com.kk;

abstract class AboutPage {
    abstract void goTo();
    abstract String section();

    boolean isAtSection(String section) {
        return section().equals(section);
    }
}
