package com.kodilla.good.patterns.Food2Door;

public class OrderingProcessMain {
    public static void main(String[] args) {
        Shop shop = new ExtraFoodShop();

        Customer annGreenwood = new Customer("Ann", "Greenwood", "731-755-920", "Long Island 12/3");
        Deliverer deliverer = new Deliverer("Extra Food Shop", "milk", 2.5);
        OrderRequest orderRequest = new OrderRequest(annGreenwood, deliverer.getProductType(), true);

        OrderingProcess orderingProcess = new OrderingProcess(shop, deliverer);
        orderingProcess.order(orderRequest);
    }
}