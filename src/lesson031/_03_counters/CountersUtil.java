package lesson031._03_counters;

import lesson031.model.Person;

import java.util.List;

public class CountersUtil {

    //параметризация метода прописывается перед типом
    public static <T> int countByFieldGeneric(List<T> list, Countable<T> lambda){
        int counter = 0;
        for (T object : list) {
            if(lambda.checkByField(object))
                counter++;
        }
        return counter;
    }


    //в ссдку lambda должен придти объект, класс которого имлпментирует интерфейс CountablePerson
    //и переопределяет метод checkByField
    //мы сюда будем передавать лямбду, что является упрощенной записью анонимного класса
    public static int countByFieldPerson(List<Person> personList, CountablePerson lambda){
        int counter = 0;
        for (Person person : personList) {
            if(lambda.checkByField(person))
                counter++;
        }
        return counter;
    }

    public static int countName(List<Person> personList, String name) {
        int counter = 0;
        for (Person person : personList) {
            if (person.getName().equals(name))
                counter++;
        }
        return counter;
    }

    //подсчитывает кол-во людей старше указанного возраста
    public static int countAge(List<Person> personList, int age) {
        int counter = 0;
        for (Person person : personList) {
            if (person.getAge() > age)
                counter++;
        }
        return counter;
    }

    //подсчитывает кол-во людей с зп меньше указанной
    public static int countSalary(List<Person> personList, double salary) {
        int counter = 0;
        for (Person person : personList) {
            if (person.getSalary() < salary)
                counter++;
        }
        return counter;
    }

}
