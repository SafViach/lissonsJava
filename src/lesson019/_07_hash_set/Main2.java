package lesson019._07_hash_set;

import lesson019.model.Person;

import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        Set<Person> set1 = new HashSet<>();

        //ПЕРЕД ТЕМ КАК ХРАНИТЬ ОБЪЕКТЫ В HASHSET ОБЯЗАТЕЛЬНО В КЛАССЕ
        //ДОЛЖНЫ БЫТЬ ПЕРЕОБРЕДЕЛЕНЫ МЕТОДЫ EQUALS И HASHCODE
        set1.add(new Person("Igor", 500));
        set1.add(new Person("Vasya", 700));
        set1.add(new Person("Ira", 300));
        set1.add(new Person("Grisha", 450));

        for (Person person : set1) {
            System.out.println(person + " " + person.hashCode());
        }

        System.out.println("--------");
        Person person1 = new Person("Misha", 850);
        set1.add(person1);
        for (Person person : set1) {
            System.out.println(person + " " + person.hashCode());
        }

        System.out.println("---------------------------------");

        set1.remove(new Person("Vasya", 700));
        for (Person person : set1) {
            System.out.println(person + " " + person.hashCode());
        }

        //не додупускается изменять поля объектов уже хранящихся в HashSet
        //так как они будут иметь уже другой хеш код и не будет найдены
        person1.setSalary(1500);//через левую ссылку изменили объект
        //который хранится в hashSet

        System.out.println("-------------");
        //изменный объект не будет найден
        System.out.println(set1.contains(person1));
        set1.remove(new Person("Misha", 850));
        for (Person person : set1) {
            System.out.println(person + " " + person.hashCode());
        }

    }
}
