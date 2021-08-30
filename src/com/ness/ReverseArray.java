package com.ness;

public class ReverseArray {

    static int[] originalArray = new int[] {4,5,6,7,8};

    public static void main(String[] args) {
       System.out.println("array before reverse: ");
       printArray(originalArray);
       reverse(originalArray);
       System.out.println("array after reverse: ");
       printArray(originalArray);
    }

    private static void reverse(int[] array) {
        int sizeOfOriginalArray = array.length;
        int[] tempArray = new int[sizeOfOriginalArray];
        for (int i=0; i < array.length; i++) {
            int j = i+ 1;
            int indexInNewArray = sizeOfOriginalArray - j;
            tempArray[indexInNewArray] = array[i];
        }
        originalArray = tempArray;
    }

    private static void printArray(int[] array) {
     for (int number : array) {
         System.out.println(number);
     }
    }

}
