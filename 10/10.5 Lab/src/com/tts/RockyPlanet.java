package com.tts;

//Once planet is extended, must implement all abstract methods
//Or make rockyPlanet abstract too.
public class RockyPlanet extends Planet implements Rotatable{

    private Long distanceFromSun;

    //Setters + Getters are examples of encapsulation since access to fields are wrapped
    //and are only exposed when the method is invoked
    public void setDistanceFromSun(Long distanceFromSun){
        this.distanceFromSun = distanceFromSun;
    }

    @Override
    public Long getDistanceFromSun() {
        return distanceFromSun;
    }


    @Override
    public void doRotate() {

    }
}
