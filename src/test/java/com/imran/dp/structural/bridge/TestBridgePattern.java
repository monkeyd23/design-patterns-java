package com.imran.dp.structural.bridge;

import org.junit.Test;

public class TestBridgePattern {

    @Test
    public void testWebApplication() {
        LightTheme lightTheme = new LightTheme();
        DarkTheme darkTheme = new DarkTheme();

        // render blog
        WebApplication webApplication = new Blog(darkTheme);
        webApplication.render();

        // render blog
        webApplication = new OnlineStore(lightTheme);
        webApplication.render();

        // render blog
        webApplication = new NewsWebsite(lightTheme);
        webApplication.render();


    }
}
