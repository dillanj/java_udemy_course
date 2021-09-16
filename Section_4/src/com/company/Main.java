package com.company;

public class Main {

    public static void main(String[] args) {
        int finalScore1 = calculateScore(true, 800, 5, 100);

        int finalScore2 = calculateScore(true, 10_000, 8, 200);
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
}
