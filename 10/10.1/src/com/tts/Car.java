package com.tts;

//There is no main class here because I will run this in Main.java
public class Car { //You need these properties to make a constructor later
    public String color; //attribute
    public int NumberOfDoors; //attribute
    public String model; //attribute

    //Getters and Setters for the properties of the class
    public String getColor() { //Getter
        return color;
    }

    public void setColor(String color) { //Setter
        this.color = color;
    }

    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    public void setNumberOfDoors(int NumberOfDoors) {
        if ( NumberOfDoors >= 1 && NumberOfDoors <= 6) {
            this.NumberOfDoors = NumberOfDoors;
        } else {
            this.NumberOfDoors = 2;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
// Ends Setters and Getters


    public void start() { //method
        System.out.println("Car starting");
    }

    public void stop() { //method
        System.out.println("Car stopping");
    }

    public void drive() { //method
        System.out.println("Car driving");
    }

    public Car() //constructor
    {
        this.color = color;
        this.NumberOfDoors = NumberOfDoors;
        this.model = model;
    }
}

//The public access modifier means it is available in other classes.