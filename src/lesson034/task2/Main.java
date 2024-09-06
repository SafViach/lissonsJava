package lesson034.task2;

import lesson034.task2.model.Person;
import lesson034.task2.model.PersonUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(List.of(
                new Person("1111H222PB1", "Vasya", 45, 1000),
                new Person("2222H333PB3", "Igor", 20, 1500),
                new Person("3333H443PN8", "Ira", 60, 500),
                new Person("1456H262PB1", "Sasha", 26, 300),
                new Person("8523H222PB1", "Ilya", 32, 700),
                new Person("7456A255PB1", "Vasya", 18, 550),
                new Person("7854H227PB1", "Kira", 41, 2000),
                new Person("1847H212PB1", "Rita", 52, 1900)
        ));

        //2.1

        List<String> names = PersonUtils.getNames(people);
        System.out.println(names);

        //2.2

        List<Double> salaries = PersonUtils.getSalaries(people);
        System.out.println(salaries);

        //2.4 Отсортировать и вывести коллекцию по возрастам
        System.out.println("---------------");
        PersonUtils.printSortedPeople(people);

        //2.5 Получить подколлекцию List с объектами, возраст которых выше указанного
        System.out.println("--------------------");
        List<Person> subList1 = PersonUtils.getByAge(people, 30);
        subList1.forEach(System.out::println);

        //2.6 Получить подколлекцию TreeSet c объектами у которых зп меньше указанной
        System.out.println("----------------------");
        Set<Person> subSet1 = PersonUtils.getBySalary(people, 1000);
        subSet1.forEach(System.out::println);

        //2.7 Собрать из коллекции объектов HashMap (ключ – номер паспорта, значение - имя)

        System.out.println("-------------------");
        Map<String, String> map1 = PersonUtils.getPassAndNames(people);
        map1.entrySet().forEach(System.out::println);

        //2.8 Собрать из коллекции объектов TreeMap(ключ – имя, значение – зп

        System.out.println("--------------------------");
        Map<String, Double> map2 = PersonUtils.getNamesAndSalaries(people);
        map2.entrySet().forEach(System.out::println);

        //2.9 Найти средний возраст людей
        System.out.println("----------------------");
        System.out.println(PersonUtils.avgAge(people));

    }
}
