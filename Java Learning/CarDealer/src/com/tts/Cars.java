package com.tts;

public class Cars {
    String make;
    String model;
    int year;
    int miles;
    int currentYear = 2021;

    //Constructor
    public Cars(String make, String model, int year, int miles) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.miles = miles;
    }

    //Methods
    public void carSound() {
        System.out.println("Cars go Vroom Vroom!!");
    }

    public int carAge() {
    return currentYear - year;
    }

    //Getters + Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

}
