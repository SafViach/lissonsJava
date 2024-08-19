package lesson016.task1.exceptions;

//пример исключения срабатывающего по причене другого исключения
public class CreateFactorialException extends Exception{

    //принимает другое уже сгенерированное исключение
    public CreateFactorialException(Throwable cause) {
        super(cause);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " по причине: " + getCause();
    }
}
