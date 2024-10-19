package ru.practicum.exception;

public class InvalidDateTimeException extends Exception {

    private String message;

    public InvalidDateTimeException(String message) {
        super(message);
    }
}