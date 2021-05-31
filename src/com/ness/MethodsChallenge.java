package com.ness;

public class MethodsChallenge {

    public static void main(String[] args) {
       int finalPosition1 = calculateHighScorePosition(1500);
       dislayHighScorePosition("John", finalPosition1);

        int finalPosition2 = calculateHighScorePosition(900);
        dislayHighScorePosition("Mike", finalPosition2);

        int finalPosition3 = calculateHighScorePosition(400);
        dislayHighScorePosition("Chuck", finalPosition3);

        int finalPosition4 = calculateHighScorePosition(50);
        dislayHighScorePosition("Bruce", finalPosition4);

        int finalPosition5 = calculateHighScorePosition(1000);
        dislayHighScorePosition("Jim", finalPosition5);

    }

    public static void dislayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition (int playerScore) {
        // what about 1000, 500, 100 = ? always position 4
//        if (playerScore > 1000) {
//            return 1;
//        } else if (playerScore >= 500 && playerScore < 1000) {
//            return 2;
//        } else if (playerScore >= 100 && playerScore < 500) {
//            return 3;
//        } else {
//            return 4;
//        }

        // not necessary && ...
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500 && playerScore < 1000) {
//            return 2;
//        } else if (playerScore >= 100 && playerScore < 500) {
//            return 3;
//        } else {
//            return 4;
//        }

//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4;

                if (playerScore >= 1000) {
                    position = 1;
                } else if (playerScore >= 500) {
                    position = 2;
                } else if (playerScore >= 100);
                {
                    position = 3;
                }
                {
                //empty
                }
        return position;


    }
}
