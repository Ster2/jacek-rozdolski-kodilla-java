package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @DisplayName ("Testing when list is empty.")

    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        Integer list[]= new Integer[] {};
        List<Integer> emptyList = Arrays.asList(list);

        OddNumbersExterminator oddNumbersExterminatorList = new OddNumbersExterminator(emptyList);

        //When
        List<Integer> testList = oddNumbersExterminatorList.exterminate(emptyList);

        //Then
        Assertions.assertEquals(0 ,testList.size());
    }


    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @DisplayName ("Testing when numbers are even and odd.")

    @Test
    void testOddNumbersExterminatorNormalList (){
        //Given
        Integer list[]= new Integer[] {1, 2, 3, 4, 5};
        List<Integer> normalList = Arrays.asList(list);
        Integer list2[]= new Integer[] {2, 4};
        List<Integer> expectedList = Arrays.asList(list2);

        OddNumbersExterminator oddNumbersExterminatorList = new OddNumbersExterminator(normalList);

        //When
        List<Integer> testList = oddNumbersExterminatorList.exterminate(normalList);

        //Then
        Assertions.assertEquals(2, testList.size());
        Assertions.assertEquals(expectedList, testList);
    }

}