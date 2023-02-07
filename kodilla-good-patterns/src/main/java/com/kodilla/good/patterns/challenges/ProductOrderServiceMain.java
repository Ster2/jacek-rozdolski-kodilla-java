package com.kodilla.good.patterns.challenges;

public class ProductOrderServiceMain {
    public static void main(String[] args) {
        User user = new User("Monica", "White", "505-062-398");
        OrderRequest orderRequest = new OrderRequest(user, "Sherlock Holmes Adventure");

        ProductOrderService productOrderService = new ProductOrderService(new SmsService(), new BookOrderService(), new BookOrderRepository());
        productOrderService.process(orderRequest);
    }
}