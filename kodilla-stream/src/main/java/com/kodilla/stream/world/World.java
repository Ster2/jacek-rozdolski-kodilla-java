package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent newContinent) {
        this.continents.add(newContinent);
    }

    //gettery
    public List<Continent> getContinents() {
        return continents;
    }

    public List<Continent> getContinentList() {
        return continents;
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(c -> c.getCountryList().stream())
                .map(cnt -> cnt.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, delta) -> sum.add(delta));

    }
}