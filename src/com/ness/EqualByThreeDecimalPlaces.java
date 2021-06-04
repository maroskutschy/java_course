package com.ness;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class EqualByThreeDecimalPlaces {

    public static boolean isEqualByThreeDecimalPlaces(double number1, double number2) {

        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);

        //double number1rounded = Double.parseDouble(df.format(number1));
        String number1rounded = df.format(number1);
        System.out.println("number1rounded = " + number1rounded);
        //double number2rounded = Double.parseDouble(df.format(number1));
        String number2rounded = df.format(number2);
        System.out.println("number2rounded = " + number2rounded);

        if (number1rounded.equals(number2rounded)) {
            return true;
        }
        return false;

    }

}
