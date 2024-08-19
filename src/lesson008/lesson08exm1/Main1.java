package lesson008.lesson08exm1;

import lesson008.lesson08exm1.model.Person;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Igor"),
                new Person("Vasya"),
                new Person("Grisha"),
                new Person("Ira")
        };

        System.out.println(Arrays.toString(people));

        for (Person person : people) {
            System.out.println(person);
        }

    }
}
