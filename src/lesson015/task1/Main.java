package lesson015.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x1 = 10, x2 = 0, res = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        x2 = scanner.nextInt();

        try {
            res = x1 / x2;//throw new ArithmeticException("/ by zero")
            System.out.println("Результат: " + res);
        } catch (ArithmeticException exception) {//ArithmeticException exception = исключение выше
            System.out.println("Деление на 0!");
            System.out.println(exception);//toString()
            System.out.println(exception.getMessage());//строка, которую указали в конструкторе
            //при создании объекта исключения
            exception.printStackTrace();//выводится информация о цепочке методов и строках в них с
            //ошибками
            x2 = 1;
        }

    }
}
