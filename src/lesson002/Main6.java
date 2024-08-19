package lesson002;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        //для считывания из консоли нам необходимо создать объект клласса,
        //связанный с консолью
        // new операция динамического выделения памяти (создание объекта)
        //Scanner класс для считывания из чего угодно
        Scanner scanner = null;//создали ссылку для хранения адреса объекта
        //и она не хранит никакой адрес (ни на что не указывает)
        scanner = new Scanner(System.in);//создаем объект для считвания из
        //консоли
        //Scanner scanner = new Scanner(System.in); можно было создать сразу так
        int age = 0;
        System.out.println("Введите возраст");
        age = scanner.nextInt();
        System.out.println("Введенный возраст: " + age);
        String name = null;
        scanner.skip("\n");//после ввода числа перед вводом строки, чтобы проигноривать лишний символ
        //enter в потоке
        System.out.println("Введите имя");
        name = scanner.nextLine();
        System.out.println("Введенное имя: " + name);
        System.out.println("Введите возраст");
        age = scanner.nextInt();
        System.out.println("Введенный возраст: " + age);

    }
}
