package com.serper.Groceries.Ecxeptions;

public class BanInputException extends RuntimeException {
    public BanInputException(String message) {
        super(message);
    }
}
