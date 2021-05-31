package com.ness;

public class Methods {

    public static void main(String[] args) {
//        boolean gameOver = true;
//
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Final score = " +highScore);

       int finalScore1 = calculateScore(true, 800, 5, 100);
       System.out.println("FINAL SCORE 1 = "+ finalScore1);
       int finalScore2 = calculateScore(true, 10000, 8, 200);
       System.out.println("FINAL SCORE 2 = "+ finalScore2);

//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your second score was " + finalScore);
//        }
     }

//     public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//         if (gameOver) {
//             int finalScore = score + (levelCompleted * bonus);
//             finalScore += 2000;
//             System.out.println("Your final score was " + finalScore);
//         }
//     }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore =0;
        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
        return finalScore;
    }



}
