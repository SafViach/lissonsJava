package lesson016.task6;

import lesson016.task6.model.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Period;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = null;
        Person[] people = new Person[3];
        int index = 0;

        try {
            scanner = new Scanner(new File("src/in.txt"));

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
        } finally {//обычно используется для закрытия ресурсов открытх в try
            if (scanner != null) {//если была открыта связь с фйлом
                scanner.close();//то закрываем
            }
        }


    }
}
