package com.tts;
//Parent - abstract/concrete method
//Child - implement the abs. method
//Make a new obj and call methods
//Abstract Class -> Inheritance -> Override ->add method

//Creating a parent class:
//abstract class parentClassName{
    //abstract void methodName();
    //public void methodName() {body}
// }

//Creating the child class:
//class childClassName extends parentClassName {
    //public void abstractClassName(){body}
// }

//Call method and make new instances of a object in main

 abstract class Cookies { //Parent

     abstract void EatingCookies(); //Declaration of Abstract Method
     public void MakingCookies() { System.out.println("We are making cookies");} //Concrete Method
}

 class Oreos extends Cookies { //Oreos is the child

     //Implementation of abstract method
     public void EatingCookies() {
         System.out.println("We are eating cookies");
     }

}

public class Dessert {
    public static void main(String[] args) {

        Oreos myCookies = new Oreos(); //Creating instance of an object
        myCookies.EatingCookies(); //Calling method on object
        myCookies.MakingCookies(); //Calling method on object
    }
}
