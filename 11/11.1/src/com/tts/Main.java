package com.tts;


//Overriding is when the child does a different implementation of a method inherited from the parent.
public class Main {

    public static void main(String[] args) {
//        Woman April = new Woman();
//        April.Walking();
//
//        Person Mike = new Person();
//        Mike.Walking();

        //New instance of an object
        //Used override for the isDriving method since the implementation is different here..
        Cars car1 = new Cars("Honda", "Civic", 2019) {
            @Override
            void isDriving() {
                System.out.println("This car is driving");
            }
        };

        //calling the parent + method that was overrode above
        car1.isDriving();

        //Calling the child and setting the values
        Coupes coupe1 = new Coupes();
        coupe1.setMake("BMW");
        coupe1.setModel("fancy coupe");
        coupe1.setYear(2021);
        System.out.println(coupe1.toString());

    }
}
