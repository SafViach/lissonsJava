package lesson016.task6;

import lesson016.task6.model.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Person[] people = new Person[3];
        int index = 0;

        //try with resources
        //автоматически закрывает ресурс описанный в круглых скобках try
        try (Scanner scanner = new Scanner(new File("src/in.txt"))){

            while (scanner.hasNext()) {//если есть линия файла для считывания
                String fileLine = scanner.nextLine();//"Igor 500"
                String[] fields = fileLine.split(" ");//разбиваем строку на массив строк
                //"Igor", "500"
                people[index++] = new Person(fields[0], Double.valueOf(fields[1]));
            }

            for (Person person : people) {
                System.out.println(person);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Такого файла нет");
        }
    }
}
