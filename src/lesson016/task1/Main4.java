package lesson016.task1;

import lesson016.task1.exceptions.CreateFactorialException;
import lesson016.task1.model.MyMath;

public class Main4 {
    public static void main(String[] args) {
        MyMath.Factorial factorial1 = null;
        try {
            factorial1 = new MyMath.Factorial(5);
        } catch (CreateFactorialException e) {
            System.out.println(e);
        }
        System.out.println(factorial1);

        MyMath.Factorial factorial2 = null;
        try {
            factorial2 = new MyMath.Factorial(-5);
        } catch (CreateFactorialException e) {
            System.out.println(e);
        }
        System.out.println(factorial2);



    }
}
