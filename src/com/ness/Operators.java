package com.ness;

public class Operators {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 =" + result);

        result = result / 5;
        System.out.println("2 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;

        if (isAlien == false) System.out.println("It is not alien!");

        System.out.println("Aliens");


        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("High score.");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("topScore is greater than secondTopscore and topScore is less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("One or both conditions are true ");
        }

        // & <-- verifies both operands
        // && <-- stops evaluating if the first operand evaluates to false since the result will be false

        //If you use the || and && forms, rather than the | and & forms of these operators, Java will not bother to evaluate the right-hand operand alone.
        //It's a matter of if you want to short-circuit the evaluation or not -- most of the time you want to.


        int newValue = 50;
        if (newValue == 50) {
            System.out.println("true");
        }

        boolean isCarX = false;
        if (isCarX = true) {
            System.out.println("always true");
        }


        boolean isCar2 = true;
        //if(isCar2 == false) {
        //if(isCar2 != true) {
        //if(!isCar2) {

        //if(isCar2 == true) {
        //if(isCar2 != false) {
        if (isCar2) {
            System.out.println("isCar2 = " + isCar2);
        }

        boolean isCar = false;
        System.out.println("isCar = " + isCar);
        boolean wasCar = isCar ? true : false;
        System.out.println("wasCar = " + wasCar);


        boolean isCar3 = false;
        System.out.println("isCar3 = " + isCar3);
        boolean wasCar3 = true;
        if (isCar3 == true) {
            wasCar3 = true;
        } else {
            wasCar3 = false;
        }
        System.out.println("wasCar3 = " + wasCar3);

        int ageOfClient = 17;
        boolean isEighteenOrOver = (ageOfClient >= 18) ? true : false;
        System.out.println("isEighteenOrOver :" + isEighteenOrOver);

        // challenge

        double double1 = 20.00;
        double double2 = 80.00;
        double addAndMultiply = (double1 + double2) * 100;
        double modulus = addAndMultiply % 40;
        boolean boolean1 = (modulus == 0) ? true : false;
        System.out.println("boolean1 = " + boolean1);
        if (!boolean1) {
            System.out.println("Got remainder, it is: " + modulus);
        } else {
            System.out.println("There is no remainder, modulus is: " + modulus);
        }

        double km = (100 * .609344);
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("test");
        }

        int myVariable = 50;
        int myVariable2 = 50;

        // statement vs expression;


    }


}
