package com.tts;

//Abstract classes have variables and methods that can be used to make other classes
//Abstract classes can have abstract and concrete methods
//Interfaces can only have abstract methods which are implemented in Chihuahua class

abstract class Dog {  //Parent

    public void bark() {  //method of the abstract class
        System.out.println("Bark!!");
    } //Method - Concrete

    public abstract void poop(); //Abstract method
}

class Chihuahua extends Dog {  //Chihuahua inherits from dog. Child
    public void poop() {
        System.out.println("Dog pooped!"); //Poop method is being implemented here
    }
}



public class AbstractTutorial {
    public static void main(String[] args) {

        //Obj variableName = new Obj();
        Chihuahua myDog = new Chihuahua(); //The new instance must come from child class
        myDog.bark(); //You can still use the methods of the Dog class
        myDog.poop();
    }
}
