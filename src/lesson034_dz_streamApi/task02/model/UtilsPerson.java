package lesson034_dz_streamApi.task02.model;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class UtilsPerson {

    public static List<String> getListName (List<Person> people){
        List<String> listName = people.stream()
                .map(person -> person.getName())
                .collect(Collectors.toList());
        return listName;
    }

    public static List<Double> getListSalary(List<Person> people){
        List<Double> listSalaries = people.stream()
                .map(person -> person.getSalary())
                .collect(Collectors.toList());
        return listSalaries;
    }

    public static void sortByAge(List<Person>people){
        people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);
    }

    public static List<Person> getListAgeByInt(List<Person> people , int age){
        List<Person> listAge = people.stream()
                .filter(person -> person.getAge() >= age)
                .collect(Collectors.toList());
        return listAge;
    }

    public static TreeSet<Person> getListBySalary(List<Person> people , double salary){
        TreeSet<Person> subList = people.stream()
                .filter(person -> person.getSalary() <= salary)
                .collect(Collectors.toCollection(()->new TreeSet<>(Comparator.comparing(Person::getName).thenComparing(Person::getSalary))));
        return subList;
    }

    public static Map<String , String> getPassAndNames(List<Person> people){
        Map<String , String> map = people.stream()
                .collect(Collectors.toMap(person -> person.getPassword(),person -> person.getName()));
        return map;
    }

    public static Map<String,Double> getNameAndSalary(List<Person>people){
        Map<String , Double> treeMap = people.stream()
                .collect(Collectors.toMap(person -> person.getName(),
                        person -> person.getSalary(),
                        (salaey1,salary2)->salary2,//при одинаковых ключах в знач. запишется зарплата нового person
                        ()->new TreeMap<>()));
        return treeMap;
    }

    public static double avgAge(List<Person>people){
        double avgAge = people.stream()
                .mapToInt(person -> person.getAge())
                .average()
                .getAsDouble();
        return avgAge;
    }

    public static Double findMaxSalary(List<Person> people){
       Person person =  people.stream()
                .max(Comparator.comparing(Person::getSalary)).get();
        return person.getSalary();
    }

    public static double sumFond(List<Person> people){
        double sumFond = people.stream()
                .mapToDouble(person -> person.getSalary())
                .reduce((person, person2) -> person + person2).getAsDouble();
        return sumFond;
    }

    public static double findMinSalaryByAge(List<Person> people , int age){
        double minSalary = people.stream()
                .filter(person -> person.getAge() >= age)
                .mapToDouble(person -> person.getSalary())
                .min().getAsDouble();
        return minSalary;
    }
    
}
