package com.tts.demo.controller;

public class BookIdMismatchException extends Throwable {

    public BookIdMismatchException() {
        super();
    }

    public BookIdMismatchException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public BookIdMismatchException(final String message) {
        super(message);
    }

    public BookIdMismatchException(final Throwable cause) {
        super(cause);
    }
}
