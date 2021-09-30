package com.company;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
//        String num = String.valueOf(number);
//        if (num.length() == 1){
//            return number;
//        }
//        String firstNum = num.substring(0, 1);
////        System.out.println("First num " + firstNum);
//        String lastNum = num.substring(num.length() - 1);
////        System.out.println("last Num " + lastNum);
//        return Integer.parseInt(firstNum) + Integer.parseInt(lastNum);
        int sum = 0;
        for(int i = 0; number > 0; i++){
            if(number < 10){
                sum = number + number;
                break;
            }
            if(i==0){
                sum = sum + number % 10;
            }
//            System.out.println("sum " + sum);
            number = number / 10;
//            System.out.println("number" + number);
            if(number < 10){
                sum = sum + number;
                break;
            }
        }
        return sum;
    }
}
