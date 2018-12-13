package com.imran.dp.structural.bridge;

public class OnlineStore extends WebApplication {

    OnlineStore(Theme theme) {
        super(theme);
    }

    @Override
    public void render() {
        System.out.println("Rendering Online Store Elements...");
        theme.render();
    }
}
