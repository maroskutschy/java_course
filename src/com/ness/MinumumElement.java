package com.ness;

public class MinumumElement {

    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] array = readIntegers(count);
        int minElement = findMin(array);
        System.out.println("minElement" + minElement);

    }

    private static int[] readIntegers(int count) {
//        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] values = new int[count];
        for (int i =0; i< values.length; i++) {
            System.out.println("Please enter a number: ");
            values[i] = scanner.nextInt();
            scanner.nextLine();
        }
         return values;
    }

    private static int findMin(int[] array){
       int min = Integer.MAX_VALUE;

        for (int i=0; i<array.length; i++) {
           int value = array[i];
           if (value < min) {
               min = value;
           }
        }

        return min;

    }


}
