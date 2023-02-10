package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SearchingFlights {
    public static List<Flight> flightsFromCity(City departureCity) {
        return FlightsRepository.getFlightsSet().stream()
                .filter(flight -> flight.getDepartureCity() == departureCity)
                .collect(Collectors.toList());
    }

    public static List<Flight> flightsToCity(City arrivalCity) {
        return FlightsRepository.getFlightsSet().stream()
                .filter(flight -> flight.getArrivalCity() == arrivalCity)
                .collect(Collectors.toList());
    }

    public static List<Flight> flightsWithTransfer (City departureCity, City transferCity, City arrivalCity) {
        Flight firstStep = new Flight(departureCity, transferCity);
        Flight secondStep = new Flight(transferCity, arrivalCity);
        List<Flight> allSteps = new ArrayList<>();

        if(FlightsRepository.getFlightsSet().contains(firstStep) && FlightsRepository.getFlightsSet().contains(secondStep)) {
            allSteps.add(firstStep);
            allSteps.add(secondStep);
        }
        return allSteps;
    }

    public static List<List<Flight>> flightFromCityToCityWithTransfer(City departureCity, City arrivalCity) {
        List<City> cityNames = Stream.of(City.values())
                .collect(Collectors.toList());
        List<Flight> flightsFromCity = flightsFromCity(departureCity);
        List<Flight> flightsToCity = flightsToCity(arrivalCity);

        Flight directly = new Flight(departureCity, arrivalCity);
        List<Flight> list = new ArrayList<>();
        list.add(directly);

        List<List<Flight>> connections = new ArrayList<>();

        if(FlightsRepository.getFlightsSet().contains(directly)) {
            connections.add(list);
        }

        for(City city : cityNames) {
            Flight firstStep = new Flight(departureCity, city);
            Flight secondStep = new Flight(city, arrivalCity);
            List<Flight> allSteps = new ArrayList<>();
            allSteps.add(firstStep);
            allSteps.add(secondStep);

            if(flightsFromCity.contains(firstStep) && flightsToCity.contains(secondStep)) {
                connections.add(allSteps);
            }
        }
        return connections;
    }
}