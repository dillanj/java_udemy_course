package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(" --------- EXERCISE 15 --------- ");
        System.out.println(" --------- IS PALINDROME --------- ");
	    int num1 = 121;
	    int num2 = -1221;
	    int num3 = 707;
	    int num4 = 11212;

        System.out.println(num1 + " is a palindrome: " + NumberPalindrome.isPalindrome(num1) );
        System.out.println(num2 + " is a palindrome: " + NumberPalindrome.isPalindrome(num2) );
        System.out.println(num3 + " is a palindrome: " + NumberPalindrome.isPalindrome(num3) );
        System.out.println(num4 + " is a palindrome: " + NumberPalindrome.isPalindrome(num4) );


        System.out.println(" --------- EXERCISE 16 --------- ");
        System.out.println(" --------- SUM OF FIRST AND LAST DIGIT --------- ");
//        System.out.println( 252 + " = " + FirstLastDigitSum.sumFirstAndLastDigit(252));
//        System.out.println( 257 + " = " + FirstLastDigitSum.sumFirstAndLastDigit(257));
//        System.out.println( 0 + " = " + FirstLastDigitSum.sumFirstAndLastDigit(0));
        System.out.println( 10 + " = " + FirstLastDigitSum.sumFirstAndLastDigit(10));


    }
}
