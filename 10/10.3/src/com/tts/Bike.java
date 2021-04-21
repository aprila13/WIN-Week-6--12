package com.tts;

public class Bike implements Driveable{
    public int speed; //Instance variables
    public int gear;

//Methods in a class are known as concrete methods - does something in curly braces
    @Override
    public void changeGear(int a) {
        gear = a;
    }

    @Override
    public void accelerate(int a) {
        speed = speed + a;
    }

    @Override
    public void brake(int a) {
        speed = speed - a;
    }

    public void displayStatus() {
        System.out.println(
                "Speed: " + speed
                 + " Gear: " + gear
        );
    }


}
