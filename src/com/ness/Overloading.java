package com.ness;

public class Overloading {

    public static void main(String[] args) {
//        int newScore = calculateScore("John", 500);
//        System.out.println("News score is " + newScore);
        //calculateScore(100, 100);
        //calculateScore();
        System.out.println(calcFeetAndInchesToCentimeters(10));
        System.out.println(calcFeetAndInchesToCentimeters(-0, -10));
        double cm = calcFeetAndInchesToCentimeters(-0, -10);
        if (cm < 0.0) {
            System.out.println("Invalid parameters");
        }

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No players score");
        return 0;
    }

    // changing data type is not overloading
//    public static void calculateScore() {
//        System.out.println("No players score");
//    }

    //what is signature: method name is same and parameters are different - number or types

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        //if (!(feet >= 0 || (inches >= 0 && inches <= 12))) {
        if (feet < 0 || ((inches < 0) || (inches > 12))) {
            System.out.println("invalid inches");
          return -1;
        }
        //return cmConversion(feet, inches);
        double footToInchesToCm = feet*12*2.54;
        double inchesToCm = inches*2.54;
        System.out.println("footToInchesToCm = " + footToInchesToCm + ", inchesToCm = " + inchesToCm);
        return footToInchesToCm + inchesToCm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0 ) {
            return -1;
        }
        //return calcFeetAndInchesToCentimeters(0, inches);
        double feet = (int) inches / 12;
        double remaingInches = (int) inches % 12;
        System.out.println(inches + "inches " + feet + "feet and" + remaingInches + "inches");
        return calcFeetAndInchesToCentimeters(feet, remaingInches);
    }

//    public static double cmConversion (double feet, double inches) {
//       double footToInchesToCm = feet*12*2.54;
//       double inchesToCm = inches*2.54;
//       return footToInchesToCm + inchesToCm;
//    }


}
