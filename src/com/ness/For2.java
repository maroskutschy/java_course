package com.ness;

public class For2 {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum = sum + i;
                count ++;
                System.out.println("number for sum: " + i+ ". Sum is: " + sum);
                System.out.println("count is: " + count);
            }
            if (count == 5) {
                System.out.println("breaking the loop.");
                break;
            }
        }
        System.out.println("sum is: " + sum);
    }




}
