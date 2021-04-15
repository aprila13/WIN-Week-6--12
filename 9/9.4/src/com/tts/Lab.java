package com.tts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {

//  1. Write a program that does the following:
//     Ask the user for 5 numbers and store them in an array list.
//     Then find the sum, product, largest, and smallest of those numbers.

    //Import scanner
    Scanner input = new Scanner(System.in);
        System.out.println("Write your first number: "); //Ask for first num
    int firstNum = Integer.parseInt(input.nextLine()); //Save first num
        System.out.println("Your first number is " + firstNum); //Print first num

        System.out.println("Write your second number: ");
    int secondNum = Integer.parseInt(input.nextLine());
        System.out.println("Your second number is " + secondNum);

        System.out.println("Write your third number: ");
    int thirdNum = Integer.parseInt(input.nextLine());
        System.out.println("Your third number is " + thirdNum);

        System.out.println("Write your forth number: ");
    int fourthNum = Integer.parseInt(input.nextLine());
        System.out.println("Your forth number is " + fourthNum);

        System.out.println("Write your fifth number: "); //Ask for first num
    int fifthNum = Integer.parseInt(input.nextLine()); //Save first num
        System.out.println("Your fifth number is " + fifthNum); //Print first num

    // System.out.println(firstNum + 2); //test that int works

    List<Integer> numsList = new ArrayList<>(); //Declare array list
        numsList.add(firstNum); //Add first num to array list
        numsList.add(secondNum);
        numsList.add(thirdNum);
        numsList.add(fourthNum);
        numsList.add(fifthNum);

        System.out.println(numsList); //print array list

    int theSum = firstNum + secondNum + thirdNum + fourthNum + fifthNum; //Sum
        System.out.println("The sum is " + theSum);

    int theProduct = firstNum * secondNum * thirdNum * fourthNum * fifthNum; //product
        System.out.println("The product is " + theProduct);

        //Prep for finding largest number
    int large = Math.max(firstNum, thirdNum);
    int larger = Math.max(secondNum, fourthNum);


        //Finds the largest number
        if (large > larger && large > fifthNum) {
            System.out.println(large + " is the largest number in the array list");
        } else if (larger > large && larger > fifthNum) {
            System.out.println(larger + " is the largest number in the array list");
        } else {
            System.out.println(fifthNum + " is the largest number in the array list");
        }

        //Prep for finding smallest number
        int small = Math.min(firstNum, thirdNum);
        int smaller = Math.min(secondNum, fourthNum);

        if (small < smaller && small < fifthNum){
            System.out.println(small  + " is the smallest number in the array list");
        } else if (smaller < small && smaller < fifthNum) {
            System.out.println(smaller + " is the smallest number in the array list");
        } else {
            System.out.println(fifthNum + " is the smallest number in the array list");
        }
    }
}

