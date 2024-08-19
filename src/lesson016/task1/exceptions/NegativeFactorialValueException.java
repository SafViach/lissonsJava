package lesson016.task1.exceptions;

public class NegativeFactorialValueException extends Exception{
    private int val;

    public NegativeFactorialValueException(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " negative value: " + val;
    }
}
