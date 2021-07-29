package com.company.sak.hw4.exception;

public class NoFileException extends Exception {
    public NoFileException() {
        super("Файл не найден");
    }

    public NoFileException(String message) {
        super(message);
    }

    public NoFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoFileException(Throwable cause) {
        super(cause);
    }
}
