package com.ness;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int number) {

    // original number which we adjust
    int originalNumber = number;

    // reverse the number
    int reversedNumber = 0;

    while (originalNumber > 0) {

        // find out last digit from original number
        int lastDigit = originalNumber % 10;

        // add last digit from orinal number to the reversed number
        reversedNumber = reversedNumber*10 + lastDigit;

        // remove last digit from original number
        originalNumber = originalNumber / 10;

        }

        System.out.println("original number is: " + number + ", reversed number is: " + reversedNumber);

    if (number == reversedNumber || (reversedNumber == (-1)*number )) {
        return true;
    }
    return false;





    }


}
