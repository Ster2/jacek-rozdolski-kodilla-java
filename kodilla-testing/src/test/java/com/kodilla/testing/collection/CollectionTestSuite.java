package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTestSuite {

    @DisplayName ("Testing when list is empty.")

    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList=new ArrayList<Integer>();
        //When
        ArrayList<Integer> listNumbers=OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing"+listNumbers);
        //Then
        Assert.assertEquals(emptyList,listNumbers);
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
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(234,567,22,899,12,15,3,5));
        ArrayList<Integer> oddList=new ArrayList<Integer>(Arrays.asList(234,22,12));

        //When
        ArrayList<Integer> listNumbers=OddNumbersExterminator.exterminate(list);
        System.out.println("Testing"+listNumbers);
        //Then
        Assert.assertEquals(oddList,listNumbers);
    }

}