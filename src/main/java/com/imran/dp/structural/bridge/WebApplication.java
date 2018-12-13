package com.imran.dp.structural.bridge;

abstract class WebApplication {

    Theme theme;

    WebApplication(Theme theme) {
        this.theme = theme;
    }

    abstract void render();
}
