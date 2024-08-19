package lesson015.task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x1 = 10, x2 = 0, res = 0;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите число");
            x2 = scanner.nextInt();
            res = x1 / x2;
            System.out.println("Результат: " + res);
        } catch (InputMismatchException | ArithmeticException exception) {
            System.out.println("Некорректный ввод или деление на 0");
            System.out.println(exception);
        }
    }
}
