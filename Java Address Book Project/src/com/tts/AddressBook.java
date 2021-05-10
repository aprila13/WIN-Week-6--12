package com.tts;

import java.util.ArrayList;

public class AddressBook {
    ArrayList<Entry> addressBook = new ArrayList<>();

    public enum SearchType {
        FIRST_NAME,
        LAST_NAME,
        PHONE_NUMBER,
        EMAIL
    }

    public void addEntry(Entry entry) {
        ArrayList<Entry> emailMatches = searchForEmail(entry.getEmail());
        if (emailMatches.isEmpty()) {
            try {
                addressBook.add(entry);
            } catch (NullPointerException e) {
                System.out.println("Your address book is empty");
            }
        } else {
            System.out.println("This email address is already in the Address Book-- \n Please use a newnique email!");
        }
    }

    public void removeEntry(String email) {
        ArrayList<Entry> matches = searchForEmail(email);
        if (matches.isEmpty()) {
            System.out.println("This Entry does not exist in the Address Book");
        } else {
            for (Entry match : matches) {
                addressBook.remove(match);
                break;
            }
        }
    }

    public ArrayList<Entry> searchForFirstName(String searchQuery) {
        ArrayList<Entry> matchList = new ArrayList<>();
        for (Entry entry : addressBook) {
            if (entry.getFirstName().contains(searchQuery)) {
                matchList.add(entry);
            }
        }
        return matchList;
    }

    public ArrayList<Entry> searchForLastName(String searchQuery) {
        ArrayList<Entry> matchList = new ArrayList<>();
        for (Entry entry : addressBook) {
            if (entry.getLastName().contains(searchQuery)) {
                matchList.add(entry);
            }
        }
        return matchList;
    }

    public ArrayList<Entry> searchForPhoneNumber(String searchQuery) {
        ArrayList<Entry> matchList = new ArrayList<>();
        for (Entry entry : addressBook) {
            if (entry.getPhoneNumber().contains(searchQuery)) {
                matchList.add(entry);
            }
        }
        return matchList;
    }

    public ArrayList<Entry> searchForEmail(String searchQuery) {
        ArrayList<Entry> matchList = new ArrayList<>();
        for (Entry entry : addressBook) {
            if (entry.getEmail().contains(searchQuery)) {
                matchList.add(entry);
            }
        }
        return matchList;
    }

    public ArrayList<Entry> searchForEntry(String searchQuery, SearchType searchType) {
        ArrayList<Entry> matchList = new ArrayList<>();
        switch (searchType) {
            case FIRST_NAME -> {
                matchList = searchForFirstName(searchQuery);
                if (matchList.isEmpty()) {
                    System.out.println("There is no entry matching your search");
                }
            }
            case LAST_NAME -> {
                matchList = searchForLastName(searchQuery);
                if (matchList.isEmpty()) {
                    System.out.println("There is no entry matching your search");
                }
            }
            case PHONE_NUMBER -> {
                matchList = searchForPhoneNumber(searchQuery);
                if (matchList.isEmpty()) {
                    System.out.println("There is no entry matching your search");
                }
            }
            case EMAIL -> {
                matchList = searchForEmail(searchQuery);
                if (matchList.isEmpty()) {
                    System.out.println("There is no entry matching your search");
                }
            }
            default -> System.out.println("Please choose one of the criteria to search with");
        }
        return matchList;
    }

    public void printMatches(ArrayList<Entry> matchList) {
        for (Entry entry : matchList) {
            System.out.println(entry.toString());
        }
    }

    public void printAddressBook() {
        if (addressBook.isEmpty()) {
            System.out.println("You have no entries in your Address Book!");
        } else {
            System.out.println("**** CURRENT ADDRESS BOOK: ****");
            for (Entry entry : addressBook) {
                System.out.println(entry.toString());
            }
        }
    }

    public void deleteAddressBook() {
        if (addressBook.isEmpty()) {
            System.out.println("The Address Book is already empty");
        } else {
            addressBook.clear();
        }
    }
}