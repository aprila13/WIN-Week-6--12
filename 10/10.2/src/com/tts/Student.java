package com.tts;

//Student takes on the instance variables and methods from the Person class.

public class Student extends Person {
    private int gradYear;
    private boolean enrolled = false; //default value

    public Student(String name, int age, String location, int gradYear, boolean enrolled) {
        super(name, age, location);
        this.gradYear = gradYear;
    }

//Method that changes enrolled to true
    void enrolledStudent() {
        enrolled = true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + super.getName() +
                ", gradYear=" + gradYear +
                ", enrolled=" + enrolled +
                '}';
    }
}
