package net.maks.exceptions;


public class ArgumentListTooShortException extends Exception {
    public ArgumentListTooShortException(int expected_length, int given_length) {
        super("Given argument list is too short. Expected: " + expected_length + ", Given: " + given_length);
    }
}
