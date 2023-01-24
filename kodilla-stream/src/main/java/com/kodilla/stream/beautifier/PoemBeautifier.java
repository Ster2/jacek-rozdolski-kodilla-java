package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(text);
        System.out.println(result);
    }

    public static String addABC(String text){
        return "ABC " + text + " ABC";
    }

    public static String upperText(String text){
        return text.toUpperCase();
    }

    public static String firstTwo(String text){
        return text.substring(0, 2);
    }

    public static String spaceBetween(String text){
        String secondText = "";
        for(int i = 0 ; i < text.length(); i++){
            secondText = secondText + text.charAt(i) + " ";
        }
        return secondText;
    }
}