package com.tts;

public class Main {

    public static void main(String[] args) {
        PersonInfo April = new PersonInfo("April Craig", "123 Main Street", "Charlotte, NC 28105");

        String borders = "+---------------------------------------------------------+";

        System.out.println(borders);
        Letter.letterSides();
        System.out.println(April.toString());
        System.out.println(borders);


    }
}
