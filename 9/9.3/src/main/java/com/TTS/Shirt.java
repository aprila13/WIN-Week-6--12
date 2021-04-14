package com.TTS;

public class Shirt {
    public static void printShirtSize(char shirt) {
        String msg= " ";
        switch(shirt)
        {
            case 's' -> msg= "Shirt is small";

            case 'm'-> msg= "Shirt is medium";

            case 'l' -> msg= "Shirt is large";

            case 'x' ->msg= "Shirt is Xtra large";

            default ->msg= "Unknown shirt size";
        }  //If using arrows in a switch statement, you don't need breaks
        System.out.println(msg);
    }

    public static void main(String[] args) {
        printShirtSize('s');

        //Using a loop.  Placed inside the Main method since the method above is for the switch statement logic
//        for(int i=1; i<=20; i++) {
//            System.out.println("The current counter is: " + i);
//        }
    }
}

//1. Write a Main class.
//2. Write a custom method in Main class.
//3. While still inside that Main class, run the custom method and arguments




