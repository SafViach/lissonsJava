package lesson032._03_fanction;

import lesson032._02_predicate.Utils;
import lesson032.model.Cat;
import lesson032.model.Color;
import lesson032.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
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

        System.out.println("---------из колеекции людей получить возраста людей---------------------");
        Function<Person , Integer> function = person -> person.getAge();
        List<Integer> ages = UtilsFunction.getList(people , function);
        System.out.println(ages);

        System.out.println("--------собрать клички котов----------");

        Function<Cat , String> function2 = cat -> cat.getNickname();
        List<String> nickNames = UtilsFunction.getList(cats,function2);
        System.out.println(nickNames);

        // ПРИ ПОМОЩИ ЛЯМБД УМНОЖИТЬ ЗП В 2 РАЗА
        Function<Person , Person> function3 = person -> {person.setSalary(person.getSalary()*2);return person;};
        people = UtilsFunction.getList(people,function3);
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("----------------------");
        //создать новую коллекцию котов у которых вес в 2 раза больше
        UnaryOperator<Cat> unaryOperator = cat -> new Cat(cat.getNickname() , cat.getColor() , cat.getWeight()*2);
        List<Cat> fatCats = UtilsFunction.getList(cats , unaryOperator);
        for (Cat fatCat : fatCats) {
            System.out.println(fatCat);
        }
    }
}
