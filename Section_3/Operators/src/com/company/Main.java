package com.company;

public class Main {

    public static void main(String[] args) {
//	    int result = 1 + 2;
//        System.out.println("1 + 2 = " +  result);
//
//        int previousResult = result;
//        System.out.println("Previous Result " + previousResult);
//        result = result - 1;
//        System.out.println(" 3 - 1 = " + result);
//        System.out.println("Previous Result = " +  previousResult);
//
//        result = result * 10; // 2 * 10 = 20
//        System.out.println("2 * 10 = " + result);
//
//        result = result / 5;  // 20 / 5 = 4
//        System.out.println("20 / 5 = " + result);
//
//        result = result % 3; // the remainder of 4 / 3 (1)
//        System.out.println("4 % 3 = " + result);
//
//        result++; // 1 + 1 = 2
//        System.out.println("1 + 1 = " + result);
//
//        result--; // 2 - 1 = 1
//        System.out.println("2 - 1 " + result);
//
//        result += 2; // 1 + 2 = 3
//        System.out.println("1 + 2 = " + result);
//
//        result *= 10; // 3 * 10 = 30
//        System.out.println("3 * 10 = " + result);
//
//        boolean isAlien = false;
//        if (isAlien){
//            System.out.println("It is an alien!");
//        }
//        else {
//            System.out.println("It is not an Alien!");
//        }
//
//        if(isAlien)
//            System.out.println("It is not an Alien (without code block)");
//        else
//            System.out.println("It not an alient (without code block)");
//
//        int topScore = 100;
//        if(topScore > 100){
//            System.out.println("You got the high score!");
//        }
//
//        int secondTopScore = 60;
//        if(topScore > secondTopScore && topScore <= 100){
//            System.out.println("Greater than top score and less than or equal to 100");
//        }

        /// OPERATOR CHALLENGE
        double a = 20.00d; // 1
        double b = 80.00d; // 2
        double result = (a + b) * 100.00d; // 3
        double remainder = result % 40.00d; // 4
        boolean noRemainder = remainder == 0 ? true : false; // 5
        System.out.println("has Remainder: " + noRemainder); // 6
        if(!noRemainder){ // 7
            System.out.println("Got some remainder");
        }




    }
}
