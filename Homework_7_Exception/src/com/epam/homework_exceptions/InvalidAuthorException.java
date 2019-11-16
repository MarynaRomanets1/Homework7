package com.epam.homework_exceptions;

import java.io.IOException;

public class InvalidAuthorException extends RuntimeException {
    public InvalidAuthorException(String message) {
        super(message);
        System.out.println("InvalidAuthorException ");
    }
}
