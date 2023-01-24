package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text", PoemBeautifier::addABC);
        poemBeautifier.beautify("text", PoemBeautifier::upperText);
        poemBeautifier.beautify("Text", PoemBeautifier::firstTwo);
        poemBeautifier.beautify("Text", PoemBeautifier::spaceBetween);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}