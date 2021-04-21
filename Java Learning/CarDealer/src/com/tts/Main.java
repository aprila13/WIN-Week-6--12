package com.tts;

public class Main {

    public static void main(String[] args) {

        Cars myCar = new Cars("Nissan", "Sentra", 2017, 40000);
        System.out.println("The make is: " + myCar.getMake());
        System.out.println("The model is: " + myCar.getModel());
        System.out.println("The year is: " + myCar.getYear());
        System.out.println("The miles is: " + myCar.getMiles());

        myCar.carSound();

        System.out.println("The car is " + myCar.carAge() + " years old.");
    }
}
