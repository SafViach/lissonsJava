package lesson012.lesson12._03_comparable;

import lesson012.lesson12._03_comparable.model.Person;
import lesson012.lesson12._03_comparable.model.Pet;
import lesson012.lesson12._03_comparable.model.TV;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TV[] tvs = {
                new TV(1500),
                new TV(2500),
                new TV(1400)
        };

        //sort умеет сортировать объекты класса, которые
        //реализуют интерфейс Comparable, так внутри этот метод пытается каждый объект
        //явно преобразовать к типу Comparable и вызвать метод compareTo

        Arrays.sort(tvs);
        for (TV tv : tvs) {
            System.out.println(tv);
        }

        System.out.println("-----------------------");

        Pet[] pets = {
                new Pet(3.5),
                new Pet(2.1),
                new Pet(3.2)
        };

        Arrays.sort(pets);

        for (Pet pet : pets) {
            System.out.println(pet);
        }

        System.out.println("----------------------------");
        Person[] people = {
                new Person("Zoya", 25, 1000),
                new Person("Alena", 20, 1500),
                new Person("Zoya", 21, 500),
                new Person("Kolya", 20, 800),
                new Person("Zoya", 21, 400)
        };

        Arrays.sort(people);
        for (Person person : people) {
            System.out.println(person);
        }

    }
}
