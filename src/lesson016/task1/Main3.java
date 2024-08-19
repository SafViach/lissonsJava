package lesson016.task1;

import lesson016.task1.exceptions.NegativeFactorialValueException;
import lesson016.task1.model.MyMath;

public class Main3 {
    public static void main(String[] args) {
        //объект вложенного класса
        MyMath.Factorial factorial1 = new MyMath.Factorial();


        System.out.println(factorial1);
        try {
            factorial1.setValue(5);
            System.out.println(factorial1);
        } catch (NegativeFactorialValueException e) {
            System.out.println(e);
        }

        try {
            factorial1.setValue(-5);
            System.out.println(factorial1);
        } catch (NegativeFactorialValueException e) {
            System.out.println(e);
        }

    }
}
