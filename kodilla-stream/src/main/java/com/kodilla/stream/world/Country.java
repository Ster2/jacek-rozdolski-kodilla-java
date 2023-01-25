package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country implements PeopleCounter {
    private final String name;
    private final BigDecimal peopleQuantity;

    //konstruktor
    public Country(String name, BigDecimal peopleQuantity) {
        this.name = name;
        this.peopleQuantity = peopleQuantity;
    }

    //getter
    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}