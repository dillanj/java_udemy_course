package com.company;

//public class Car {
//    private int doors;
//    private int wheels;
//    private String model;
//    private String engine;
//    private String color;
//
//    public void setModel(String model){
//        String validModel = model.toLowerCase();
//        if(validModel.equals("carrera") || validModel.equals("commodore")){
//            this.model = model;
//        }
//        else {
//            this.model = "Unknown";
//        }
//    }
//
//    public String getModel(){
//        return this.model;
//    }
//}

// CHALLENGE FROM LESSON 88
public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1; // when creating a car we will always start it in the first gear
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        move(speed, direction); // calling the super classes move method.
    }

//    @Override
//    public void stop() {
//        super.stop();
//    }
}
