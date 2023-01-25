package com.kodilla.stream.world;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String name;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(String name) {
        this.name = name;
    }

    public void addCountry(String name, BigDecimal peopleQuantity) {
        Country newCountry = new Country(name, peopleQuantity);
        this.countryList.add(newCountry);
    }

    //gettery
    public List<Country> getCountryList() {
        return this.countryList;
    }
}