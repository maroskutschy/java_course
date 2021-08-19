package com.ness;

public class Scanner {

    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int[] integers = getIntegers(5);
        for (int i=0; i<integers.length; i++) {
            System.out.println("Element" + i + ", typed value was " + integers[i]);
        }
    }

    public  static int[] getIntegers(int number) {
        int[] values = new int[number];
        for (int i =0; i< values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

}
