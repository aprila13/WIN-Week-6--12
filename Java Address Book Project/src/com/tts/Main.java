package com.tts;

import java.util.*;

public class Main {
    private static final AddressBook myBook = new AddressBook();
    private static final Scanner input = new Scanner(System.in);
    private static boolean addEntry = false;
    private static boolean removeEntry = false;
    private static boolean searchEntry = false;
    private static boolean printAddressBook = false;
    private static boolean deleteAddressBook = false;
    private static boolean quitTime = false;


    private static void addEntry() {
        System.out.println("1) Add Entry -- Please provide the following information: ");
        System.out.println("First Name: ");
        String firstName = input.nextLine();
        System.out.println("Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Phone Number: ");
        String phoneNumber = input.nextLine();
        System.out.println("Email: ");
        String email = input.nextLine();

        Entry newEntry = Entry.createNewEntry(firstName, lastName, phoneNumber, email);

        try {
            myBook.addEntry(newEntry);
            System.out.println("The following Entry has been added to the AddressBook: ");
            System.out.println(newEntry.toString());
        } catch (InputMismatchException e) {
            System.out.println("Entry not added: " + e.getMessage());
        }
        addEntry = false;
    }

    private static void removeEntry() {
        System.out.println("Please enter the email address of the entry that you would like to remove: ");
        String entryToDelete = input.nextLine();
        System.out.println("Are you sure that you want to remove this Entry?? \n 1) YES, DELETE IT!! \n 2) NO!! PLEASE DO NOT DELETE MY ENTRY!");
        String deleteEntry = input.nextLine();
        switch (deleteEntry) {
            case "1" -> {
                myBook.removeEntry(entryToDelete);
                System.out.println("Your Entry containing " + entryToDelete + " has been DELETED!");
            }
            case "2" -> System.out.println("Your Entry is safe!");
            default -> System.out.println("Invalid Entry!");
        }
        removeEntry = false;
    }

    private static void searchForEntry() {
        System.out.println("""
                Please choose how you would like to Search:\s
                1) FIRST NAME\s
                2) LAST NAME\s
                3) PHONE NUMBER\s
                4) EMAIL""");
        String queryType = input.nextLine();
        System.out.println("Please Enter Your Search Query: ");
        String query = input.nextLine();
        ArrayList<Entry> matches = new ArrayList<>();
        switch (queryType) {
            case "1" -> matches = myBook.searchForEntry(query, AddressBook.SearchType.FIRST_NAME);
            case "2" -> matches = myBook.searchForEntry(query, AddressBook.SearchType.LAST_NAME);
            case "3" -> matches = myBook.searchForEntry(query, AddressBook.SearchType.PHONE_NUMBER);
            case "4" -> matches = myBook.searchForEntry(query, AddressBook.SearchType.EMAIL);
            default -> System.out.println("Please choose a valid Search Option!");
        }
        myBook.printMatches(matches);
        searchEntry = false;
    }

    private static void printAddressBook() {
        myBook.printAddressBook();
        printAddressBook = false;
    }

    private static void deleteAddressBook() {
        System.out.println("Are you sure that you want to Delete your entire AddressBook?? \n 1) YES, DELETE IT ALL!! \n 2) NO!! PLEASE DO NOT DELETE MY ADDRESS BOOK!");
        String deleteInput = input.nextLine();
        switch (deleteInput) {
            case "1" -> myBook.deleteAddressBook();
            case "2" -> System.out.println("Your Address Book is safe!");
            default -> System.out.println("Invalid Entry!");
        }
        deleteAddressBook = false;
    }

    private static void startProgram() {
        System.out.println("""
                ----------------
                | ADDRESS BOOK |
                ----------------
                1) Add an entry
                2) Remove an entry
                3) Search for a specific entry
                4) Print Address Book
                5) Delete Book
                6) Quit
                 \s
                Please choose what you'd like to do with the database:""");
    }

    private static void processMainMenuInput(String input) {
        switch (input) {
            case "1" -> addEntry = true;
            case "2" -> removeEntry = true;
            case "3" -> searchEntry = true;
            case "4" -> printAddressBook = true;
            case "5" -> deleteAddressBook = true;
            case "6" -> quitTime = true;
            default -> System.out.println("************ PLEASE ENTER A VALID OPTION: ************ \n");
        }
    }

    private static void quitProgram() {
        quitTime = true;
    }

    public static void main(String[] args) {
        do {
            startProgram();
            String mainMenuInput = input.nextLine();

            processMainMenuInput(mainMenuInput);
            if (addEntry) {
                addEntry();
            } else if (removeEntry) {
                removeEntry();
            } else if (searchEntry) {
                searchForEntry();
            } else if (printAddressBook) {
                printAddressBook();
            } else if (deleteAddressBook) {
                deleteAddressBook();
            } else if (quitTime) {
                quitProgram();
            }
        } while (!quitTime);
    }
}
