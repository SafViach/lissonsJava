package lesson032._02_predicate;

import lesson032.model.Cat;
import lesson032.model.Color;
import lesson032.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
                new Person("Misha",30,570),
                new Person("Grisha",15,1500),
                new Person("Masha",29,340),
                new Person("Anya",45,840),
                new Person("Nika",55,480)
        ));
        List<Cat> cats = new ArrayList<>(List.of(
                new Cat("Murzik", Color.BLACK,5),
                new Cat("Barsik", Color.GRAY,2),
                new Cat("Marsik", Color.COLOURFUL,3),
                new Cat("Zhuzha", Color.BLACK,4),
                new Cat("Belok", Color.WHILE,2)
        ));

        System.out.println("--------------------сколько людей получает больше 500 р-------------------------------");
        final double salary = 500;
        Predicate<Person> predicate1 = person -> person.getSalary() >salary;
        System.out.println(Utils.countByCondition(people,predicate1));

        System.out.println("---------считаем сколько черных кошек в коллекции -------------------------------------");
        final Color color = Color.BLACK;
        System.out.println(Utils.<Cat>countByCondition(cats,cat -> cat.getColor().equals(color)));

        System.out.println("-----------создаём коллекции по определённым условиям (старше 30-ти) --------------------------------");
        final int age = 30;
        List<Person> subList = Utils.<Person>subListByCondition(people , person -> person.getAge() > age);
        for (Person person : subList) {
            System.out.println(person);
        }





    }
}
