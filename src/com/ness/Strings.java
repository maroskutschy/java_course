package com.ness;

public class Strings {

    public static void main(String[] args) {

        String myString = "Test";
        System.out.println("myString" + myString);
        myString = myString + "aaaa";
        System.out.println("adjusted myString" + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("adjusted myString 2 = " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString = " + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("lastString = " + lastString);

    }

}
