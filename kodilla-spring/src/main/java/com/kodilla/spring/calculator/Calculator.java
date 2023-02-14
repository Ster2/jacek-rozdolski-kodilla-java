package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private final Display display;

    @Autowired
    public Calculator(final Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double sum = a + b;
        display.displayValue(sum);
        return sum;
    }

    public double sub(double a, double b) {
        double diff = a - b;
        display.displayValue(diff);
        return diff;
    }

    public double mul(double a, double b) {
        double prod = a * b;
        display.displayValue(prod);
        return prod;
    }

    public double div(double a, double b) {
        double quot = a / b;
        display.displayValue(quot);
        return quot;
    }

}