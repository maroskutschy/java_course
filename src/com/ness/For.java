package com.ness;

public class For {

    public static void main(String[] args) {
//        System.out.println(calculateInterest(10000, 2));
//        System.out.println(calculateInterest(10000, 3));
//        System.out.println(calculateInterest(10000, 4));

//        for (int i=0; i<5; i++) {
//            System.out.println(i);
//
//        }

//        for (int i=2; i <9; i++) {
//            //System.out.println(calculateInterest(10000, i));
//            System.out.println(String.format("%.2f", calculateInterest(10000.0, i)));
//        }

//        for (int i=8; i >1; i--) {
//            //System.out.println(calculateInterest(10000, i));
//            System.out.println(String.format("%.2f", calculateInterest(10000.0, i)));
//        }

        int count = 0;
        for (int i=10; i<50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is Prime");
                if (count == 10) {
                    System.out.println("exiting loop");
                    break;
                }
                System.out.println("");
            }
        }



    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i=2; i <= n/2; i++) {
        //for (int i=2; i <= (long) Math.sqrt(n); i++) {
            System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }



    public static double calculateInterest(double amount, double interestRate) {
        return (amount *(interestRate/100));
    }

}
