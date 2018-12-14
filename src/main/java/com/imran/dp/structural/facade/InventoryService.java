package com.imran.dp.structural.facade;

class InventoryService {

    static boolean isProductAvailable(Product product) {
        System.out.println("Searching for " + product.getSKU());
        return true;
    }
}
