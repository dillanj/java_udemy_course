package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    int inputs = 1;
//	    int sum = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        while(inputs <= 10){
//            System.out.println("Enter number #" + inputs);
//            boolean isValidInt = scanner.hasNextInt();
//            if(isValidInt){
//                int number = scanner.nextInt();
//                sum += number;
//                inputs++;
//            }
//            else {
//                System.out.println("Invalid Number. Try again.");
//            }
//            scanner.nextLine(); // handle end of line (enter key)
//        }
//        System.out.println("The sum of all the numbers that you entered: " + sum);
//        scanner.close();


        System.out.println("---------- MIN & MAX CHALLENGE -----------");
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MAX_VALUE; // set to the max num an int can hold
//        int max = -2147483647; // set to the max num an int can hold
        int min = Integer.MIN_VALUE; // set to the max num an int can hold
//        int min = 2147483647; // set to the max num an int can hold
//        boolean isFirst = true;
        while(true){
            System.out.println("Enter number: ");
            boolean isValidNum = scanner.hasNextInt();
            if(isValidNum){
                int num = scanner.nextInt();
//                if(isFirst){
//                    max = num;
//                    min = num;
//                    isFirst = false;
//                }
                if(num > max){
                    max = num;
                }
                if (num < min){
                    min = num;
                }
            }
            else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min number you entered : " + min);
        System.out.println("Max number you entered : " + max);
        scanner.close();
    }
}
