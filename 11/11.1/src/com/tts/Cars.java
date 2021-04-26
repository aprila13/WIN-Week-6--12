package com.tts;

//Parent/ Super class
//Abstract Class
abstract class Cars {
    String make;
    String model;
    int year;

//Constructor
    public Cars(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    //Empty constructor, ensures the Coupes + methods works
    public Cars() {}

    //abstract class - method is declared but has no {body}
    //You can implement the method by overriding it elsewhere
    abstract void isDriving();

//********Getters + Setters********
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
//********END Getters + Setters********


    @Override
    public String toString() {
        return "Cars{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
