package com.tts;

//Class
public class Fruits {
    String name; //Instance variables, fields, members
    String type;
    String origin;
    int price;

//Constructor
    public Fruits(String name, String type, String origin, int price) {
        this.name = name; //Data-binding: variable is equal to the parameter
        this.type = type;
        this.origin = origin;
        this.price = price;
    }

    //Getters + Setters: methods to create or change values
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "My Favorite Fruits are " +
                  name + ". " + " And it is a type of " + type
                + " They are from " + origin + " and cost $" + price ;
    }
}


