package com.tts;

import java.util.Locale;
import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "company.com";

    //Constructor to receive first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        //Call a method asking for the department - return the dept.
        //Sets the num returned to the dept variable
        this.department = setDepartment();
        //System.out.println("Dept: " + this.department);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is " + this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "."
                + lastName.toLowerCase() + "@"
                + department + "." + companySuffix;
        //System.out.println("Your email is: " + email);
    }


    //Ask for the department
    private String setDepartment() {
        System.out.println("DEPT. CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter Dept. Code: ");
        Scanner myScanner = new Scanner(System.in);
        int depChoice = myScanner.nextInt();
        if (depChoice == 1) {return "sales";}
        else if (depChoice == 2) {return "dev";}
        else if (depChoice == 3) {return "acct";}
        else {return "none";}
    }

    //Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }


    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    //Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    public String getAlternateEmail() {
        return alternateEmail;
    }
    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName + "\n"
                + "COMPANY EMAIL: " + email + "\n" +
                "MAILBOX CAPACITY: " + mailboxCapacity + "MB";
    }
}
