package lesson031._01_comparator;

import lesson031.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(List.of(
                new Person("Gosha", 45, 750),
                new Person("Igor", 25, 1000),
                new Person("Gosha", 20, 1100),
                new Person("Anya", 32, 450)
        ));

//        Collections.sort(people); сортировка естественным порядком compareTo
//
//        for (Person person : people) {
//            System.out.println(person);
//        }

//        Comparator cmp = new PersonNameComparator();//сортировка через объект класса, реализующего интерфейс Comparator
//        Collections.sort(people, cmp);
//        for (Person person : people) {
//            System.out.println(person);
//        }

        //при указании компаратора создали объект анонимного класса, который имплементирует интерфейс Comparator
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getAge() - person2.getAge();
            }
        });


        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("---------------------------------------");

        Comparator<Person> cmp = new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return Double.compare(person1.getSalary(), person2.getSalary());
            }
        };
        Collections.sort(people, cmp);
        // я практиковал с аннонимным классом и делаю вывод это это нпе так уж и сложно
        // что я сделал я обратился к классу преднозначенной для коллекций и далее вызвал метод сорт который сортирует обьекты
        // принимая два аргумента - это саму нашу коллекцию и обьекст типа Comparator
        // я и отправляю в сорт 2 аргумента 1 коллекцию мою и создаю на лету аннонимный класс  где параметризую его Person
        // и переопределяю метод comare передавая два аргумента
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("--------------------");
        for (Person person : people) {
            System.out.println(person);
        }


    }
}
