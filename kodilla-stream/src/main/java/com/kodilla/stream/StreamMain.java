package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text", PoemBeautifier::addABC);
        poemBeautifier.beautify("text", PoemBeautifier::upperText);
        poemBeautifier.beautify("Text", PoemBeautifier::firstTwo);
        poemBeautifier.beautify("Text", PoemBeautifier::spaceBetween);
    }
}