package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsRepository {
    private static Set<Flight> flightsSet = new HashSet<>();

    public static Set<Flight> getFlightsSet() {
        flightsSet.add(new Flight(City.GDANSK, City.WROCLAW));
        flightsSet.add(new Flight(City.GDANSK, City.KRAKOW));
        flightsSet.add(new Flight(City.GDANSK, City.RZESZOW));
        flightsSet.add(new Flight(City.GDANSK, City.WARSZAWA));
        flightsSet.add(new Flight(City.WROCLAW, City.GDANSK));
        flightsSet.add(new Flight(City.WROCLAW, City.SZCZECIN));
        flightsSet.add(new Flight(City.RZESZOW, City.SZCZECIN));
        flightsSet.add(new Flight(City.SZCZECIN, City.WARSZAWA));
        flightsSet.add(new Flight(City.WARSZAWA, City.WROCLAW));
        flightsSet.add(new Flight(City.WARSZAWA, City.GDANSK));
        flightsSet.add(new Flight(City.WARSZAWA, City.SZCZECIN));
        flightsSet.add(new Flight(City.WARSZAWA, City.RZESZOW));
        flightsSet.add(new Flight(City.WARSZAWA, City.KRAKOW));
        flightsSet.add(new Flight(City.KRAKOW, City.WARSZAWA));
        flightsSet.add(new Flight(City.KRAKOW, City.WROCLAW));
        flightsSet.add(new Flight(City.KRAKOW, City.GDANSK));
        flightsSet.add(new Flight(City.KRAKOW, City.SZCZECIN));
        return flightsSet;
    }
}