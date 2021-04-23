package com.tts;

public class PersonInfo {
String name;
String street;
String city;
String whiteSpace = "                                 ";

    public PersonInfo(String name, String street, String city) {
        this.name = name;
        this.street = street;
        this.city = city;
    }

//    @Override
//    public String toString() {
//        return "PersonInfo{" +
//                "name='" + name + '\'' +
//                ", street='" + street + '\'' +
//                ", city='" + city + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
       System.out.println(whiteSpace + name);
        System.out.println(whiteSpace + street);
        System.out.println(whiteSpace + city);

        return "";
    }
}
