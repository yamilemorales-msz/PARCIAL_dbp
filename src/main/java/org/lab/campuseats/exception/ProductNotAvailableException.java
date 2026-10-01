package org.lab.campuseats.exception;

public class ProductNotAvailableException extends ConflictException {
    public ProductNotAvailableException(String message) {
        super(message);
    }
}
