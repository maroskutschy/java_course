package com.ness;

public class Switch {

    public static void main(String[] args) {
        int value = 2;
        String string = "String";
        char test = 'a';

        switch (value) {
            case 1:
                System.out.println("Value is 1");
                //break;
            case 2:
                System.out.println("Value is 2");
                //break;
            case 3: case 4: case 5:
                System.out.println("Value is 3, or 4, or 5. It was" + value);
                //break;
            default:
                System.out.println("Another value");
               // break;
        }

    }

}
