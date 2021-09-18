package com.company;

public class Main {

    public static void main(String[] args) {
        int finalScore1 = calculateScore(true, 800, 5, 100);
        int finalScore2 = calculateScore(true, 10_000, 8, 200);

        // CHALLENGE CODE
        displayHighScorePosition("Player 1", calculateHighScorePosition(1500));
        displayHighScorePosition("Player 2", calculateHighScorePosition(900));
        displayHighScorePosition("Player 3", calculateHighScorePosition(400));
        displayHighScorePosition("Player 4", calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

    // CHALLENGE CODE
    public static void displayHighScorePosition(String player, int scorePosition){
        System.out.println(player + " managed to get into position: " + scorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if ( score >= 1000 ){
            return 1;
        }
        else if ( score >= 500){
            return 2;
        }
        else if ( score >= 100 ){
            return 3;
        }

        return 4;
    }
}
