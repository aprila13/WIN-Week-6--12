package com.April;
import java.util.Scanner;

public class StrExercise {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("What is your favorite animal?");
		String animal = input.nextLine();

		if(animal.equals("cat")) {
			System.out.println("Cats go meowwwww");
		} else {
			System.out.println("Other animals are " +
					"inferior LOL");
		}
	}
}

//Ask the user for an animal
//Use if/else conditionals to program in a number of animal sounds
//Use last else for unknown animals