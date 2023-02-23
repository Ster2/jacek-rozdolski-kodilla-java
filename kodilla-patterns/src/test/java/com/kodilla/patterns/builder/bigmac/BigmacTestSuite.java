package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {
    @Test
    void testBigMacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun("No sesame bun")
                .burgers(2)
                .sauce("Standard")
                .ingredient("Chilli")
                .ingredient("Cheese")
                .ingredient("Pickle")
                .ingredient("Onion")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(4, howManyIngredients);
    }
}