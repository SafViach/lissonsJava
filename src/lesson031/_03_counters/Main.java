package lesson031._03_counters;

import lesson031.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(List.of(
                new Person("Gosha", 45, 750),
                new Person("Igor", 25, 1000),
                new Person("Gosha", 20, 1100),
                new Person("Anya", 32, 450)
        ));

        String name = "Gosha";
        int age = 30;
        double salary = 1000;

        System.out.println(name + ": " + CountersUtil.countName(people, name));
        System.out.println(">" + age + ": " + CountersUtil.countAge(people, age));
        System.out.println("<" + salary + ": " + CountersUtil.countSalary(people, salary));
        System.out.println("-------------------------");
        //пример через анонимный класс
        System.out.println(name + ": " + CountersUtil.countByFieldPerson(people, new CountablePerson() {
            @Override
            public boolean checkByField(Person person) {
                return person.getName().equals(name);//
            }
        }));
        //пример через лямбды
        //если в лябды передается один аргумент, то () можно не указывать
        System.out.println(name + ": " + CountersUtil.countByFieldPerson(people, (Person person) ->
                                                                        {return person.getName().equals(name);}));

        System.out.println(">" + age + ": " +  CountersUtil.countByFieldPerson(people, person ->
                                                                                    person.getAge()>age));

        System.out.println("<" + salary + ": " + CountersUtil.countByFieldPerson(people, person ->
                                                                                        person.getSalary()<salary));


        CountablePerson lambda = person -> person.getSalary() > salary;

        System.out.println(">" + salary + ": " + CountersUtil.countByFieldPerson(people, lambda));




    }
}
