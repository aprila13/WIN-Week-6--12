package com.tts;

import com.tts.abs.Guitar;
import com.tts.abs.Trumpet;
import com.tts.enumeration.Day;
import com.tts.enumeration.EnumTest;

//A class is a blueprint to create an object - Vehicle
//An object is an instance of a class - myVehicle
public class Main {


    //main - entry point
    public static void main(String[] args) {

    //Make an instance of Vehicle
    Vehicle myVehicle = new Vehicle();
    System.out.println(myVehicle.wheels);

    //New Instances of Guitar and Trumpet
    Guitar myGuitar = new Guitar();
    Trumpet myTrumpet = new Trumpet();
    myGuitar.createSound();
    myTrumpet.createSound();

    //Day Enum
    EnumTest weekday = new EnumTest(Day.MONDAY);
    weekday.weekendOrWeekday();
    }


}
