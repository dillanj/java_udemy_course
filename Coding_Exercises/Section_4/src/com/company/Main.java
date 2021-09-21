package com.company;

public class Main {

    public static void main(String[] args) {

        //Coding exercise 1
        SpeedConverter.printConversion(1);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);

        System.out.println("----------------------------EXERCISE 2----------------------------");
        // Coding exercise 2
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        MegaBytesConverter.printMegaBytesAndKiloBytes(2502120);

        System.out.println("--------------------------EXERCISE 3------------------------------");
        // Coding exercise 3
        boolean t1 = BarkingDog.shouldWakeUp(true, 1);
        boolean t2 = BarkingDog.shouldWakeUp(false, 2);
        boolean t3 = BarkingDog.shouldWakeUp(true, 8);
        boolean t4 =BarkingDog.shouldWakeUp(true, -1);

        System.out.println("test 1: " + t1);
        System.out.println("test 2: " + t2);
        System.out.println("test 3: " + t3);
        System.out.println("test 4: " + t4);

        System.out.println("--------------------------EXERCISE 4------------------------------");
        double area1 = AreaCalculator.area(5.0);
        double area2 = AreaCalculator.area(-1);
        double area3 = AreaCalculator.area(5.0, 4.0);
        double area4 = AreaCalculator.area(-1.0, 4.0);

        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);
        System.out.println(area4);


    }
}
