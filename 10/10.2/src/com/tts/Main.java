package com.tts;

import java.util.ArrayList;
import java.util.List;

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

        System.out.println(thirdPerson.getName()); //Jane

        //Refers to the same object but name has been set to Mary
        thirdPerson.setName("Mary");
        System.out.println(thirdPerson.getName()); //Mary
        System.out.println(thirdPerson.getName() + " will be " + thirdPerson.birthday() + " years old next year.");

        //========BOOK======
        //This makes it print looking like an object
        Book myBook = new Book("Micheal Crichton",
                "Jurassic Park",
                1993,
                "publisher",
                "Thriller");

        System.out.println(myBook);

        //========DOG======
        Dog myDog = new Dog("Pitt Mix", "Jessica", "Henry Bravo");
        myDog.doFetch(); //This method is from the dog child class
        System.out.println(myDog.getCry()); //This method works because it comes from the Animal class

        //========Polymorphic======
        //All dogs are animals, but not all animals are dogs
        Animal myPolymorphicDog = new Dog("Terrier", "Mark", "Bongo");
        //myPolymorphicDog.doFetch(); //Will not work

        //========STUDENT======
        Student myStudent = new Student("Mike", 20, "Charlotte", 2021, false);
        System.out.println(myStudent); //Same as above
        myStudent.enrolledStudent(); //make enrolled true
        System.out.println(myStudent);

        //========ADDING STUDENT TO ArrayList + Looping======
        List<Student> studentList = new ArrayList<>();

        studentList.add(myStudent);
        studentList.add(new Student("Janice", 32, "NC", 2021, true));

        //Both methods do the same but forEach is a better practice
        System.out.println("Elements in student list: ");
        for(Student student : studentList) {
            System.out.println(student);
        }

        studentList.forEach((student) -> System.out.println(student));
    }
}

//An object is a piece of data. Ex. 4
//A class is what type of data that is. Ex. Integer
//Data Types == Classes