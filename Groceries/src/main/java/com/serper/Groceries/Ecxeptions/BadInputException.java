package com.serper.Groceries.Ecxeptions;

public class BadInputException extends RuntimeException {
    public BadInputException(String message) {
        super(message);
    }
}
