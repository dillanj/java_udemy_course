package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        calculateScore("Tim", 500);
        calculateScore(200);
        calculateScore();

        System.out.println("---------- CHALLENGE -----------");

        // challenge
        calcFeetAndInchesToCentimeters(423);
        calcFeetAndInchesToCentimeters(57);
        calcFeetAndInchesToCentimeters(8, 4);
        calcFeetAndInchesToCentimeters(13, 1);

        System.out.println("---------- CHALLENGE 2: SECONDS & MINUTES -----------");
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
        System.out.println(getDurationString(61, 0));




    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static void calculateScore(){
        System.out.println("No player name, no player score.");
        return;
    }

    // challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet < 0 || inches < 0 || inches > 12 ){
            return -1;
        }
        double centimeters = ((feet * 12) + inches) * 2.54;
        System.out.println(feet + " feet, " + inches + " inches is: " + centimeters + " centimeters.");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if ( inches <= 0 ){
            return -1;
        }
        double feet = Math.floor(inches / 12);
        return calcFeetAndInchesToCentimeters(feet, inches % 12);
    }

    // CHALLENGE 2
    private static String getDurationString(int minutes, int seconds){
        if ( minutes < 0 || seconds < 0 || seconds > 59){
            return INVALID_VALUE_MESSAGE;
        }
        int hours = (int) minutes / 60;
        int loMinutes = (int) minutes % 60;
        return (hours + "h " + loMinutes + "m " + seconds + "s");
    }

    private static String getDurationString(int seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = (int) seconds / 60;
        return getDurationString(minutes, seconds % 60);
    }


}
