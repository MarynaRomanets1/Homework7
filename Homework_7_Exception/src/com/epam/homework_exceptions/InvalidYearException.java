package com.epam.homework_exceptions;

public class InvalidYearException extends RuntimeException {
    public InvalidYearException(String message) {
        super(message);
        System.out.println("InvalidYearException ");
    }
}
