package com.imran.dp.structural.facade;

public class OrderServiceImpl implements OrderServiceFacade {


    @Override
    public boolean placeOrder(String SKU) {
        Product product =  new Product(SKU);

        return InventoryService.isProductAvailable(product) &&
               PaymentService.completePayment() &&
               ShippingService.shipProduct();
    }
}
