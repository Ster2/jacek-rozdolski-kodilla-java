package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test SimpleUser OK");
        } else {
            System.out.println("SimpleUser error!");
        }

        Calculator calculator = new Calculator();

        int result1 = calculator.add(5, 10);
        int result2 = calculator.subtract(5, 10);

        if (result1 == 15) {
            System.out.println("test Calculator add OK");
        } else {
            System.out.println("Calculator add error!");
        }
        if (result2 == -5) {
            System.out.println("test Calculator subtract OK");
        } else {
            System.out.println("Calculator subtract error!");
        }
    }
}