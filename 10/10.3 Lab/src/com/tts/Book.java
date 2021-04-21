package com.tts;

public class Book {

    String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        this.title = bookTitle;
        this.borrowed = false;
    }

    // Marks the book as rented
    public void rented() {
        this.borrowed = true;
    }

    // Marks the book as not rented
    public void returned() {
       this.borrowed = false;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        return this.borrowed;
    }

    // Returns the title of the book
    public String getTitle() {
        return title;
    }

    public void borrowed() {
    }
}