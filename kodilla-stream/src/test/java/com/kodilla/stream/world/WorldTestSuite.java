package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World earth = new World();
        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        final BigDecimal chinaPeople = new BigDecimal("1439858499");
        final BigDecimal northKoreaPeople = new BigDecimal("23000000");
        final BigDecimal southKoreaPeople = new BigDecimal("51780579");
        final BigDecimal polandPeople = new BigDecimal("38433000");
        final BigDecimal czechRepublicPeople = new BigDecimal("10711014");
        final BigDecimal deutschlandPeople = new BigDecimal("83811407");
        final BigDecimal egyptPeople = new BigDecimal("102334404");
        final BigDecimal algeriaPeople = new BigDecimal("43921746");
        final BigDecimal sanEscobarPeople = new BigDecimal("1");
        final BigDecimal entryPeopleSum = BigDecimal.ZERO
                .add(chinaPeople).add(northKoreaPeople).add(southKoreaPeople)
                .add(polandPeople).add(czechRepublicPeople).add(deutschlandPeople)
                .add(egyptPeople).add(algeriaPeople).add(sanEscobarPeople);
        asia.addCountry("China", chinaPeople);
        asia.addCountry("North Korea", northKoreaPeople);
        asia.addCountry("South Korea", southKoreaPeople);
        europe.addCountry("Poland", polandPeople);
        europe.addCountry("Czech Republic", czechRepublicPeople);
        europe.addCountry("Deutschland", deutschlandPeople);
        africa.addCountry("Egypt", egyptPeople);
        africa.addCountry("Algeria", algeriaPeople);
        africa.addCountry("San Escobar", sanEscobarPeople);
        earth.addContinent(asia);
        earth.addContinent(europe);
        earth.addContinent(africa);
        //When
        BigDecimal totalPeople = earth.getContinentList().stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(PeopleCounter::getPeopleQuantity).reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        //Then
        Assertions.assertEquals(entryPeopleSum, totalPeople);
    }
}