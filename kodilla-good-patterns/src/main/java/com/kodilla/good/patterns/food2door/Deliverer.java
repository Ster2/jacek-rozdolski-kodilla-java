package com.kodilla.good.patterns.Food2Door;

public class Deliverer {
    private String name;
    private String productType;
    private Double productAmount;

    public Deliverer(String name, String productType, Double productAmount) {
        this.name = name;
        this.productType = productType;
        this.productAmount = productAmount;
    }

    public String getName() {
        return name;
    }

    public String getProductType() {
        return productType;
    }

    public Double getProductAmount() {
        return productAmount;
    }
}