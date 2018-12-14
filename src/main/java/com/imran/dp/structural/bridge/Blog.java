package com.imran.dp.structural.bridge;

public class Blog extends WebApplication {

    public Blog(Theme theme) {
        super(theme);
    }

    @Override
    public void render() {
        System.out.println("Rendering Blog Elements...");
        theme.render();
    }
}
