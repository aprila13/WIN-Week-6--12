package com.tts;

import java.util.ArrayList;

public class Library {
    // Add the missing implementation to this class

    //edu.Bootcamp.Library Addresses
    String libraryAddress;

    //Array for Books
    ArrayList<Book> books;

    //Method to address and books
    public Library(String address) {
        libraryAddress = address;
        books = new ArrayList<Book>();
    }

    //Method for adding book to books
    public void addBook(Book book) {
        books.add(book);
    }

    //Method to print addresses
    public void printAddress() {
        System.out.println(libraryAddress);
    }

    // Method for printing available books
    public void printAvailableBooks() {
        Book libraryBook;
        boolean libraryIsEmpty = true;

        // Enhanced for loop
        for(int i=0; i<books.size(); i++) {
            libraryBook = books.get(i);

            if(!(libraryBook.isBorrowed())){
                System.out.println(libraryBook.getTitle());
                libraryIsEmpty = false;
            }
        } if(libraryIsEmpty){
            System.out.println("Sorry, our catalog is empty");
        }
    }

    // Method for borrowing a book
    public String borrowBook(String bookTitle) {
        Book libraryBook;
        String libraryBookTitle;

        for(int i = 0; i < books.size(); i++) {
            libraryBook = books.get(i);
            libraryBookTitle = libraryBook.getTitle();

            if(libraryBookTitle.equals(bookTitle)) {
                if(!(libraryBook.isBorrowed())) {
                    libraryBook.borrowed();
                    System.out.println("You have successfully borrowed " + libraryBookTitle + ".");
                    return null;
                } else {
                    System.out.println("Sorry, " + libraryBookTitle + "is already borrowed.");
                    return null;
                }
            }
        }
        System.out.println("Sorry, this book is not in our catalog.");
        return null;
    }


    // Method for returning a book
    public String returnBook(String bookTitle) {
        Book libraryBook;
        String libraryBookTitle;
        boolean found = false;

        for (int i = 0; i < books.size(); i++) {
            libraryBook = books.get(i);
            libraryBookTitle = libraryBook.getTitle();

            if (libraryBookTitle.equals(bookTitle)) {

                if (libraryBook.isBorrowed()) {
                    libraryBook.returned();
                    System.out.println("You successfully returned " + libraryBookTitle + "!");
                    found = true;
                    break;
                }

                if (!found) {
                    System.out.println("Are you sure you got the book from here? It isn't in our system.");
                }
            }
        }
        System.out.println();
        return null;
    }
}
