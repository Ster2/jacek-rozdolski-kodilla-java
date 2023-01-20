
package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> finalList = new ArrayList<Integer>();
        if (numbers.isEmpty()) {
            return numbers;
        } else {
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    finalList.add(number);
                }
            }
            return finalList;
        }
    }
}