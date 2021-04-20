package com.tts;

public class Person {

//  Instance Variables or fields or members or properties or class variables
    private String name;
    private int age;
    private String location;

//Constructor. It will set the value of the instance variables
//With all parameters
    public Person(String name, int age, String location) {
        this.name = name; //Data binding
        this.age = age;
        this.location = location;
    }

//Constructor. It will set the value of the instance variables
//With one parameter
    public Person(String name) {
        this.name = name; //Data binding
    }

//Empty or default or noArgs constructor
    public Person() {
    }


//========Methods========
    public void sayHello() {
        System.out.println("Hello " + name);
    }

    public int birthday() {
        return age + 1;
    }

    public int birthYear(int currentYear) {
        int birthYear = currentYear - age;
        return birthYear;
    }


//========Getter + Setter========
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//==========Declaring Methods==========
//Access Modifier, return type, methodName(), code block
//The data type of the return value and the return type must match

//==========Classes==========
//Every Java class is made up of the following parts:

//Instance Variables
//---Instance variables are variables within a class but outside any method

//Local Variables
//---Local  variables are created inside of a method

//Constructors
//---Allows instances of our classes to be created
//---They set up the specifications for each instance

//Methods
//---describes the kind of functionality and behavior of the class.


//==========Access Modifiers==========
//Default: without an access modifier specified, they are accessible only within the same package
//Private: can only be accessed within the class it is declared
//Protected: accessible within the same package or sub classes in different packages
//Public: can be accessed from every where in the program


//==========Constructors==========
//All constructors have the same name as the class
//Parameterized Constructor
//---This type of constructor takes in parameters that will then be used to set the value of your instance values