package com.tts;

import java.util.Scanner;

public class FtoC {

    public static void main(String[] args) {
        //Fahrenheit to Celsius Conversion with scanner

        Scanner myScan = new Scanner(System.in);
        System.out.println("Write in a temp: ");
        int userTemp = myScan.nextInt();
        int fahrenheit = userTemp;
        double formula  = ( 5.0 * (fahrenheit - 32.0) ) / 9.0; //formula to convert F to C
        int celsius = (int) formula;  //Casting the formula into an int
        System.out.println("Your celsius temp is: " + celsius);
    }
}
