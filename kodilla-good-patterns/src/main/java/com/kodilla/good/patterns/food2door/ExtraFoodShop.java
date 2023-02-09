package com.kodilla.good.patterns.Food2Door;

public class ExtraFoodShop implements Shop {
    @Override
    public void process(Deliverer deliverer) {
        System.out.println("Order from " + deliverer.getName() + " is preparing. "
                + "This order consist of " + deliverer.getProductAmount() + " item(s) of " + deliverer.getProductType());
    }
}