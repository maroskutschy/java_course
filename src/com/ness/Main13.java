package com.ness;

public class Main13 {

    public static int multiplier = 7 ;

    public static void main(String[] args) {

        // from static method we cannot access non static methods in same class
       int answer = multiply(6);
        System.out.println( answer + multiplier);




    }

    public static int multiply(int number) {
        return number * multiplier;
    }

}
