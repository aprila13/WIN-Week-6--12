package com.tts;

//Assessment Review
//4 Principles of OOP
// -A PIE
// -Abstraction
// -Polymorphism
// -Inheritance
// -Encapsulation
public class Main {
    //Write in here if you want

    public static void main(String[] args) {
        //Everything is called here

        Fruits apples = new Fruits("Fiji Apples", "Apple", "Upstate New York", 1);
        System.out.println(apples);
        apples.setName("Gala Apples");
        System.out.println(apples.getName()); //Only a getter will print without toString
        System.out.println(apples);
        System.out.println(apples.toString());
    }

}

    //Instantiating rockyPlanet.  Constructor is directly invoked.
//        RockyPlanet earth = new RockyPlanet();
//        earth.setDistanceFromSun(96_000_000L);
//        System.out.println("Here is the distance of the Sun from Earth: " + earth.getDistanceFromSun());

//    Mickey mickeyMouse = new Mickey();
//    mickeyMouse.MouseColor("red");
//            mickeyMouse.LeftClick();
//            mickeyMouse.RightClick();
//            mickeyMouse.Scroll();