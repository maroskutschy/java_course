package com.ness;

public class While_Challenge {

    public static void main(String[] args) {
        int number = 125;
        System.out.println("Sum of digits in number " + number + "is: " );
    }


     static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

}
