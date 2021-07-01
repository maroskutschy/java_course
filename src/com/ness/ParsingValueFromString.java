package com.ness;

public class ParsingValueFromString {

    public static void main(String[] args) {

        String numberAsString = "2018.125a";
        System.out.println("numberAsString = " + numberAsString);

        //int number = Integer.parseInt(numberAsString);
        double number= Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        System.out.println(numberAsString += 1);
        System.out.println(number += 1);

    }

}
