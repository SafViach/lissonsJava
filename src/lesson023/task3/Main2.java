package lesson023.task3;

import lesson023.task3.model.Person;

import java.io.File;

public class Main2 {
    public static void main(String[] args) {
        final String INPUT = "src/lesson023/task3/data/input.txt";
        //File.separator - универсальный разделитель каталогов
        final String OUTPUT = "src"+ File.separator+"lesson023"+File.separator+"task3"+File.separator+"data"+File.separator+"output.txt";
        Person person = Person.loadPersonFromFile(INPUT);//должен быть вызов метода который считает инфу из файла , создаст обьект и вернет его;
        System.out.println(person);

        Person.savePersonToFile(person,OUTPUT);
    }
}
