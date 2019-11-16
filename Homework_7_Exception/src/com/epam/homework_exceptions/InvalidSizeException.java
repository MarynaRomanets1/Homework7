package com.epam.homework_exceptions;

public class InvalidSizeException extends RuntimeException {
    public InvalidSizeException(String message) {
        super(message);
        System.out.println("InvalidSizeException ");
    }
}
