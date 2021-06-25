package com.ness;

public class TeenNumberChecker {

//    public static void main(String[] args) {
//        System.out.println(isTeen(10));
//    }

    void main(String[] args) {
        System.out.println(isTeen(10));
    }

    public static boolean hasTeen(int number1, int number2, int number3) {
        if (number1 >= 13 && number1 <= 19 || number2 >= 13 && number2 <= 19 || number3 >= 13 && number3 <= 19) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int number) {
        if (number >= 13 && number <= 19) {
            return  true;
        }
        return false;
    }

}

