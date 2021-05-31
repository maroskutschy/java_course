package com.ness;

public class CodeBlockIfThen {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 900;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less 5000 and greater than 1000");
        } else if (score < 1000) {
            System.out.println("score was < 1000");
        } else if (score < 500) {
            System.out.println("score was < 500");
        } else {
            System.out.println("got here");
        }

        //if (gameOver == true) {
        if (gameOver) {
            int finalScore = score

                    +


                    (levelCompleted * bonus);


            System.out.println("Your final score was " + finalScore);
            //challenge
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int secondScore = score + (levelCompleted * bonus);
            System.out.println("Your second score was " + secondScore);
        }
        //System.out.println("Your second score was " + secondScore);
        //scope
        //int savedFinalScore = finalScore;

        System.out.println("this was executed");
    }

}
