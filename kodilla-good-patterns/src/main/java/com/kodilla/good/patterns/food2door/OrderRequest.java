package com.kodilla.good.patterns.Food2Door;

public class OrderRequest {
    private Customer customer;
    private String product;
    private boolean confirmation;

    public OrderRequest(Customer customer, String product, boolean confirmation) {
        this.customer = customer;
        this.product = product;
        this.confirmation = confirmation;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getProduct() {
        return product;
    }

    public boolean getConfirmation() {
        return confirmation;
    }
}