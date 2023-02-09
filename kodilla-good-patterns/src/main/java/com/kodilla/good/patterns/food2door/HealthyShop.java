package com.kodilla.good.patterns.Food2Door;

public class HealthyShop implements Shop {
    @Override
    public void process(Deliverer deliverer) {
        System.out.println(deliverer.getName() + " accepts your order: "
                + deliverer.getProductType() + " - " + deliverer.getProductAmount() + " item(s)");
    }
}