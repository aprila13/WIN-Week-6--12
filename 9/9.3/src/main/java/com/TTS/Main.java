package com.TTS;

//This method checks ID
public class Main {
    public static void CheckId(boolean validId, int age, boolean buyingAlc) { //variable initialized
        if (validId) { //1. if true, print and go to #2. if false go to #3
            System.out.println("Valid ID presented");
            if ((age > 21) && (buyingAlc)) { //2. if true, print. If false, go to #2a
                System.out.println("Customer legal to purchase alcohol");
            } else { //2a, runs if age is under 21 or buyingAlc is false
                System.out.println("No alcohol sales to this person");
            }
        } else { //3. for non-valid IDs
            System.out.println("Error: You cannot come in");
        }
    }


//    This method runs the CheckID method with it's arguments
    public static void main(String main[]) {
        CheckId(false, 20, true);
    }
}

//Gradle is used to download dependencies

//1. Write a Main class.
//2. Write a custom method in Main class.
//3. While still inside that Main class, run the custom method and arguments