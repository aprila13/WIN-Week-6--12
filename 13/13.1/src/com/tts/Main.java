package com.tts;

import java.lang.reflect.Array;
import java.time.LocalDate;

//Main Class
public class Main {

    //Person class (within Main)
    static class Person {
        String name;
        int age;

        //Person Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    } //****Person class ends here


    //main method
    //An instance of the Person object can run here since it is static just like the main method

    public static void writeDate(){

        //Java Date Object. Imported at top.
        LocalDate todayDate = LocalDate.now();
        System.out.println(todayDate); //2021-05-10
        System.out.println("IT IS " + todayDate.getDayOfWeek() + " " +
                todayDate.getMonth() + " " +
                todayDate.getDayOfMonth() + " " +
                todayDate.getYear());

    }


    public static void main(String[] args) {
        //***********
        Person person1 = new Person("April", 34);
        System.out.println(person1.name);

        //***********
        writeDate();

        //***********
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.run();
    }
}
