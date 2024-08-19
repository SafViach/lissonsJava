package lesson015.task3;

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
        } catch (InputMismatchException exception) {
            System.out.println("Некорректный ввод");
            System.out.println(exception);
        }catch (ArithmeticException exception){
            System.out.println("Деление на 0!");
            System.out.println(exception);
        }catch (Exception exception){
            System.out.println("Произошла какая-то ошибка");
            System.out.println(exception);
        }

    }
}
