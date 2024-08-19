package lesson023.task4.model;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    private List<Person> people = new ArrayList<>();

    // метод добавления в Person
    public void add(Person person){
        people.add(person);//метод добавления из коллекции
    }

    public void print(){
        System.out.println("Person List : ");
        for (Person person : people) {
            System.out.println(person);
        }
    }


}
