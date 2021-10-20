package com.company;

import java.util.Arrays;

public class ReverseArray {

    public static void runProgram(){
        int[] array = { 4, 2, 4, 1, 6 };
        reverse(array);
    }

    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Reversed Array = " + Arrays.toString(array));
    }
}
