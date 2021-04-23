package com.tts;

public class Poodle {

    static class WhitePoodle implements DogInterface{

        @Override
        public void walking() {
            System.out.print("The dog is walking!");
        }
    }

    public static void main(String[] args) {

    WhitePoodle myPoodle = new WhitePoodle();
    myPoodle.walking();
    }


}
