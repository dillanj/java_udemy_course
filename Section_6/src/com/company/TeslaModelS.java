package com.company;

public class TeslaModelS extends Car {
    private int roadServiceMonths;

    public TeslaModelS(int roadServiceMonths) {
        super("Tesla Model S", "AWD", 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths; // how many months of free roadside service...
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        }
        else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        }
        else if (newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        }
        else if (newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }
        else if (newVelocity > 30 && newVelocity <= 40){
            changeGear(4);
        }
        else if (newVelocity > 40 && newVelocity <= 50){
            changeGear(5);
        }
        else {
            changeGear(6);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
