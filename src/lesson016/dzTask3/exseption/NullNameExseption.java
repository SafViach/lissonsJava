package lesson016.dzTask3.exseption;

public class NullNameExseption extends Exception{

    @Override
    public String toString() {
        return getClass().getSimpleName() + " по причине: " + getCause();
    }
}
