package com.April;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //This creates a new scanner instance
        //System.in is input stream from keyboard
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");

        //Saves the variable from the input
		//nextLine method can only be used with importing scanner
        //nextLine() reads next line of text as string
        String firstName = input.nextLine();
        //%s stands for a placeholder and works like JS
        // template literals
        System.out.printf("Hello %s!\n", firstName);
        System.out.printf("Goodbye %s!\n", firstName);
//	    System.out.println("Hello World!");
    }
}


//System is a class.

//To take input, import the Scanner object from the java.util package.
