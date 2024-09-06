package lesson034.task2.model;

import java.util.*;
import java.util.stream.Collectors;

public class PersonUtils {
    public static List<String> getNames(List<Person> people) {

        //из стриа Person получаем стрим String и потом заворачиваем в коллекцию
        List<String> names = people.stream()
                .map(person -> person.getName())//лямба
                .collect(Collectors.toList());
        return names;
    }

    public static List<Double> getSalaries(List<Person> people) {
        List<Double> salaries = people.stream()
                .map(Person::getSalary)//ссылка на метод
                .collect(Collectors.toList());
        return salaries;
    }

    public static void printSortedPeople(List<Person> people) {

        //лямбда содающщая Comparator
//        people.stream()
//                .sorted((person1, person2) -> person1.getAge() - person2.getAge())
//                .forEach(System.out::println);
//
        //лямбда создающая Funtion которы отправляет в comparing, который создает Comparator
//        people.stream()
//                .sorted(Comparator.comparing(person -> person.getAge()))
//                .forEach(System.out::println);

        people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);

    }


    public static List<Person> getByAge(List<Person> people, int age) {
        List<Person> subList = people.stream()
                .filter(person -> person.getAge() > age)
                .collect(Collectors.toList());
        return subList;
    }

    public static Set<Person> getBySalary(List<Person> people, double salary) {
        Comparator<Person> cmp = (person1, person2)-> person1.getPassNumber().compareTo(person2.getPassNumber());

        //сначало по имена, при одинаковых именах по зп
       // Comparator<Person> cmp1 = Comparator.comparing(Person::getName).thenComparing(Person::getSalary);

        Set<Person> subList = people.stream()
                .filter(person -> person.getSalary() < salary)
                .collect(Collectors.toCollection(() -> new TreeSet<>(cmp)));//строим дерево по ном паспорта
        return subList;
    }


    public static Map<String, String> getPassAndNames(List<Person> people){

        Map<String, String> map = people.stream()
                .collect(Collectors.toMap(person -> person.getPassNumber(), person-> person.getName()));
        return map;
    }

    public static Map<String, Double> getNamesAndSalaries(List<Person> people){

        Map<String, Double> map = people.stream()
                .collect(Collectors.toMap(person -> person.getName(),//ключ
                        person -> person.getSalary(),//значение
                        (salary1, salary2) -> salary2,//при одинаковых ключах(имена) в значение запишется зарплата нового
                        ()-> new TreeMap<>()));//построится по ключу (имя типа String)
        return map;
    }

    public static double avgAge(List<Person> people){

        return people.stream()
                .mapToInt(person -> person.getAge())
                .average().getAsDouble();

    }

}
