package com.tts;

import java.util.Scanner;

public class Directions {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Select N, S, E, W");
        String userIput = myScan.nextLine();

        switch (userIput) {
            case "N":
              System.out.print("You selected North!");
              break;
            case "S":
                System.out.print("You selected South!");
                break;
            case "E":
                System.out.print("You selected East!");
                break;
            case "W":
                System.out.print("You selected West!");
                break;
            default:
                System.out.print("Unknown Direction");
                break;
        }
    }
}
