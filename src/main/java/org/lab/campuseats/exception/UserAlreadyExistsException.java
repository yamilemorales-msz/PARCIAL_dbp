package org.lab.campuseats.exception;

/** POST /auth/register con username o email repetido -> 409 */
public class UserAlreadyExistsException extends ConflictException {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
