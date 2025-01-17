package ru.surikov.exceptions;

public class PrefixNotFoundException extends RuntimeException {
    public PrefixNotFoundException(String message) {
        super(message);
    }
}
