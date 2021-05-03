package com.tts;

public class Main {

    //Method
//    public static int adding(int a, int b) {
//        return a + b;
//    }

    public static int adding(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        //Logging the method
//        System.out.println(adding(3,4));

        //Saving the returned result + logging
//        int result = adding(2,8);
//        System.out.println(result);

//        System.out.println(adding(9,4));

        int result = adding(9,4);
        System.out.println(result);

        //While loop
//        int x = 1;
//        while (x <= 5) {
//            System.out.println("x = " + x);
//            x++;
//        }

        //Do While loop
//        int x = 1;
//        do {
//            System.out.println("x = " + x);
//            x++;
//        } while (x <= 5);

        //For loop
//        for(int x = 1; x <= 5; x++) {
//            System.out.println("x = " + x);
//        }

        //Nested While Loop
//        int outer = 1;
//        while(outer < 3) {
//            int inner = 5;
//            while(inner < 8) {
//                System.out.println(outer + " " + inner);
//                inner++;
//            }
//            outer++;
//        }

        //Nested For Loop
//        for (int outer = 0; outer <= 2; outer++) {
//            for (int inner = 0; inner <= 3; inner++) {
//                System.out.println(outer + " " + inner);
//            }
//            System.out.println(); //Creates space btw the groups
//        }

        //Adding numbers in a For Loop
//        int input = 6;
//        int sum = 0;
//        for(int i = 1; i <= input; i++) {
//            sum += i;
//            System.out.println("Sum after adding " + i + " is : " + sum);
//
//        }
//        System.out.println();
//        System.out.println("Sum of numbers till " + input + " is " + sum);

        //Factorial using a For Loop
//        int factorial = 1;
//        int number = 6;
//        for (int i = 1; i <= number; i++) {
//            factorial *= i;
//        }
//        System.out.println("Factorial of number " + number + " is " + factorial);

        //Using break
        //Break stops the program
//        for(int i = 0; i <= 5; i++) {
//            System.out.println(i);
//            if (i == 3) {
//                break;
//            }
//        }

        //Using continue
        //Continue skips the condition and then continues the program
//        for(int i = 0; i <= 5; i++) {
//            if (i == 3) {
//                continue;
//            }
//            System.out.println(i);
//        }

        //Using return
        //Return stops the program by transferring control back to the caller of the method
//        boolean time = true;
//        System.out.println("Before the return");
//        if(time) return;
//        System.out.println("After the return");


    }
}
