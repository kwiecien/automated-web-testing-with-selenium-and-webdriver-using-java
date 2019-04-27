package com.kk;

import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UnitTest {

    @AfterClass
    public static void cleanUp() {
        Browser.close();
    }

    @Test
    public void canGoToHomePage() {
        Pages.homePage().goTo();
        assertTrue(Pages.homePage().isAt());
    }

    @Test
    public void canGoToNewsPage() {
        Pages.aboutPage().goTo();
        Pages.aboutPage().goToNews();
        assertTrue(Pages.aboutPage().isAtNews());
    }
}
