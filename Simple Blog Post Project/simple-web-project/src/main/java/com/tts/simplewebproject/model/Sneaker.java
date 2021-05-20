package com.tts.simplewebproject.model;

//Every class inherits methods from the parent Object.java
//This class represents a Sneaker

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sneaker {

    //Long is used because it allows storing a large amount of IDs
    //Its the wrapper version of Long
    //It is an object and not a primitive
    //Lower case long is the primitive version
    //Even though these fields are private, they can be accessed through public getters

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String color;

    //empty constructors are needed for a java bean
    //A JavaBean is just a standard:
        //All properties are private (use getters/setters)
        //A public no-argument constructor
        //Implements Serializable -- Stream into a series of 1s and 0s
    public Sneaker() {
    }  //No args constructor

    public Sneaker(Long id, String color) {
        this.id = id;
        this.color = color;
    }  //Constructor

    public Sneaker(String color) {
        this.color = color;
    }  //Constructor w/o ID

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sneaker{" +
                "id=" + id +
                ", color='" + color + '\'' +
                '}';
    }
}
