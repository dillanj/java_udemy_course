package com.company;

import java.util.Scanner;

public class MinimumElement {

    public static void runProgram(){
        System.out.println("Please specify the number of integers you are going to enter.");
        int numOfElements = readInteger();
        System.out.println("Please enter " + numOfElements + " integers.");
        int[] array = readElements(numOfElements);
        int min = findMin(array);
        System.out.println("The minimum number is: " + min);
    }

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return num;
    }

    private static int[] readElements(int numOfElements){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[numOfElements];
        for(int i = 0; i < array.length; i++){
            int input = scanner.nextInt();
            scanner.nextLine();
            array[i] = input;
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
