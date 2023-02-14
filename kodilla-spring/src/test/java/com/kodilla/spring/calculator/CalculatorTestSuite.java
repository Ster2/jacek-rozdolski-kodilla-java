package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        Calculator calc = context.getBean(Calculator.class);

        //When
        Double sum = calc.add(1.5, 2.5);
        Double diff = calc.sub(3.5, 2.5);
        Double prod = calc.mul(3, 4);
        Double quot = calc.div(15, 3);

        //Then
        Assert.assertTrue(sum == 4);
        Assert.assertTrue(diff == 1);
        Assert.assertTrue(prod == 12);
        Assert.assertTrue(quot == 5);

    }
}
