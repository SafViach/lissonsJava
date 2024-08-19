package lesson023.task4;

import lesson023.task4.model.Person;
import lesson023.task4.model.PersonList;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        final String INPUT = "src"+ File.separator+"lesson023"+File.separator+"task4"+File.separator+"data"+File.separator+"people.txt";;
//        //File.separator - универсальный разделитель каталогов
//        final String OUTPUT = "src"+ File.separator+"lesson023"+File.separator+"task4"+File.separator+"data"+File.separator+"peopleOutput.txt";
//       // List<Person> people = new ArrayList<>();
//        //people.add();
        PersonList personList1 = new PersonList();
        personList1.add(new Person("Petya",20,700));
        personList1.print();
    }
}
