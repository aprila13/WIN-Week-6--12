package com.tts;

public class Main {

    public static void main(String[] args) {

        //Person is the class we created (the type)
        //firstPerson is the name of the variable (reference)
        //new Person() initializes an instance of Person
        Person firstPerson = new Person(); //from default constructor
        Person secondPerson = new Person("John"); //from 1 param constructor
        Person thirdPerson = new Person("Jane", 45, "London");

        thirdPerson.sayHello(); //calling the sayHello method on the thirdPerson object

        System.out.println("Jane will be " + thirdPerson.birthday() + " years old next year.");
        System.out.println(thirdPerson.birthYear(2021));
    }
}

//An object is a piece of data. Ex. 4
//A class is what type of data that is. Ex. Integer
//Data Types == Classes