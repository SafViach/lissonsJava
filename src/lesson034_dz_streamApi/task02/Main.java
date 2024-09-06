package lesson034_dz_streamApi.task02;

import lesson034_dz_streamApi.task02.model.Person;
import lesson034_dz_streamApi.task02.model.UtilsPerson;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //2. Создать класс Person(номер паспорта, имя, возраст, зарплата)
        //2.1 Создать List объектов класса
        //2.2 Получить коллекцию только из имен
        //2.3 Получить коллекцию только из зарплат
        //2.4 Отсортировать и вывести коллекцию по возрастам
        //2.5 Получить подколлекцию List с объектами, возраст которых выше указанного
        //2.6 Получить подколлекцию TreeSet c объектами у которых зп меньше указанной
        //2.7 Собрать из коллекции объектов HashMap (ключ – номер паспорта, значение - имя)
        //2.8 Собрать из коллекции объектов TreeMap(ключ – имя, значение – зп
        //2.9 Найти средний возраст людей
        //2.10 Вычислить общий зарплатный фонд
        //2.11 Найти максимальную зп
        //2.12 Найти минимальную зп среди людей старше указанного возраста
        System.out.println("//2.1 Создать List объектов класса");
        List<Person> peoples = new ArrayList<>(List.of(
                new Person("123456G12PB1","Slava",5000, LocalDate.of(1997,07,07)),
                new Person("654321T12PB2","Vika",3500, LocalDate.of(2000,02,03)),
                new Person("143456G12PB9","Gena",4200, LocalDate.of(1992,12,01)),
                new Person("121256G12PB1","Nastia",3500, LocalDate.of(2005,04,04)),
                new Person("233456G12PB5","Petia",1200, LocalDate.of(1994,02,05)),
                new Person("943456G12PB3","Olga",8000, LocalDate.of(1977,05,17)),
                new Person("323456G12PB5","Andria",2900, LocalDate.of(1987,11,19))
        ));

        System.out.println("2.2 Получить коллекцию только из имен");
        List<String> listNames = UtilsPerson.getListName(peoples);
        listNames.forEach(person -> System.out.print(person +"; "));
        System.out.println();

        System.out.println("2.3 Получить коллекцию только из зарплат");
        List<Double> listSalaries = UtilsPerson.getListSalary(peoples);
        listSalaries.forEach(salary-> System.out.print(salary + "; "));
        System.out.println();

        System.out.println("2.4 Отсортировать и вывести коллекцию по возрастам");
        UtilsPerson.sortByAge(peoples);

        System.out.println("2.5 Получить подколлекцию List с объектами, возраст которых выше указанного");
        List<Person> listByAge = UtilsPerson.getListAgeByInt(peoples , 27);
        listByAge.forEach(System.out::println);

        System.out.println("2.6 Получить подколлекцию TreeSet c объектами у которых зп меньше указанной");
        TreeSet<Person> listBySalary = UtilsPerson.getListBySalary(peoples , 3500);
        listBySalary.forEach(System.out::println);
        System.out.println(listBySalary.getClass().getSimpleName());

        System.out.println("2.8 Собрать из коллекции объектов TreeMap(ключ – имя, значение – зп");
        Map<String , String> map = UtilsPerson.getPassAndNames(peoples);
        map.entrySet().forEach(System.out::println);
        System.out.println(map.getClass().getSimpleName());

        System.out.println("2.8 Собрать из коллекции объектов TreeMap(ключ – имя, значение – зп)");
        Map<String,Double> map2 = UtilsPerson.getNameAndSalary(peoples);
        map2.entrySet().forEach(System.out::println);

        System.out.println("2.9 Найти средний возраст людей");
        String formatedValue = String.format("%.2f",UtilsPerson.avgAge(peoples));
        System.out.println(formatedValue);

        System.out.println("2.10 Вычислить общий зарплатный фонд");
        System.out.println(UtilsPerson.sumFond(peoples));

        System.out.println("2.11 Найти максимальную зп");
        System.out.println(UtilsPerson.findMaxSalary(peoples));

        System.out.println("2.12 Найти минимальную зп среди людей старше указанного возраста");
        System.out.println(UtilsPerson.findMinSalaryByAge(peoples, 31));
    }
}
