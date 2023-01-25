package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        final int[] entryNumbers = {2, 1, 3, 8, 9, 4, 4, 8, 5, 2, 8, 5, 2, 4, 9, 8, 1, 4, 7, 0};
        int sum = 0;
        for (int i:entryNumbers) {
            sum += i;
        }
        final double entryAvg = (double)sum / (double)entryNumbers.length;
        //When
        double avg = ArrayOperations.getAverage(entryNumbers);
        //Then
        Assertions.assertEquals(entryAvg, avg, 0);
    }
}