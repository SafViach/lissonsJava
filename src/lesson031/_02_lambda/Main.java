package lesson031._02_lambda;

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

        //лямбда выражения - упрощенная запись анонимного класса
        //общий вид (список параметров метода) -> {тело метода}

        //лямбды описывать где угодно нельзя
        //лямбды описываются при записи их результат в ссылку соответствующего типа
        //(Person person1, Person person2) -> {return person1.getAge()-person2.getAge();}

        //сразу передали в compare интерфейса Comparator параметры и описали тело
        Collections.sort(people, (Person person1, Person person2) -> {return person1.getAge()-person2.getAge();});
        for (Person person : people) {
            System.out.println(person);
        }

        //лямбды могут работать только для функциональных интерфейсов(интерфейс с единственным абстрактным методом)

        System.out.println("-------------------------");
        Collections.sort(people, (person1, person2) -> Double.compare(person1.getSalary(), person2.getSalary()));
        for (Person person : people) {
            System.out.println(person);
        }

    }
}
