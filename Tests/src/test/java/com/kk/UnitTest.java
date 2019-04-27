package com.kk;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UnitTest {

    @Test
    public void canGoToHomePage() {
        Pages.homePage().goTo();
        assertTrue(Pages.homePage().isAt());
    }

}
