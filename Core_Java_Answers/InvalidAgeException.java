// Exercise 21: Custom Exception
// This custom exception is thrown if the user's age is less than 18.

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}