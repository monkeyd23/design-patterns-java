package com.imran.dp.structural.bridge;

public abstract class WebApplication {

    Theme theme;

    WebApplication(Theme theme) {
        this.theme = theme;
    }

    public abstract void render();
}
