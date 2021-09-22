package com.company;

public class Main {
//    enum Day {
//        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
//    }

    public static void main(String[] args) {
        // challenge
        char myChar = 'F';
        switch(myChar){
            case 'A':
                System.out.println("The Char was an 'A' character.");
                break;

            case 'B': case 'C': case 'D': case 'E':
                System.out.println("The Char was a 'B' or 'C' or 'D' or 'E'  character.");
                break;

            default:
                System.out.println("Character Not Found : " + myChar);
                break;
        }

        String month = "January";
        switch(month.toLowerCase()){
            case "JaNuary":
                System.out.println("January was the month");
                break;
            default:
                System.out.println("Month was not January");
                break;
        }

        // CHALLENGE
        System.out.println("--------- DAY OF WEEK CHALLENGE ---------");

        printDayOfTheWeek(-2); // invalid
        printDayOfTheWeek(7); // invalid

        for(int i = 0; i < 7; i++){
            printDayOfTheWeek(i);
        }

        // loan interest challenge

        System.out.println("--------- CALCULATE INTEREST CHALLENGE ---------");
        for ( int i = 2; i <= 8; i++ ){
            final double interest = calculateInterest(10_000, i);
            System.out.println("The interest on $10,000 with a " + i + "% interest rate is: " + String.format("%.2f", interest));
        }


        // prime number challenge
        System.out.println("--------- IS PRIME NUMBER CHALLENGE ---------");
        int totalPrimes = 0;
        for( int i = 10; i < 50; i++){
            if(totalPrimes >= 10){
                System.out.println("We found 3 prime numbers");
                System.out.println("Exiting for loop");
                break;
            }
            if( isPrime(i) ){
                System.out.println(i + " is a prime number!");
                totalPrimes ++;
            }
        }

    }

    // CHALLENGE DAY OF THE WEEK
    public static void printDayOfTheWeek(int day){
        switch(day){
            case 0:
                System.out.println("The Day is Sunday. -- Hoy es Domingo");
                break;
            case 1:
                System.out.println("The Day is Monday. -- Hoy es Lunes");
                break;
            case 2:
                System.out.println("The Day is Tuesday. -- Hoy es Martes");
                break;
            case 3:
                System.out.println("The Day is Wednesday. -- Hoy es Miercoles");
                break;
            case 4:
                System.out.println("The Day is Thursday. -- Hoy es Jueves");
                break;
            case 5:
                System.out.println("The Day is Friday. -- Hoy es Viernes");
                break;
            case 6:
                System.out.println("The Day is Saturday. -- Hoy es Sabado");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
