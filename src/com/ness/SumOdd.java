package com.ness;

public class SumOdd {

    public static void main(String[] args) {

    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

}
