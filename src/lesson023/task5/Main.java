package lesson023.task5;

import lesson023.task5.model.Person;
import lesson023.task5.model.PersonReaderWriter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final String delimeter = File.separator;
        final String INPUT= "src" + delimeter +"lesson023"+delimeter+"task5"
                +delimeter+"data"+delimeter+"input.txt";
        final String OUTPUT= "src" + delimeter +"lesson023"+delimeter+"task5"
                +delimeter+"data"+delimeter+"output.txt";
        List<Person> people = new ArrayList<>();
        people.addAll(PersonReaderWriter.loadFromFile(INPUT));
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println("-----------------------------");
        PersonReaderWriter.saveToFile(people,OUTPUT);

    }
}
