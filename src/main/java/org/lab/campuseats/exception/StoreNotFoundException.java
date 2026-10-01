package org.lab.campuseats.exception;

/** Local inexistente -> 404 */
public class StoreNotFoundException extends NotFoundException {
    public StoreNotFoundException(String message) {
        super(message);
    }
}
