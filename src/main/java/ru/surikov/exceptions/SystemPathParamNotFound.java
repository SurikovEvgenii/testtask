package ru.surikov.exceptions;

public class SystemPathParamNotFound extends RuntimeException {
    public SystemPathParamNotFound(String message) {
        super(message);
    }
}
