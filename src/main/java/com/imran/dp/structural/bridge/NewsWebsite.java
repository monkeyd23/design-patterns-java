package com.imran.dp.structural.bridge;

public class NewsWebsite extends WebApplication {

    NewsWebsite(Theme theme) {
        super(theme);
    }

    @Override
    public void render() {
        System.out.println("Rendering News Website Elements...");
        theme.render();
    }
}
