package com.imran.dp.structural.facade;

class Product {

    private String SKU;

    Product(String SKU) {
        this.SKU = SKU;
    }

    String getSKU() {
        return SKU;
    }
}
