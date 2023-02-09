package com.kodilla.good.patterns.Food2Door;

public class GlutenFreeShop implements Shop {
    @Override
    public void process(Deliverer deliverer) {
        System.out.println("Thank You! Your order (" + deliverer.getProductType() + " - " + deliverer.getProductAmount()
                + " item(s)) is preparing to deliver. " + deliverer.getName());
    }
}