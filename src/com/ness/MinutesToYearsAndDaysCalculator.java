package com.ness;

public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
       printYearsAndDays(5);
    }

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long remainderMinutesAfterYears = minutes % 525600;
            long days = remainderMinutesAfterYears / 1440;
            long remainderMinutesAfterDays = remainderMinutesAfterYears % 1440;

            System.out.println(minutes + " minutes = " + years + "y and " + days + " d");
        }

    }

}
