package com.biswajit.demospring.error;

public class InvalidCountException extends Exception{
    public InvalidCountException(String message) {
        super(message);
    }
}
