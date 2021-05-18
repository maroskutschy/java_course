package com.ness;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value A = " + myMaxIntValue + 1 + 1);
        System.out.println("Busted MAX value B = " + (myMaxIntValue + 1));
        System.out.println("Busted MAX value = "  + (myMinIntValue - 1));

        int myMaxInTest = 2_147_483_647;
        System.out.println(myMaxInTest);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        //        byte myNewByteValue = (myMinByteValue / 2);
        //        byte myNewByteValue2 = myMinByteValue / 2;
        //        byte myNewByteValue3 = (byte) myMinByteValue / 2;
        //
        //        byte myNewByteValueX = (myMinByteValue / 2);
        //
        //        byte myNewByteValue4 = (short) (myMinByteValue / 2);
        //        byte myNewByteValue5 = (byte) (myMinByteValue / 2);
        //
        //        short myNewShortValue = (myMinShortValue / 2);
        //        short myNewShortValue2 = (byte) (myMinShortValue / 2);
        //        short myNewShortValue3 = (short) (myMinShortValue / 2);

        // byte > short > int > long

        byte variableByte = 20;
        short variableShort = 222;
        int variableInt = 333;
        long variableLong = 50000L + 10*(variableByte + variableShort + variableInt);
        System.out.println(variableLong);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " +myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " +myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("MyIntValue=" + myIntValue);
        System.out.println("MyFloatValue=" + myFloatValue);
        System.out.println("MyDoubleValue=" + myDoubleValue);

        double pounds = 2;
        double kilograms = pounds * 0.045359237;
        System.out.println( pounds + " pounds = " + kilograms + " kilograms");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);





    }
}
