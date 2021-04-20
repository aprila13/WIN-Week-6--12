package com.tts;

import java.util.ArrayList; //Package must be imported to use ArrayList

public class Main {

    public static void main(String[] args) {
//        System.out.println("+++++++ArrayList Practice+++++++");
//        ArrayList<String> theList = new ArrayList<>();
//        theList.add("First");
//        theList.add("Second");
//        System.out.println(theList);
//
//        //size is used for ArrayLists instead of length
//        int size = theList.size(); //Setting the size of the ArrayList using the size method
//        System.out.println(size); //2
//
//        String val = theList.get(1);
//        System.out.println(val); //second

        //System.out.println("+++++++Car Class+++++++");
        //An instance of the class is creating using new
//        Car car = new Car(); //Car refers to the Car Class. car is the variable (instance) name
//        car.color = "Blue";
//        car.NumberOfDoors = 4;
//        car.start();
//        car.stop();
//        car.drive();

        //Constructor with arguments
//        Car car = new Car("black", 4, "Altima");
//        System.out.println(car.color);

//        Car sporty = new Car("red", 2, "coupe");
//        sporty.start();

        Car family = new Car();
        family.setColor("Gold"); //Sets the color, using the setColor setter
        System.out.println(family.getColor()); //Gets the color, using the getColor getter
    }
}

//The four principles of OOP are:
//Abstraction: Abstracts object methods for ease of use
//Encapsulation: Classes group object properties with methods. Properties can be shielded from a user's direct access.
//Inheritance: Objects can access methods of their class and any super classes
//Polymorphism: Methods can be modified/redefined to fit the particularities of a specific sub-class
