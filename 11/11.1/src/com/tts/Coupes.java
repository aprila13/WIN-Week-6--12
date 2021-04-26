package com.tts;

//Child/ Subclass

public class Coupes extends Cars{
    @Override
    void isDriving() {
        System.out.println("The coupe is driving");
    } //This method has override since it has a different implementation than in parent class

    public boolean hasEngine(boolean workingEngine) {
        return workingEngine;
    }

}
