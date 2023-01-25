package com.kodilla.stream.world;

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
}