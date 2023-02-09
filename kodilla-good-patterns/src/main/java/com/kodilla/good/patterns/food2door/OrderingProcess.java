package com.kodilla.good.patterns.Food2Door;

public class OrderingProcess {
    private Shop shop;
    private Deliverer deliverer;

    public OrderingProcess(Shop shop, Deliverer deliverer) {
        this.shop = shop;
        this.deliverer = deliverer;
    }

    public void order(OrderRequest orderRequest) {
        if(orderRequest.getConfirmation()) {
            shop.process(deliverer);
            System.out.println("Deliver the order to: " + orderRequest.getCustomer().getAdress()
                    + " In case of any problems with delivery please inform customer "
                    + orderRequest.getCustomer().toString() + " phone number " + orderRequest.getCustomer().getPhoneNum());
        }
        else {
            System.out.println("Please confirm your order and try again.");
        }
    }
}