package com.company;

public class Main {

    public static void main(String[] args) {

        //Coding exercise 1
        SpeedConverter.printConversion(1);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);

        System.out.println("--------------------------------------------------------");
        // Coding exercise 2
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        MegaBytesConverter.printMegaBytesAndKiloBytes(2502120);

    }
}
