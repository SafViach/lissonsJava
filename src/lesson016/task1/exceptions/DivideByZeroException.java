package lesson016.task1.exceptions;

public class DivideByZeroException extends Exception{
    public DivideByZeroException() {
    }

    public DivideByZeroException(String message) {
        super(message);
    }
}
