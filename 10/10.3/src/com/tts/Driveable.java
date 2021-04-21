package com.tts;

//Interface for most vehicles
//Interfaces are for common behaviors

public interface Driveable {
    //methods in interfaces do not have implementations or body
    //The methods below are abstract methods. There are no curly braces.
    //They don't do anything
    void changeGear(int a);
    void accelerate(int a);
    void brake(int a);
}
