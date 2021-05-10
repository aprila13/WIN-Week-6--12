package com.tts;

public class Entry {
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String email;

    private Entry(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public static Entry createNewEntry(String firstName, String lastName, String phoneNumber, String email){
        return new Entry(firstName, lastName, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "************************************" + '\n' +
                "First Name= " + firstName + '\n' +
                "Last Name = " + lastName + '\n' +
                "Phone Number = " + phoneNumber + '\n' +
                "Email = " + email + '\n' +
                "************************************" + '\n';
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmail(){
        return email;
    }
}
