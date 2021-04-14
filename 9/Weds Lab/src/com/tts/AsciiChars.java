package com.tts;

public class AsciiChars {

    //Each of these is a method within the AsciiChars class + is based off the ASCII Chart
    public static void printNumbers() {
        for(int i = 48; i < 58; i++){ //On ASCII chart digits range from 48 - 57.
            System.out.println((char)i); //Prints char at current iteration
        }
    }

    public static void printLowerCase() {
        for(int i = 97; i < 123; i++){
            System.out.println((char)i);
        }
    }

    public static void printUpperCase() {
        for(int i = 65; i < 91; i++){
            System.out.println((char)i);
        }
    }
}
