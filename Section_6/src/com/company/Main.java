package com.company;

public class Main {

    public static void main(String[] args) {
        // LESSON 77 & 78
//        Car porshe = new Car();
//        Car kia = new Car();
//        porshe.setModel("Carrera");
//        System.out.println("The model for our porsche is: " + porshe.getModel());

        // Challenge from lesson 88
        TeslaModelS tesla = new TeslaModelS(36);
        tesla.steer(45);
        tesla.accelerate(30); // 30
        tesla.accelerate(20); // 50
        tesla.accelerate(-42); // 8
    }
}
