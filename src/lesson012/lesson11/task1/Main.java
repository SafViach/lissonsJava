package lesson012.lesson11.task1;

import lesson012.lesson11.task1.model.Color;
import lesson012.lesson11.task1.model.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Igor", Color.BLUE);
        System.out.println(person1);

        String name = null, color = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        name = scanner.nextLine();
        System.out.println("Введите любимый цвет");
        color = scanner.nextLine().toUpperCase();

        Person person2 = new Person(name, Color.valueOf(color));
        System.out.println(person2);
        person2.setColor(Color.GREEN);


    }
}
